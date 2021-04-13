import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat(int id, int cost, String name, LocalDate manufactoringDate, double weight) {
        super(id, cost, name, manufactoringDate);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return this.getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getExpiryDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        LocalDate expiryDate = this.getExpiryDate();

        if (now.isAfter(expiryDate)) {
            return 0;
        } else if (now.isBefore(expiryDate) && (now.isAfter(expiryDate.minusDays(3)) || now.isEqual(expiryDate.minusDays(3)))) {
            return getAmount() * 0.5;
        } else if(now.isBefore(expiryDate) && (now.isAfter(expiryDate.minusDays(5)) || now.isEqual(expiryDate.minusDays(5)))) {
            return getAmount() * 0.7;
        } else return getAmount()*0.9;
    }
}
