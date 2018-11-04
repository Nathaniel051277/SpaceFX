package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class TimeHandler {
    Timer time;
    public TimeHandler(int delay){
        time = new Timer(delay, (ActionListener) new TimeHandler());
    }

    public TimeHandler() {

    }
}
