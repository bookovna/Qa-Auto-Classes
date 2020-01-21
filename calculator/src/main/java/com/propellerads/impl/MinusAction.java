package main.java.com.propellerads.impl;

import main.java.com.propellerads.Action;
import main.java.com.propellerads.ActionType;

public class MinusAction implements Action {

    @Override
    public int invoke(int firstArg, int secondArg) {

        return firstArg - secondArg;
    }

    @Override
    public ActionType getActionType() {
        return ActionType.Minus;
    }
}
