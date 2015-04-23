package com.tridonic.irfernbedienungdali_rc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class programmiermodus extends Activity {
    public ir_send_command ir = new ir_send_command();
    public Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programmiermodus);

        // spinner = (Spinner) findViewById(R.id.layer_chooser);
        // addLayer();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addLayer() {
        List<String> list = new ArrayList<String>();
        list.add("layer 1");
        list.add("layer 2");
        list.add("layer 3");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

    }

    //On resume wird aufgerufen, wenn die activity wider in den Vordergrud gebracht wird.
    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        MainActivity.mTabHost.setCurrentTab(0);
                        break;
                }
            }
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(programmiermodus.this);
        builder.setMessage("Die Funktionen im Programmiermodus können das System ungewollt modifizieren und ist nur für fortgeschrittene Benutzer geeignet.\n\nWollen sie fortfahren?").setTitle("Achtung!").setPositiveButton("Ja", dialogClickListener)
                .setNegativeButton("Nein", dialogClickListener).show();
    }
}
