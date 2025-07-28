package cat.itacademy.s04.t02.n01.S04T02N01.dto;

public class FruitDTO {
    private Integer id;
    private String name;
    private int amountKilos;

    public FruitDTO() {
    }

    public FruitDTO(Integer id,String name, int amountKilos) {
        this.id = id;
        this.name = name;
        this.amountKilos = amountKilos;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmountKilos() {
        return amountKilos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmountKilos(int amountKilos) {
        this.amountKilos = amountKilos;
    }
}
