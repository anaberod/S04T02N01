package cat.itacademy.s04.t02.n01.S04T02N01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity//crea tabla en base de datos
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Significa que cada vez que guardas una fruta nueva, la base de datos:Le pone un número automáticamente 🔢Te lo devuelve después
    int id;
    String name;
    int amountKilos;

    public Fruit() {
    }

    public Fruit(String name, int amountKilos) {
        this.name = name;
        this.amountKilos= amountKilos;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmountKilos() {
        return amountKilos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmountKilos(int amountKilos) {
        this.amountKilos = amountKilos;
    }
}
