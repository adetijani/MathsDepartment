package Entities;

public class Courses {
    private String name;
    private Integer units;

    public Courses(String name, Integer units) {
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }
}
