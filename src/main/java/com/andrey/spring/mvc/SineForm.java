package com.andrey.spring.mvc;


public class SineForm {  //This class represents a description of a separate sinusoidal form.
    private double frequency;
    private double acceleration;
    private double accelerationUnitCoefficient; //Conversion coefficient of the current acceleration dimension value in CI
    private double velocity;
    private double velocityUnitCoefficient;// Conversion coefficient of the current velocity dimension value in CI
    private double displacement;
    private double displacementUnitCoefficient;//Conversion coefficient of the current displacement dimension value in CI

    public double calculateDisplacement(){
       double displacement =  displacementUnitCoefficient*
               acceleration*accelerationUnitCoefficient/(Math.pow(2*3.14159265359*frequency,2));
       return displacement;
    }
    public double calculateVelocity(){
        double velocity =  velocityUnitCoefficient*
                acceleration*accelerationUnitCoefficient/(2*3.14159265359*frequency);
        return velocity;
    }

    public String getDisplacementUnit() {
        int unit = (int) displacementUnitCoefficient;
        switch (unit) {
            case 1:
                return "m";
            case 100:
                return "cm";
            case 1000:
                return "mm";
            default:
                return "undefined";
        }
    }
    public String getVelocityUnit() {
        int unit = (int) velocityUnitCoefficient;
        switch (unit) {
            case 1:
                return "m/s";
            case 100:
                return "cm/s";
            case 1000:
                return "mm/s";
            default:
                return "undefined";
        }
    }
    public String getAccelerationUnit(){
        int unit = (int)accelerationUnitCoefficient;
       switch(unit){
           case 1:
               return "m/s2";
           case 9:
               return "g";
           default:
               return "undefined";
       }
    }

    public double getAccelerationUnitCoefficient() {
        return accelerationUnitCoefficient;
    }

    public void setAccelerationUnitCoefficient(double accelerationUnitCoefficient) {
        this.accelerationUnitCoefficient = accelerationUnitCoefficient;
    }

    public double getVelocityUnitCoefficient() {
        return velocityUnitCoefficient;
    }

    public void setVelocityUnitCoefficient(double velocityUnitCoefficient) {
        this.velocityUnitCoefficient = velocityUnitCoefficient;
    }

    public double getDisplacementUnitCoefficient() {
        return displacementUnitCoefficient;
    }

    public void setDisplacementUnitCoefficient(double displacementUnitCoefficient) {
        this.displacementUnitCoefficient = displacementUnitCoefficient;
    }



    public SineForm() {
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        if (frequency>0)
        this.frequency = frequency;
        else
            throw new RuntimeException();
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {

        this.acceleration = acceleration;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {

        this.velocity = velocity;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {

        this.displacement = displacement;
    }

}
