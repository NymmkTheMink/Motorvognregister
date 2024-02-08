package com.example.motorvognregister;

public class Bil {
    private String merke;
    private String modell;

    public Bil(String merke, String modell){
        this.merke = merke;
        this.modell = modell;
    }

    public String getMerke() { return merke; }
    public void setMerke(String merke) { this.merke= merke; }

    public String getModell() { return modell; }
    public void setModell(String modell) { this.merke=modell; }

}
