package com.mafia;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    List<Person> people = new ArrayList<Person>();

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
}
