package com.tridonic.irfernbedienungdali_rc;
///////////////////////////////////////////////////////////////////////////////
//
// Main Class File:  MainActivity.java
// File:             UserSettingsActivity.java
// Date:             30.04.2015
//
// Author:           Dario Duff Copyright (2015). All rights reserved.
//
// Layout:           keines
//
// Function:
// Zuständig für die Einstellungen.
//
//////////////////////////// 51 columns wide //////////////////////////////////

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.MenuItem;

public class UserSettingActivity extends PreferenceActivity {
    //public SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setTitle("Einstellungen");
        addPreferencesFromResource(R.xml.settings);
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        Preference myPref = (Preference) findPreference("madein");
        myPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                //open browser or intent here
                alertView("(c)2015 by Dario Duff.\nSupport: support@duff.li \n\nMade in Glarus, Switzerland.","Info");

                return true;
            }
        });

	}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id == android.R.id.home){
            finish();
            return true;
        }
        return false;
    }



    public boolean getProgrammierModus() {
        return true;//sharedPrefs.getBoolean("prefProgrammier",false);
    }
    public boolean getInstallationsModus() {
        return true;//sharedPrefs.getBoolean("prefInstallation",false);
    }
    public void alertView( String message, String title) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(UserSettingActivity.this);

        dialog.setTitle(title)
                .setMessage(message)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                    }
                }).show();
    }
}