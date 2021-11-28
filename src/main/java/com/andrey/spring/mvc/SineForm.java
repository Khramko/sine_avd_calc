package com.andrey.spring.mvc;

public class SineForm {
    private double frequency;
    private double acceleration;
    private double accelerationUnitCoefficient;
    private double velocity;
    private double velocityUnitCoefficient;
    private double displacement;
    private double displacementUnitCoefficient;

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
