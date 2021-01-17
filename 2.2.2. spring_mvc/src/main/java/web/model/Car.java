package web.model;

public class Car {
    private String model;
    private int cost;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String model, int cost, int yearOfProduction) {
        this.model = model;
        this.cost = cost;
        this.yearOfProduction = yearOfProduction;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", cost=" + cost +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
