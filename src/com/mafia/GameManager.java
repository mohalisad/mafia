package com.mafia;

import com.mafia.roles.Person;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    List<Person> people = new ArrayList<Person>();

    private int[] statAhriman = new int[2], statPahlevan = new int[2], statMostaghel = new int[2];

    private void startGame(){
        init_phase();
        while (true){
            day_phase();
            night_phase();
        }
    }

    private void init_phase(){

    }

    private void day_phase(){

    }

    private void night_phase(){

    }

    private void calcStats(){
        int[] selectedGroup = null;
        statAhriman[0]   = 0;
        statAhriman[1]   = 0;
        statPahlevan[0]  = 0;
        statPahlevan[1]  = 0;
        statMostaghel[0] = 0;
        statMostaghel[1] = 0;
        for (Person p : people){
            switch (p.getFaction()) {
                case AHRIMAN:
                    selectedGroup = statAhriman;
                    break;
                case PAHLEVAN:
                    selectedGroup = statPahlevan;
                    break;
                case MOSTAGHEL:
                    selectedGroup = statMostaghel;
                    break;
            }
            selectedGroup[p.isDead()? 1: 0]++;
        }
    }
}
