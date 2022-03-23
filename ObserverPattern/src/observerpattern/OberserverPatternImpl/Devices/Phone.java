package observerpattern.OberserverPatternImpl.Devices;

import observerpattern.OberserverPatternImpl.IDisplayMessage;
import observerpattern.OberserverPatternImpl.IObserver;
import observerpattern.OberserverPatternImpl.ISubject;

import javax.swing.JTextArea;

public class Phone implements IObserver, IDisplayMessage {
    
    private ISubject presentational;
    private JTextArea textArea;
    
    private String message;
    
    public Phone(ISubject presentational, JTextArea textArea) {
        this.presentational = presentational;
        this.textArea = textArea;
        this.presentational.register(this);
    }
    
    @Override
    public void display() {
        this.message = "Phone message is :" + this.message;
        System.out.println(message);
        this.textArea.setText(this.message);
    }
    
    @Override
    public void update(String msg) {
        this.message = msg;
        display();
    }
}
