package skin;

import java.util.Arrays;

public class Skin {
  private static int nextId = 1;

  private String name;
  private Sex sex;
  private boolean available = true;
  private int price;
  private byte numberOfLives = 3;
  private int points = 0;
  private Status status = Status.RESTING;
  private boolean[] accessories = {false, false, false};
  private int id = 0;

  public Skin(String name, Sex sex, int price) {
    this.name = name;
    this.sex = sex;
    this.price = price;
    this.id = nextId++;
  }

  public boolean loseLife() {
    if(numberOfLives >= 1) {
      numberOfLives--;

      if(numberOfLives == 0) {
        this.available = false;

        return true;
      }
      return true;
    }

    return false;
  }

  public boolean increaseLife() {
    if(numberOfLives < 5 && available) {
      numberOfLives++;

      if(numberOfLives == 5) {
        return false;
      }

      return true;
    }

    return false;
  }

  public boolean resting() {
    if(available) {
      status = Status.RESTING;

      return true;
    }

    return false;
  }

  public boolean eating() {
    if(available) {
      status = Status.EATING;

      return true;
    }

    return false;
  }

  public boolean battling() {
    if(available) {
      for (boolean accesory : accessories) {
        if(accesory){
          this.status = Status.BATTLING;

          return true;
        }
      }
    }

    return false;
  }

  public boolean increasePoints(int points) {
    if(available) {
      this.points += points;

      return true;
    }

    return false;
  }

  public boolean decreasePoints(int points) {
    if(available) {
      if(points > this.points) {
        this.points = 0;

        return true;
      } else {
        this.points -= points;

        return true;
      }
    }

    return false;
  }

  public boolean getSword() {
    if(available) {
      accessories[0] = true;

      return true;
    }

    return false;
  }

  public boolean getGun() {
    if(available) {
      accessories[1] = true;

      return true;
    }

    return false;
  }

  public boolean getRope() {
    if(available) {
      accessories[2] = true;

      return true;
    }

    return false;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Sex getSex() {
    return sex;
  }

  public void setSex(Sex sex) {
    this.sex = sex;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public byte getNumberOfLives() {
    return numberOfLives;
  }

  public void setNumberOfLives(byte numberOfLives) {
    this.numberOfLives = numberOfLives;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public boolean[] getAccessories() {
    return accessories;
  }

  public void setAccessories(boolean[] accessories) {
    this.accessories = accessories;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Skin [name=" + name + ", sex=" + sex + ", available=" + available + ", price=" + price + ", numberOfLives="
        + numberOfLives + ", points=" + points + ", status=" + status + ", accessories=" + Arrays.toString(accessories)
        + ", id=" + id + "]";
  }

  
}
