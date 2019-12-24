package main.java.com.propellerads.impl;

import main.java.com.propellerads.Action;
import main.java.com.propellerads.ActionType;
import main.java.com.propellerads.IllegalInputDataException;

public class DivideAction implements Action {
    @Override
    public int invoke(int firstArg, int secondArg) throws IllegalInputDataException {
        if (secondArg == 0) {
            throw new IllegalInputDataException("На ноль делить нельзя :(");
        }

        return firstArg / secondArg;
    }

    @Override
    public ActionType getActionType() {
        return ActionType.Divide;
    }
}
