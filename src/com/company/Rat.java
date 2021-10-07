package com.company;

public class Rat {
    int diameter;
    boolean plys;
    boolean læder;
    boolean horn;

    public Rat(int diameter, boolean plys, boolean læder, boolean horn) {
        this.diameter = diameter;
        this.plys = plys;
        this.læder = læder;
        this.horn = horn;
    }

    @Override
    public String toString() {
        return "Rat{" +
                "diameter=" + diameter +
                ", plys=" + plys +
                ", læder=" + læder +
                ", horn=" + horn +
                '}';
    }

    public int getDiameter() {return diameter;}

    public void setDiameter(int diameter) {this.diameter = diameter;}

    public boolean isPlys() {return plys;}

    public void setPlys(boolean plys) {this.plys = plys;}

    public boolean isLæder() {return læder;}

    public void setLæder(boolean læder) {this.læder = læder;}

    public boolean isHorn() {return horn;}

    public void setHorn(boolean horn) {this.horn = horn;}

}
