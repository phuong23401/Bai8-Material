import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static List<Material> materialList = new ArrayList<>();
    static {
        Material flour1 = new CrispyFlour(1, 10, "f1", LocalDate.of(2020, 4, 10), 3);
        Material flour2 = new CrispyFlour(2, 10, "f2", LocalDate.of(2019, 4, 10), 3.5);
        Material flour3 = new CrispyFlour(3, 10, "f3", LocalDate.of(2020, 4, 10), 4);
        Material flour4 = new CrispyFlour(4, 10, "f4", LocalDate.of(2020, 4, 10), 4.5);
        Material flour5 = new CrispyFlour(5, 10, "f5", LocalDate.of(2020, 4, 10), 5);
        Material meat1 = new Meat(6, 20, "m1", LocalDate.of(2021, 4, 10), 2);
        Material meat2 = new Meat(7, 20, "m2", LocalDate.of(2020, 4, 10), 2);
        Material meat3 = new Meat(8, 20, "m3", LocalDate.of(2021, 4, 10), 2);
        Material meat4 = new Meat(9, 20, "m4", LocalDate.of(2021, 4, 10), 2);
        Material meat5 = new Meat(10, 20, "m5", LocalDate.of(2021, 4, 10), 2);
        materialList.add(flour1);
        materialList.add(flour2);
        materialList.add(flour3);
        materialList.add(flour4);
        materialList.add(flour5);
        materialList.add(meat1);
        materialList.add(meat2);
        materialList.add(meat3);
        materialList.add(meat4);
        materialList.add(meat5);
    }

    public double getAllAmount() {
        double totalAmount = 0;
        for (Material material : materialList) {
            totalAmount += material.getCost();
        }
        return totalAmount;
    }

    public double getAllRealMoney(){
        double totalMoney = 0;
        for (Material material : materialList
        ) {
            totalMoney += material.getAmount();
        }
        return totalMoney;
    }

    public double getDifferent(){
        return getAllAmount() - getAllRealMoney();
    }
}
