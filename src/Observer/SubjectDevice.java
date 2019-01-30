package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectDevice {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    protected void notify(Object od){
        for(Observer observer : observers){
            observer.update(this, od);
        }
    }
}
