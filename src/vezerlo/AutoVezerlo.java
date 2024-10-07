package vezerlo;

import modell.AutoModell;
import nezet.AutoNezet;

public class AutoVezerlo {
    private AutoModell modell;
    private AutoNezet nezet;

    public AutoVezerlo(AutoModell modell, AutoNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        indit();
    }
    
    public void indit() {
        nezet.megjelenit(modell.kezd());
        modell.setValaszt(nezet.bekerAuto());
        modell.atfestes(nezet.bekerSzin());
        modell.turbozas(nezet.bekerExtra());
        
        nezet.megjelenit(modell.kezd());
    }
}
