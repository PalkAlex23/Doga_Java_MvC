package main;

import modell.AutoModell;
import nezet.AutoNezet;
import vezerlo.AutoVezerlo;

public class Doga_MvC {

    public static void main(String[] args) {
        AutoModell modell = new AutoModell();
        AutoNezet nezet = new AutoNezet();
        
        new AutoVezerlo(modell, nezet);
    }
    
}
