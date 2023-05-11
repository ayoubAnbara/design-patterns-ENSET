package anbara.composite.example2;
public abstract class Component {
    protected String message;
    protected int level;

    public Component(String message) {
        this.message = message;
    }
    public abstract void print();
}
