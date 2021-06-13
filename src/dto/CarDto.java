package dto;

public class CarDto {
    private String model;
    private String color;
    private int year;
    private String engine;

    public CarDto(String model, String color, int year, String engine) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", engine='" + engine + '\'' +
                '}';
    }
}
