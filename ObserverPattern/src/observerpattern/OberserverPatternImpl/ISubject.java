package observerpattern.OberserverPatternImpl;

public interface ISubject {

    public void register(IObserver observer);

    public void remove(IObserver observer);

    public void notifyObservers(String message);
}
