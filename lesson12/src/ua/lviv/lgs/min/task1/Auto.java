package ua.lviv.lgs.min.task1;

public class Auto {

    private int horsepower;
    private int year;
    private Helm helm;
    private Engine engine;

    public Auto(int horsepower, int year, Helm helm, Engine engine) {
        super();
        this.horsepower = horsepower;
        this.year = year;
        this.helm = this.helm;
        this.engine = this.engine;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "horsepower=" + horsepower +
                ", year=" + year +
                ", helm=" + helm +
                ", engine=" + engine +
                '}';
    }
}
