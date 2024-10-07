package nezet;

import javax.swing.JOptionPane;

public class AutoNezet {
    
    public void megjelenit(String uzenet) {
        JOptionPane.showMessageDialog(null, uzenet);
    }
    
    public int bekerAuto() {
        String v = JOptionPane.showInputDialog("Melyik autót szeretnéd szerkeszteni");
        return Integer.parseInt(v) - 1;
    }
    
    public String bekerSzin() {
        String valtoSzin = JOptionPane.showInputDialog("Milyen színűre szeretnéd átfesteni az autót?");
        return valtoSzin;
    }
    
    public String bekerExtra() {
        String extra = JOptionPane.showInputDialog("Milyen extrát szeretnél bekérni az autóba?");
        return extra;
    }
}
