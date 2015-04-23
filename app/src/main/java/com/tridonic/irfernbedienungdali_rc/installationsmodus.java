package com.tridonic.irfernbedienungdali_rc;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class installationsmodus extends Activity {
    public Spinner spinner;
    public Button motion_active,motion_inactive,motion_onlyoff,light_active,light_inactive,next,previous,assign,remove,start_adress,exit;
    public ir_send_command ir = new ir_send_command();
    public commands command = new commands();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.installationsmodus);

        // spinner = (Spinner) findViewById(R.id.layer_chooser);
        // addLayer();
        //------------------------------------------------------
        //Zuweisung aller Buttons
        motion_active   = (Button) findViewById(R.id.motion_active);
        motion_inactive = (Button) findViewById(R.id.motion_inactive);
        motion_onlyoff  = (Button) findViewById(R.id.motion_onlyoff);
        light_active    = (Button) findViewById(R.id.light_active);
        light_inactive  = (Button) findViewById(R.id.light_inactive);
        next            = (Button) findViewById(R.id.next);
        previous        = (Button) findViewById(R.id.previous);
        assign          = (Button) findViewById(R.id.assign);
        remove          = (Button) findViewById(R.id.remove);
        start_adress    = (Button) findViewById(R.id.start_adress);
        exit            = (Button) findViewById(R.id.exit);
        //-------------------------------------------------------

        //Context an IR Class übermitteln
        final Context context = this.getApplicationContext();
        ir.transmitContext(context);

        motion_active.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,7);
                ir.send(pattern);

            }
        });

        motion_inactive.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int[] pattern = command.getcommands(18,9);
                ir.send(pattern);

            }
        });

        motion_onlyoff.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,8);
                ir.send(pattern);

            }
        });

        light_active.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,1);
                ir.send(pattern);

            }
        });

        light_inactive.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,11);
                ir.send(pattern);

            }
        });

        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,2);
                ir.send(pattern);

            }
        });

        previous.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,3);
                ir.send(pattern);

            }
        });

        assign.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,4);
                ir.send(pattern);

            }
        });

        remove.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,5);
                ir.send(pattern);

            }
        });

        start_adress.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,6);
                ir.send(pattern);

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int[] pattern = command.getcommands(18,1);
                ir.send(pattern);

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
}
