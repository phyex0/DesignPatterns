package observerpattern.OberserverPatternImpl.Devices;

import observerpattern.OberserverPatternImpl.IDisplayMessage;
import observerpattern.OberserverPatternImpl.IObserver;
import observerpattern.OberserverPatternImpl.ISubject;

import javax.swing.JTextArea;

public class TV implements IObserver, IDisplayMessage {

    private ISubject presentational;
    private JTextArea textArea;

    private String message;

    public TV(ISubject presentational, JTextArea textArea) {
        this.presentational = presentational;
        this.textArea = textArea;
        this.presentational.register(this);
    }

    @Override
    public void display() {
        this.message = "TV message is :" + this.message;
        System.out.println(this.message);
        this.textArea.setText(message);
    }

    @Override
    public void update(String msg) {
        this.message = msg;
        display();
    }
}
