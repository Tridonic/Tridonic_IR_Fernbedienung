package com.tridonic.irfernbedienungdali_rc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class programmiermodus extends Activity {

    public commands command = new commands();
    public Spinner spinner;
    public Button previous,next,auto,save0,save1,up,down,onoff;
    public ir_send_command ir = new ir_send_command();
    public boolean hilfeAktiv = false;      //Aktivität von hilfe
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programmiermodus);

        //Context an IR Class übergeben
        final Context context = this.getApplicationContext();
        ir.transmitContext(context);

        //------------------------------------------------------
        //Zuweisung aller Buttons
        auto    = (Button) findViewById(R.id.auto);
        save1   = (Button) findViewById(R.id.save1);
        save0   = (Button) findViewById(R.id.save0);
        up   = (Button) findViewById(R.id.up);
        down    = (Button) findViewById(R.id.down);
        next    = (Button) findViewById(R.id.next);
        previous= (Button) findViewById(R.id.previous);
        onoff   = (Button) findViewById(R.id.onoff);
        //------------------------------------------------------

        auto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(hilfeAktiv == true){
                    alertView("Hilfe hier anzeigen","Hilfe");
                }else {
                    int[] pattern = command.getcommands(17, 4);
                    ir.send(pattern);
                }
            }
        });
        save1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(hilfeAktiv == true){
                    alertView("Hilfe hier anzeigen","Hilfe");
                }else {
                    int[] pattern = command.getcommands(17, 6);
                    ir.send(pattern);
                }
            }
        });

        save0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(hilfeAktiv == true){
                    alertView("Hilfe hier anzeigen","Hilfe");
                }else {
                    int[] pattern = command.getcommands(17, 5);
                    ir.send(pattern);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(hilfeAktiv == true){
                    alertView("Hilfe hier anzeigen","Hilfe");
                }else {
                    int[] pattern = command.getcommands(17, 7);
                    ir.send(pattern);
                }
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(hilfeAktiv == true){
                    alertView("Hilfe hier anzeigen","Hilfe");
                }else {
                    int[] pattern = command.getcommands(17, 11);
                    ir.send(pattern);
                }
            }
        });

        onoff.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(hilfeAktiv == true){
                    alertView("Hilfe hier anzeigen","Hilfe");
                }else {
                    int[] pattern = command.getcommands(17, 1);
                    ir.send(pattern);
                }
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(hilfeAktiv == true){
                    alertView("Hilfe hier anzeigen","Hilfe");
                }else {
                    int[] pattern = command.getcommands(17, 2);
                    ir.send(pattern);
                }
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(hilfeAktiv == true){
                    alertView("Hilfe hier anzeigen","Hilfe");
                }else {
                    int[] pattern = command.getcommands(17, 3);
                    ir.send(pattern);
                }
            }
        });

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

            Intent myIntent = new Intent(programmiermodus.this, UserSettingActivity.class);
            programmiermodus.this.startActivity(myIntent);
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
        //holt die Einstllungen
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        hilfeAktiv = sharedPrefs.getBoolean("prefHelpMode",false);


        AlertDialog.Builder builder = new AlertDialog.Builder(programmiermodus.this);
        builder.setMessage("Die Funktionen im Programmiermodus können das System ungewollt modifizieren und ist nur für fortgeschrittene Benutzer geeignet.\n\nWollen sie fortfahren?").setTitle("Achtung!").setPositiveButton("Ja", dialogClickListener)
                .setNegativeButton("Nein", dialogClickListener).show();
    }
    private void alertView( String message, String title) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(programmiermodus.this);

        dialog.setTitle(title)
                .setMessage(message)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                    }
                }).show();
    }
}
