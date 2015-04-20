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


public class standardmodus extends Activity {
    public ir_send_command ir = new ir_send_command();
    public commands command = new commands();
    public Spinner spinner;
    public Button direct100,direct50,direct25,direct12,direct6,auto,scene0,scene1,onoff,up,down;    //Variabeln für Alle Buttons die verwendet werden im Layout
    public final int K = 461;   //461ms Kurze Dauer
    public final int L = 923;   //923 Lange Dauers
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standardmodus);

        //------------------------------------------------------
        //Zuweisung alles Buttons
        spinner = (Spinner) findViewById(R.id.layer_chooser);
        direct100 = (Button) findViewById(R.id.direct100);
        direct50 = (Button) findViewById(R.id.direct50);
        direct25 = (Button) findViewById(R.id.direct25);
        direct12 = (Button) findViewById(R.id.direct12);
        direct6 = (Button) findViewById(R.id.direct6);
        auto = (Button) findViewById(R.id.auto);
        scene0 = (Button) findViewById(R.id.szene0);
        scene1 = (Button) findViewById(R.id.szene1);
        onoff = (Button) findViewById(R.id.on_off);
        up = (Button) findViewById(R.id.up);
        down = (Button) findViewById(R.id.down);
        //--------------------------------------------------

        addLayer();
        final Context context = this.getApplicationContext();
        ir.transmitContext(context);

        direct100.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int[] pattern = command.getcommands(1);
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
        //Fügt die Layers hinzu
        List<String> list = new ArrayList<String>();
        for(int i=1;i<17;i++){
            list.add("Layer "+i);
        }

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

    }
}
