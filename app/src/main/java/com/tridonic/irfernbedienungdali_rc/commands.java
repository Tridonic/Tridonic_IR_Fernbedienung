package com.tridonic.irfernbedienungdali_rc;
///////////////////////////////////////////////////////////////////////////////
//
// Main Class File:  MainActivity.java
// File:             programmiermodus.java
// Date:             30.04.2015
//
// Author:           Dario Duff Copyright (2015). All rights reserved.
//
// Layout:           programmiermodus.xml
//
// Function:
// Beinhaltet alle IR Befehle die verwednet werden. Beinhalted insgesammt 195 Befehle.
// Abgerufen werden sie mit der Layer nummer und die Nummer von dem dazugehörigen Befehl
//
//////////////////////////// 343 columns wide //////////////////////////////////
public class commands {
    public final int K = 461;   //461ms Kurze Dauer
    public final int L = 923;   //923 Lange Dauers
   // public final int K = 446;   //461ms Kurze Dauer
   // public final int L = 800;   //923 Lange Dauers


    public int create(){
        boolean toggler = true;
        int aa = 1;
        int resultat = 0;
        int mask = 0B00000001;

        for(int i = 0;i<6;i++){
            resultat = resultat & (mask & aa);
            resultat = resultat << 1;
            aa = aa>>1;
        }

      return resultat;
    }


    public int[] getcommands(int layer, int command){
        int[] returner = {};




        switch (layer){
            case 1:   //Layer 1
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 8 : returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 9 : returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,}; break;
                }
                break;

            case 2: //Layer 2
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,K}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,L}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,K,K}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,K}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,}; break;
                }
                break;

            case 3: //Layer 3
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,L,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,L,L,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,L,K,K,K,}; break;
                }
                break;

            case 4: //Layer 4
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,L,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,K,}; break;
                    case 10: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,L,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,}; break;
                }
                break;

            case 5: //Layer 5
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,L,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,L,L,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,L,K,K,K,}; break;
                }
                break;

            case 6: //Layer 6
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,L,L,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,L,K}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,L,K,K,L,K,}; break;
                    case 10: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,L,L,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,L,K,K,K,}; break;
                }
                break;

            case 7: //Layer 7
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,L,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,K,K,L,K,}; break;
                    case 10: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,L,L,K,}; break;
                    case 11: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,L,K,K,K,}; break;
                }
                break;

            case 8: //Layer 8
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,L,K, }; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,L,L,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,L,K}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,L,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,L,K,}; break;
                }
                break;

            case 9: //Layer 9
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,K,K,L,K}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,L,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,L,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,L,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,L,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,L,K,K,K,}; break;
                }
                break;

            case 10:    //Layer 10
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,K,L,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,L,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,L,L,L,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,L,K,K,L,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,L,L,K,K}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,L,K,K,K,}; break;
                }
                break;

            case 11:    //Layer 11
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,L,L,L}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,L,K,K,L,K};break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,K,K,L,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,L,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,L,L,K,K,L,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,L,L,L,L,K,K}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,L,L,L,L,K,K,K}; break;
                }
                break;

            case 12:    //Layer 12
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,K,K,K,K,L,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,K,K,L,K,K,K,
                            }; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,L,L,K,K,K,
                    }; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,K,K,L,K,K,L,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,L,L,L,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,K,K,L,L,L,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,L,L,K,K,K,K,L,L,K,K,K,
                    }; break;
                }
                break;

            case 13:    //Layer 13
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,K,K,K,K,L,K}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,K,K,L,K,K,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,K,K,L,L,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 11: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,L,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,K,K,L,K}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,L,L,K,}; break;
                    case 10: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,L,L,K,}; break;
                }
                break;

            case 14:    //Layer 14
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,L,L,K,K,K}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,L,L,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,L,K,K,L,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,K,K,L,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,L,L,K,K,K,K,K,}; break;
                    case 11: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,L,K,K,K,}; break;
                    case 10: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,L,L,K,K,}; break;
                }
                break;

            case 15:    //Layer 15
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,K,K,K,K,L,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,K,K,L,K,K,K,}; break;
                    case 11: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,L,L,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,L,K,K,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,K,K,K,K,K,}; break;
                    case 10: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,L,L,L,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,L,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,L,K,K,L,K}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,L,K,K,K,K,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,K,K,L,L,K,}; break;
                }
                break;



            case 16:    //Layer 16
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,K,K,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,L,K,K,K,}; break;
                    case 11: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,L,L}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,L,K,K,L,K,}; break;
                    case 10: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,L,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,L,L,K,}; break;
                }
                break;

            case 17:   //Layer 1
                switch(command){
                    case 1: returner = new int[]  {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,K,K,L}; break;
                    case 2: returner = new int[]  {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[]  {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,L,K,K,}; break;
                    case 4: returner = new int[]  {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[]  {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,L,L,}; break;
                    case 6: returner = new int[]  {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,K,K,L,K,}; break;
                    case 7: returner = new int[]  {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,K,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,L,L,K,K,}; break;
                }
                break;


            case 18:   //Layer 1
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,L,L,L,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,}; break;
                    case 8 : returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 9 : returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,L,K,K,L,}; break;
                    case 10: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,L,L,L,K,}; break;
                    case 11: returner = new int[]{2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,L,L,K,K,}; break;
                }
                break;

        }


        return returner;
    }
}