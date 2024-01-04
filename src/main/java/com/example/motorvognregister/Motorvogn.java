package com.example.motorvognregister;

public class Motorvogn {
    private String persNum;
    private String navn;
    private String adresse;
    private String kjennetegn;
    private String bilmerke;
    private String biltype;

    public Motorvogn(String persNum, String navn, String adresse, String kjennetegn, String bilmerke, String biltype){
        this.persNum = persNum;
        this.navn = navn;
        this.adresse = adresse;
        this.kjennetegn = kjennetegn;
        this.bilmerke = bilmerke;
        this.biltype = biltype;
    }

    public Motorvogn() {

    }

    public String getPersNum() { return persNum; }
    public void setPersNum(String persNum) { this.persNum = persNum; }

    public String getNavn() { return navn; }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getKjennetegn() { return kjennetegn;}
    public void setKjennetegn(String kjennetegn) { this.kjennetegn = kjennetegn; }

    public String getBilmerke() { return bilmerke;}
    public void setBilmerke(String bilmerke) { this.bilmerke = bilmerke; }

    public String getBiltype() { return biltype; }
    public void  setBiltype(String biltype) { this.biltype = biltype;}
}
