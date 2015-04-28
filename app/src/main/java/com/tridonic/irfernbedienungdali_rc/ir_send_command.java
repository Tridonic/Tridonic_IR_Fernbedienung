package com.tridonic.irfernbedienungdali_rc;

import android.content.Context;
import android.hardware.ConsumerIrManager;

/**
 * Created by dario.duff on 25.02.2015.
 * Class to ckeck IR emitter and transmit commands with 36kHz
 */
public class ir_send_command {
    protected Context context;
    protected ConsumerIrManager mCIR;

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
        mCIR.transmit(36000,pattern);
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
