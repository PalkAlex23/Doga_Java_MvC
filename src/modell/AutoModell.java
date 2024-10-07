package modell;

public class AutoModell {
    private Auto[] autok;
    private int valaszt;
    
    public AutoModell() {
        valaszt = -1;
        
        autok = new Auto[2];
        autok[0] = new Auto("IHX-700", "szürke");
        autok[1] = new Auto("KNB-550", "fekete");
    }
    
    public String kezd() {
        String uzi = "Autó(k) adatai:\n\n";
        for(Auto auto : autok) {
            String r = auto.getRendszam();
            String sz = auto.getSzin();
            String ex = auto.getExtra();
            if (ex == "") {
                ex = "nincs";
            }
            
            uzi += "rendszáma: " + r + "; színe: " + sz + "; Extrák: " + ex + "\n";
        }
        
        return uzi;
    }
    
    public void atfestes(String szin) {
        autok[valaszt].setSzin(szin);
    }
    
    public void turbozas(String extra) {
        autok[valaszt].setExtra(extra);
    }

    public int getValaszt() {
        return valaszt;
    }

    public void setValaszt(int valaszt) {
        this.valaszt = valaszt;
    }
    
}
