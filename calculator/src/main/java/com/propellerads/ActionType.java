package main.java.com.propellerads;

public enum ActionType {
    Minus("Вычитание"),
    Summ("Сложение"),
    Multiple("Умножение"),
    Divide("Деление");

    private String typename;



    ActionType(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return typename;
    }
}
