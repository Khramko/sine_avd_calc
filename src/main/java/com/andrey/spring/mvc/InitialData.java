package com.andrey.spring.mvc;

public class InitialData {
    private double frequency;
    private double acceleration;
    private double accelerationUnit;
    private double velocity;
    private String velocityUnit;
    private double displacement;
    private String displacementUnit;

    public double getAccelerationUnit() {
        return accelerationUnit;
    }

    public void setAccelerationUnit(double accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
    }

    public String getVelocityUnit() {
        return velocityUnit;
    }

    public void setVelocityUnit(String velocityUnit) {
        this.velocityUnit = velocityUnit;
    }

    public String getDisplacementUnit() {
        return displacementUnit;
    }

    public void setDisplacementUnit(String displacementUnit) {
        this.displacementUnit = displacementUnit;
    }



    public InitialData() {
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

    @Override
    public String toString() {
        return "InitialData{" +
                "frequency=" + frequency +
                ", acceleration=" + acceleration +
                ", velocity=" + velocity +
                ", displacement=" + displacement +
                '}';
    }
}
