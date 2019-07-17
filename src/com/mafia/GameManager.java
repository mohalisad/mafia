package com.mafia;

import com.mafia.roles.Person;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    List<Person> people = new ArrayList<Person>();
    GameStats stats = new GameStats();

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
        stats.resetStat();
        for (Person p : people){
            stats.consider(p);
        }
    }
}
