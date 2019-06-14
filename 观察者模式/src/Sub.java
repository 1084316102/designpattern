import java.util.Enumeration;
import java.util.Vector;

public abstract class Sub implements Subject {
    private Vector<Observer> vector = new Vector<
            >();
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        Enumeration<Observer> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            enumeration.nextElement().update(1);
        }
    }

    @Override
    public void act() {

    }
}
