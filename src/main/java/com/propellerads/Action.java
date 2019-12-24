package main.java.com.propellerads;

public interface Action {

    int invoke(int firstArg, int secondArg);

    ActionType getActionType();
}
