package com.company;

public class Hjul {
    int tommer;
    String navn;
    String dækType;//sommer eller vinter dæk
    float dækTryk;

    public Hjul(int tommer, String navn, String dækType, float dækTryk) {
        this.tommer = tommer;
        this.navn = navn;
        this.dækType = dækType;
        this.dækTryk = dækTryk;
    }

    @Override
    public String toString() {
        return "Hjul{" +
                "tommer=" + tommer +
                ", navn='" + navn + '\'' +
                ", dækType='" + dækType + '\'' +
                ", dækTryk=" + dækTryk +
                '}';
    }

    public int getTommer() {return tommer;}

    public void setTommer(int tommer) {this.tommer = tommer;}

    public String getNavn() {return navn;}

    public void setNavn(String navn) {this.navn = navn;}

    public String getDækType() {return dækType;}

    public void setDækType(String dækType) {this.dækType = dækType;}

    public float getDækTryk() {return dækTryk;}

    public void setDækTryk(float dækTryk) {this.dækTryk = dækTryk;}
}
