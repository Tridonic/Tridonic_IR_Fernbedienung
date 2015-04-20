package com.tridonic.irfernbedienungdali_rc;

/**
 * Created by dario.duff on 20.04.2015.
 * Das File beinhalted alle Commands die verwendet werden
 */
public class commands {
    public final int K = 461;   //461ms Kurze Dauer
    public final int L = 923;   //923 Lange Dauers
    public int[] getcommands(int layer, int command){
        int[] returner = {};
        switch (layer){
            case 1:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,}; break;
                }
                break;

            case 2:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,}; break;
                }
                break;



            case 3:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,}; break;
                }
                break;



            case 4:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,}; break;
                }
                break;



            case 5:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,L,K}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,K,K,}; break;
                }
                break;



            case 6:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,K,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,L,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,L,K}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,L,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                }
                break;



            case 7:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,L,K}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,K,K,K,}; break;
                }
                break;



            case 8:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,L,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,L,K,K,K,}; break;
                }
                break;



            case 9:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,L,K}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,K,K,K,}; break;
                }
                break;



            case 10:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,L,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,L,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,L,K,K,K,}; break;
                }
                break;




            case 11:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,}; break;
                }
                break;



            case 12:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,L,K,K,K,}; break;
                }
                break;



            case 13:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,L,K}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K,K,K,}; break;
                }
                break;



            case 14:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,L,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,L,K,K,K,}; break;
                }
                break;



            case 15:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K,K,K,}; break;
                }
                break;



            case 16:
                switch(command){
                    case 1: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,L,K,}; break;
                    case 2: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,K,K,}; break;
                    case 3: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 4: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 5: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,L,K}; break;
                    case 6: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,K,K,}; break;
                    case 7: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,K,K,}; break;
                    case 8: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,L,K,}; break;
                    case 9: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,}; break;
                    case 10: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,L,K,K,K,}; break;
                    case 11: returner = new int[] {2664,900,K,900,K,K,K,K,K,888,1222,888,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,K,L,K,K,K,}; break;
                }
                break;


        }


        return returner;
    }
}
