package com.mafia;

import com.mafia.roles.Person;
import com.mafia.roles.PersonFaction;

import java.util.Arrays;

public class GameStats {
    private int[][] counter = new int[3][2];
    private Person hasSword = null;

    public GameStats(){
        resetStat();
    }

    public void resetStat(){
        for (int[] row: counter){
            Arrays.fill( row, 0);
        }
        hasSword = null;
    }

    public void consider(Person p){
        incrementCounter(p.getFaction(),p.isDead());
        if (p.hasSword()){
            hasSword = p;
        }
    }

    private void incrementCounter(PersonFaction faction, boolean isItDead){
        counter[faction.ordinal()][isItDead? 1: 0]++;
    }
}
