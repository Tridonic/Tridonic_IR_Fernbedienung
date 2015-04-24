package com.tridonic.irfernbedienungdali_rc;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuItem;

public class UserSettingActivity extends PreferenceActivity {
    //public SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Einstellungen");
        addPreferencesFromResource(R.xml.settings);


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
}
