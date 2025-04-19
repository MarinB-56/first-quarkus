package org.acme;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "garages")
public class Garage {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  //Relation
  @OneToMany(mappedBy = "garage", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Car> cars;

  // Constructors
  public Garage(){

  }

  public Garage(String name){
    this.name = name;
  }

  // Getters and Setters
  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
