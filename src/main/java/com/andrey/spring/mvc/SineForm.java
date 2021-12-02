package com.andrey.spring.mvc;


import javax.validation.constraints.Positive;
import java.util.HashMap;
import java.util.Map;


public class SineForm {  //This class represents a description of a separate sinusoidal form.
    @Positive( message = "please enter some real frequency (positive value)")
    private double frequency;
    private double acceleration;
    private double velocity;
    private double displacement;
    private Map<Double, String> accelerationUnits;
    private Map<Double, String> velocityUnits;
    private Map<Double, String> displacementUnits;
    private double accelerationUnitCoefficient; //Current selected conversion coefficient acceleration dimension value in CI
    private double velocityUnitCoefficient;// Current selected conversion coefficient velocity dimension value in CI
    private double displacementUnitCoefficient;//Current selected conversion coefficient displacement dimension value in CI


    public SineForm() {
        accelerationUnits = new HashMap<>();
        accelerationUnits.put(1.0,"m/s2");
        accelerationUnits.put(9.78,"g");

        velocityUnits = new HashMap<>();
        velocityUnits.put(1.0,"m/s");
        velocityUnits.put(100.0,"cm/s");
        velocityUnits.put(1000.0,"mm/s");

        displacementUnits = new HashMap<>();
        displacementUnits.put(1.0,"m");
        displacementUnits.put(100.0,"cm");
        displacementUnits.put(1000.0,"mm");
    }
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

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
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

    public Map<Double, String> getAccelerationUnits() {
        return accelerationUnits;
    }

    public void setAccelerationUnits(Map<Double, String> accelerationUnits) {
        this.accelerationUnits = accelerationUnits;
    }

    public Map<Double, String> getVelocityUnits() {
        return velocityUnits;
    }

    public void setVelocityUnits(Map<Double, String> velocityUnits) {
        this.velocityUnits = velocityUnits;
    }

    public Map<Double, String> getDisplacementUnits() {
        return displacementUnits;
    }

    public void setDisplacementUnits(Map<Double, String> displacementUnits) {
        this.displacementUnits = displacementUnits;
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
}
