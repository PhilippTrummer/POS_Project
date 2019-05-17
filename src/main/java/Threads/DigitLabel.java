package Threads;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DigitLabel extends JLabel {

    public void setDigit(int digit) throws Exception {
        if (digit < 0 || digit > 9) {
            throw new Exception("Out of range");
        }
        switch (digit) {
            case 0:
                this.setIcon(new ImageIcon("./bilder/0.PNG"));
                break;
            case 1:
                this.setIcon(new ImageIcon("./bilder/1.PNG"));
                break;
            case 2:
                this.setIcon(new ImageIcon("./bilder/2.PNG"));
                break;
            case 3:
                this.setIcon(new ImageIcon("./bilder/3.PNG"));
                break;
            case 4:
                this.setIcon(new ImageIcon("./bilder/4.PNG"));
                break;
            case 5:
                this.setIcon(new ImageIcon("./bilder/5.PNG"));
                break;
            case 6:
                this.setIcon(new ImageIcon("./bilder/6.PNG"));
                break;
            case 7:
                this.setIcon(new ImageIcon("./bilder/7.PNG"));
                break;
            case 8:
                this.setIcon(new ImageIcon("./bilder/8.PNG"));
                break;
            case 9:
                this.setIcon(new ImageIcon("./bilder/9.PNG"));
                break;

        }
    }
}
