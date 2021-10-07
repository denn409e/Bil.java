package com.company;

public class Motor {
    String motorType;
    int omdrejninger;

    public Motor(String motorType, int omdrejninger){
        this.motorType = motorType;
        this.omdrejninger = omdrejninger;

    }

    @Override
    public String toString() {
        return "Motor{" +
                "motorType='" + motorType + '\'' +
                ", omdrejninger=" + omdrejninger +
                '}';
    }
    public String getMotorType() {return this.motorType;}

    public void setMotorType(String motorType) {this.motorType = motorType;}

    public int getOmdrejninger() {return omdrejninger;}

    public void setOmdrejninger(int omdrejninger) {this.omdrejninger = omdrejninger;}
}
