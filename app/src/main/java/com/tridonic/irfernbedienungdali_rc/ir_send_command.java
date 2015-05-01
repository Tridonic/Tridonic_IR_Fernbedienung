package com.tridonic.irfernbedienungdali_rc;
///////////////////////////////////////////////////////////////////////////////
//
// Main Class File:  MainActivity.java
// File:             ir_send.command.java
// Date:             30.04.2015
//
// Author:           Dario Duff Copyright (2015). All rights reserved.
//
// Layout:           keines
//
// Function:
// zuständig für das versenden von IR Befehlen. Bevor etwas
// versendet werden kann, muss der Context mit transmitContext(Context context);
// übergeben werden. von Da an kann ban Befehle versenden.
//
//////////////////////////// 66 columns wide //////////////////////////////////

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.ConsumerIrManager;
public class ir_send_command {
    protected Context context;
    protected ConsumerIrManager mCIR;

    //Überprüfft ob ein IR Emitter verfügbar ist. gibt den Frequenzbereich zurück oder "No IR transmitter found"
    public void transmitContext(Context context){
        //saves context from Application
        this.context = context.getApplicationContext();
        mCIR = (ConsumerIrManager) context.getSystemService(context.CONSUMER_IR_SERVICE);   //Init the IR service
    }
    public boolean getEmitter() {
	
        //check if emitter is installed
		//Returns true or false
        boolean answere = false;
        if (mCIR.hasIrEmitter()) {
            answere = true;
        }
        return answere;
    }
    public void send(int[] pattern){
            //Sends the given command with a freq of 36000 Hz
            mCIR.transmit(36000, pattern);
    }

    public String getFrequencies(){
        //Returns the Carrier Frequency of the Blaster
        String response = "";
        StringBuilder b = new StringBuilder();
        if (!mCIR.hasIrEmitter()) {
            response = "No IR Emitter found!";
            //Log.e(TAG, "No IR Emitter found!\n");

        }
        // Get the available carrier frequency ranges
		//Returns String
        ConsumerIrManager.CarrierFrequencyRange[] freqs = mCIR.getCarrierFrequencies();
        b.append("IR Carrier Frequencies:\n");
        for (ConsumerIrManager.CarrierFrequencyRange range : freqs) {
            b.append(String.format("%d - %d", range.getMinFrequency(),
                    range.getMaxFrequency()));
        }
        response = b.toString() + " Hz.";
        return response;
    }
}