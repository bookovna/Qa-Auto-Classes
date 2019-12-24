package main.java.com.propellerads;

import main.java.com.propellerads.impl.MinusAction;
import main.java.com.propellerads.impl.MultipleAction;
import main.java.com.propellerads.impl.NoFartException;
import main.java.com.propellerads.impl.SummAction;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    List<Action> actionsList = Arrays.asList(
            new MinusAction(),
            new SummAction(),
            new MultipleAction());


    public void start() {
        JOptionPane.showMessageDialog(
                null,
                "Наш первый калькулятор!",
                "Приветствие",
                JOptionPane.INFORMATION_MESSAGE
        );
        ActionType selectedAction = (ActionType) JOptionPane.showInputDialog(
                null,
                "Выберите операцию:",
                "Выбор",
                JOptionPane.QUESTION_MESSAGE,
                null,
                convertActionsToActionTypes().toArray(),
                convertActionsToActionTypes().toArray()[0]
        );
        int firstArgument = repeatableRead("Введите первое число");
        int secondArgument = repeatableRead("Введите второе число");
        int result = 0;
        for (Action action : actionsList) {
            if (selectedAction.equals(action.getActionType())) {
                result = action.invoke(firstArgument, secondArgument);
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "Результат: " + result,
                "Результат",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private List<ActionType> convertActionsToActionTypes() {

        List<ActionType> result = new ArrayList<>();


        for (Action action : actionsList) {
            result.add(action.getActionType());
        }
        return result;
    }

    private int repeatableRead(String inputName) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(inputName));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Вы ввели не число :(", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}