package com.tridonic.irfernbedienungdali_rc;
///////////////////////////////////////////////////////////////////////////////
//
// Main Class File:  MainActivity.java
// File:             MainActivity.java
// Date:             30.04.2015
//
// Author:           Dario Duff Copyright (2015). All rights reserved.
//
// Layout:           keines
//
// Function:
// Hosted den Tabhost jenachdem welche Tabs in den EInstellungen ausgewählt wurden.
//
//////////////////////////// 123 columns wide //////////////////////////////////

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity{
    private Menu menu;
    public ir_send_command ir = new ir_send_command();

    public float lastX;
    public static TabHost mTabHost;
    private UserSettingActivity settings = new UserSettingActivity();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hide the Keyboard
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds   to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Intent myIntent = new Intent(MainActivity.this, UserSettingActivity.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onResume(){
        super.onResume();
        final Context context = this.getApplicationContext();
        //Context an IR Class übermitteln

        ir.transmitContext(context);
        if(ir.getEmitter() == false){
            alertView("Ihr Gerät besitzt keine IR-Diode. Das App wird nicht funktionieren.","Fehler");

        }



        //Holt die einstellungen und weist sie eienr Variable zu
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean help_active,modiProgrammier,modiInstall;
        modiProgrammier = sharedPrefs.getBoolean("prefProgrammier",false);
        modiInstall = sharedPrefs.getBoolean("prefInstallation", false);
        help_active = sharedPrefs.getBoolean("prefHelpMode",false);
        if(help_active == true) {

            if(Integer.valueOf(android.os.Build.VERSION.SDK) > 19){
                ActionBar bar = getActionBar();
                bar.setTitle("DALI RC Hilfe Modus");
                //change Status Bar color
                getWindow().setStatusBarColor(getResources().getColor(R.color.action_bar_color_help));
            }

        }else{
            ActionBar bar = getActionBar();
            bar.setTitle("DALI-RC IR Fernbedienung");
            if(Integer.valueOf(android.os.Build.VERSION.SDK) > 19) {
                //change Status Bar color
                getWindow().setStatusBarColor(getResources().getColor(R.color.notification_bar));
            }
            //bar.setBackgroundDrawable(new ColorDrawable(R.color.action_bar_color));
        }


        mTabHost = getTabHost();
        mTabHost.getTabWidget().setBackgroundColor(getResources().getColor(R.color.action_bar_color));





        //Überprüft das API level. wird nur ausgeführt wenn das app auf einem Gerät mit API level grösser als 19 läuft
        if(Integer.valueOf(android.os.Build.VERSION.SDK) > 19){
            //Setzt die schatten der Action bars
            getActionBar().setElevation(0);
            mTabHost.getTabWidget().setElevation(15);
        }
        getTabHost().setCurrentTab(0);
        getTabHost().clearAllTabs();

        //Creates the different tabs. Add new Tab like below:

        mTabHost.addTab(mTabHost.newTabSpec("Standard").setIndicator("Standard").setContent(new Intent(this  ,standardmodus.class )));
        if(modiInstall == true)
        mTabHost.addTab(mTabHost.newTabSpec("Installation").setIndicator("Installation").setContent(new Intent(this ,installationsmodus.class )));
        if(modiProgrammier == true)
        mTabHost.addTab(mTabHost.newTabSpec("Programmier").setIndicator("Programm").setContent(new Intent(this ,programmiermodus.class )));

        //Tab Color management-----------------------
        for(int i=0;i<mTabHost.getTabWidget().getChildCount();i++)
        {
            TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
            tv.setTextColor(Color.parseColor("#4C9BE0"));
        }
        TextView tv = (TextView) mTabHost.getCurrentTabView().findViewById(android.R.id.title); //for Selected Tab
        tv.setTextColor(Color.parseColor("#FFFFFF"));
        mTabHost.setCurrentTab(0);

        //----------------------------------------

        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener(){
            @Override
            public void onTabChanged(String tabId) {
                for(int i=0;i<mTabHost.getTabWidget().getChildCount();i++)
                {
                    TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
                    tv.setTextColor(Color.parseColor("#4C9BE0"));
                }
                TextView tv = (TextView) mTabHost.getCurrentTabView().findViewById(android.R.id.title); //for Selected Tab
                tv.setTextColor(Color.parseColor("#FFFFFF"));

            }});


    }
    public void alertView( String message, String title) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

        dialog.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("Beenden", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                        onDestroy();
                        finish();
                    }
                }).show();
    }
}