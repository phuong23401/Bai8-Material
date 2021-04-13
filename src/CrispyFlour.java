import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private double quantity;

    public CrispyFlour(int id, int cost, String name, LocalDate manufactoringDate, double quantity) {
        super(id, cost, name, manufactoringDate);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufactoringDate().plusYears(1);
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
