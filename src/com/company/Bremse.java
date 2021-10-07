package com.company;

public class Bremse {
    int vægt;
    int bremseOile;

    public Bremse(int vægt, int bremseOile) {
        this.vægt = vægt;
        this.bremseOile = bremseOile;

    }

    @Override
    public String toString() {
        return "Bremse{" +
                "vægt=" + vægt +
                ", bremseOile='" + bremseOile + '\'' +
                '}';
    }


    public int getVægt() {return vægt;}

    public void setVægt(int vægt) {this.vægt = vægt;}

    public int getBremseOile() {return bremseOile;}

    public void setBremseOile(int bremseOile) {this.bremseOile = bremseOile;}

}
