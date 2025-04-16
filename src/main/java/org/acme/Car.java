package org.acme;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
  // Auto incrémental
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String model;
  private String brand;
  private String color;
  private int yearOfProduction;

  // Constructeurs
  public Car(){}

  public Car(String model, String brand, String color, int yearOfProduction){
    this.model = model;
    this.brand = brand;
    this.color = color;
    this.yearOfProduction = yearOfProduction;
  }

  // Getters and setters
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYearOfProduction() {
    return yearOfProduction;
  }

  public void setYearOfProduction(int yearOfProduction) {
    this.yearOfProduction = yearOfProduction;
  }
}
