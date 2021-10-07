package com.company;

import java.util.Scanner;

public class Bil {
    private String Biltype;
    private String Model;
    private int Stelnummer;
    private int Antal_Døre;
    private double Softwareversion;
    private double GPS_Kordinater;
    private float Hastighed;
    private Bremse bremse;
    private Rat rat;
    private Motor motor;
    private Hjul hjul;
    private boolean motorStatus;


    public Bil(String Biltype, String Model, int Stelnummer, int Antal_døre, double Softwareversion, double GPS_kordinater, float Hastighed, Bremse bremse, Rat rat, Motor motor, Hjul hjul){
        this.Biltype = Biltype;
        this.Model = Model;
        this.Stelnummer = Stelnummer;
        this.Antal_Døre = Antal_døre;
        this.Softwareversion = Softwareversion;
        this.GPS_Kordinater = GPS_kordinater;
        this.Hastighed = Hastighed;
        this.bremse = bremse;
        this.rat = rat;
        this.motor = motor;
        this.hjul = hjul;
    }
    public void StartMotor(){

        motorStatus = true;

    }
    public void SlukMotor(){

        motorStatus = false;


    }



    @Override
    public String toString() {
        return "Bil{" +
                "Biltype='" + Biltype + '\'' +
                ", Model='" + Model + '\'' +
                ", Stelnummer=" + Stelnummer +
                ", Antal_Døre=" + Antal_Døre +
                ", Softwareversion=" + Softwareversion +
                ", GPS_Kordinater=" + GPS_Kordinater +
                ", Hastighed=" + Hastighed +
                ", bremse=" + bremse.toString() +
                ", rat=" + rat.toString() +
                ", motor=" + motor.toString() +
                ", hjul=" + hjul.toString() +
                ", motorStatus=" + motorStatus +
                '}';
    }

    public String getBiltype() {
        return Biltype;
    }

    public void setBiltype(String biltype) {
        Biltype = biltype;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getStelnummer() {
        return Stelnummer;
    }

    public void setStelnummer(int stelnummer) {
        Stelnummer = stelnummer;
    }

    public int getAntal_Døre() {
        return Antal_Døre;
    }

    public void setAntal_Døre(int antal_Døre) {
        Antal_Døre = antal_Døre;
    }

    public double getSoftwareversion() {return Softwareversion;}

    public void setSoftwareversion(double softwareversion) {this.Softwareversion = softwareversion;}

    public double getGPS_Kordinater() {return GPS_Kordinater;}

    public void setGPS_Kordinater(double GPS_Kordinater) {
        this.GPS_Kordinater = GPS_Kordinater;
    }

    public float getHastighed() {
        return Hastighed;
    }

    public void setHastighed(float hastighed) {
        Hastighed = hastighed;
    }

    public Bremse getBremse() {return bremse;}

    public void setBremse(Bremse bremse) {this.bremse = bremse;}

    public Rat getRat() {return rat;}

    public void setRat(Rat rat) {this.rat = rat;}

    public Motor getMotor() {return motor;}

    public void setMotor(Motor motor) {this.motor = motor;}

    public Hjul getHjul() {return hjul;}

    public void setHjul(Hjul hjul) {this.hjul = hjul;}

    public boolean isMotorStatus() {return motorStatus;}

    public void setMotorStatus(boolean motorStatus) {this.motorStatus = motorStatus;}
}

