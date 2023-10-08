/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class Clock implements Runnable{
    JLabel clockLabel; 

    public Clock(JLabel clockLabel) {
        this.clockLabel = clockLabel;
    }
    
    
    
    @Override
    public void run() {
        while (true){
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
            clockLabel.setText(dateFormat.format(now));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
