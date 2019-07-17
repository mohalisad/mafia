package com.mafia.actions;

import com.mafia.roles.Person;

public class ActionHeal extends ActionBase {
    public ActionHeal(Person caster){
        super(caster, ActionAffect.ONE_PERSON, ActionType.HEAL, false);
    }

    @Override
    public String getLog() {
        if (!isUsed())
            return null;
        return getCaster().getTypeInString() + " healed " + getPerson1().getTypeInString();
    }
}
