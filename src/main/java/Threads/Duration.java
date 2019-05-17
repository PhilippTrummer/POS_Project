package Threads;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Duration extends JPanel implements Runnable {

    private DigitLabel[] digits = new DigitLabel[6];
    private String diff;
    private boolean operation = true;

    public void setOperation(boolean operation) {
        this.operation = operation;
    }

    public String getDiff() {
        return diff;
    }

    /**
     *
     */
    public Duration() {
        this.diff = "00:00:00";
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(1, 9));

        for (int i = 0; i < digits.length; i++) {
            digits[i] = new DigitLabel();

            try {
                digits[i].setDigit(0);
            } catch (Exception ex) {
                Logger.getLogger(Duration.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.add(digits[i]);
            if (i == 1 || i == 3) {
                JLabel label = new JLabel(":");
                label.setForeground(Color.RED);
                label.setFont(new Font("Arial", Font.PLAIN, 50));
                this.add(label);
            }
        }
    }

    /**
     *
     */
    @Override
    public void run() {
        LocalTime time = LocalTime.now();
        LocalTime now = null;
        while (operation) {
            try {

                now = LocalTime.now().minusHours(time.getHour());
                now = now.minusMinutes(time.getMinute());
                now = now.minusSeconds(time.getSecond());

                digits[0].setDigit(now.getHour() / 10);
                digits[1].setDigit(now.getHour() % 10);
                digits[2].setDigit(now.getMinute() / 10);
                digits[3].setDigit(now.getMinute() % 10);
                digits[4].setDigit(now.getSecond() / 10);
                digits[5].setDigit(now.getSecond() % 10);

            } catch (Exception ex) {
                Logger.getLogger(Duration.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Duration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        diff = now.getHour() + ":";
        diff += now.getMinute() + ":";
        diff += now.getSecond() + "";

        this.removeAll();
    }
}
