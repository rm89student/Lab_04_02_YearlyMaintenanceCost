//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lab_04_02_YearlyMaintenanceCost {
    public static void main(String[] args) {
        double winterCost = 1000.0;
        double springCost = 750.0;
        double summerCost = 1100;
        double fallCost = 800;

        double totalYearlyCost = winterCost + springCost + fallCost + summerCost;

        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Total yearly maintenance cost: $" + totalYearlyCost);

    }
}