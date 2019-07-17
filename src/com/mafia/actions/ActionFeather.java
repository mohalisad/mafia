package com.mafia.actions;

import com.mafia.roles.Person;

public class ActionFeather extends ActionBase {
    int featherNumber;
    public ActionFeather(Person caster, int featherNumber){
        super(caster, ActionAffect.GLOBAL, null, true);
        this.featherNumber = featherNumber;
        switch (featherNumber){
            case 1:
                type = ActionType.FEATHER1;
                break;
            case 2:
                type = ActionType.FEATHER2;
                break;
            case 3:
                type = ActionType.FEATHER3;
                break;
        }
    }

    @Override
    public String getLog() {
        if (!isUsed())
            return null;
        return getCaster().getTypeInString() + " used feather" + String.valueOf(featherNumber);
    }
}
