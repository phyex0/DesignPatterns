package observerpattern.OberserverPatternImpl;

import java.util.ArrayList;
import java.util.List;

public class Server implements ISubject {

    private List<IObserver> observerList;

    public Server() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        boolean result = this.observerList.remove(observer);
        if (!result) {
            System.out.println("The following observer is not exist.");
        }
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver observer : this.observerList) {
            observer.update(message);
        }
    }

    public void statusChanges(String message) {
        notifyObservers(message);
    }
}
