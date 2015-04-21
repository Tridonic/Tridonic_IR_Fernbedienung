package com.tridonic.irfernbedienungdali_rc;
//File: 	tabhost.java
//design: 	none
//date:		5.08.14
//(c) 2014 by Dario Duff
//Tab host file. Hosts the tabs for the different activity's. 
////////////////////////////////////////////////////////////////////////////////

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.TabHost;
import android.widget.TextView;


//File: 	MainActivity.java
//design: 	activity_main.xml
//date:		22.05.14
//(c) 2014 by Dario Duff
//Main form, allows to connect to Bluetooth device
////////////////////////////////////////////////////////////////////////////////
public class MainActivity extends TabActivity {
    private Menu menu;

    public float lastX;
    public TabHost mTabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hide the Keyboard
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //setContentView(R.layout.activity_main);
        //set up a Tab host with 2 tabs, each tab has his own activity. 1: MainActivity 2:settings
        mTabHost = getTabHost();
        mTabHost.getTabWidget().setBackgroundColor(getResources().getColor(R.color.action_bar_color));
        getActionBar().setElevation(0);
        mTabHost.getTabWidget().setElevation(15);
        //Creates the different tabs. Add new Tab like below:
        mTabHost.addTab(mTabHost.newTabSpec("Standard").setIndicator("Standard").setContent(new Intent(this  ,standardmodus.class )));
        mTabHost.addTab(mTabHost.newTabSpec("Installation").setIndicator("Installation").setContent(new Intent(this ,installationsmodus.class )));
        mTabHost.addTab(mTabHost.newTabSpec("Programmier").setIndicator("Programm").setContent(new Intent(this ,programmiermodus.class )));

        //Tab Color management
        for(int i=0;i<mTabHost.getTabWidget().getChildCount();i++)
        {
            TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
            tv.setTextColor(Color.parseColor("#ffffff"));
        }
        TextView tv = (TextView) mTabHost.getCurrentTabView().findViewById(android.R.id.title); //for Selected Tab
        tv.setTextColor(Color.parseColor("#000000"));
        mTabHost.setCurrentTab(0);

        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener(){
            @Override
            public void onTabChanged(String tabId) {
                for(int i=0;i<mTabHost.getTabWidget().getChildCount();i++)
                {
                    TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
                    tv.setTextColor(Color.parseColor("#ffffff"));
                }
                TextView tv = (TextView) mTabHost.getCurrentTabView().findViewById(android.R.id.title); //for Selected Tab
                tv.setTextColor(Color.parseColor("#000000"));

            }});

    }
}


