package com.tridonic.irfernbedienungdali_rc;
//File: 	tabhost.java
//design: 	none
//date:		5.08.14
//(c) 2014 by Dario Duff
//Tab host file. Hosts the tabs for the different activity's. 
////////////////////////////////////////////////////////////////////////////////

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.TabHost;

import com.tridonic.irfernbedienungdali_rc.R;
import com.tridonic.irfernbedienungdali_rc.installationsmodus;
import com.tridonic.irfernbedienungdali_rc.programmiermodus;
import com.tridonic.irfernbedienungdali_rc.standardmodus;


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
        mTabHost.addTab(mTabHost.newTabSpec("Programmier").setIndicator("Programmier").setContent(new Intent(this ,programmiermodus.class )));

        mTabHost.setCurrentTab(0);
    }
}


