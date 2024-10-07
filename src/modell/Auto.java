package modell;

public class Auto {
    private String rendszam, szin, extra;

    public Auto(String rendszam) {
        this(rendszam, "piros");
    }
    
    public Auto(String rendszam, String szin) {
        this(rendszam, szin, "");
    }
    
    
    public Auto(String rendszam, String szin, String extra) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.extra = extra;
    }

    public String getRendszam() {
        return rendszam;
    }
    
    /* SZÍN */
    
    public String getSzin() {
        return szin;
    }
    
    public void setSzin(String szin) {
        this.szin = szin;
    }
    
    /* EXTRÁK */

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }   
    
}
