import java.time.LocalDate;

public abstract class Material {
    private int id, cost;
    private String name;
    private LocalDate manufactoringDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufactoringDate() {
        return manufactoringDate;
    }

    public void setManufactoringDate(LocalDate manufactoringDate) {
        this.manufactoringDate = manufactoringDate;
    }

    public Material(int id, int cost, String name, LocalDate manufactoringDate) {
        this.id = id;
        this.cost = cost;
        this.name = name;
        this.manufactoringDate = manufactoringDate;
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();
}
