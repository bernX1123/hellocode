public class U1T2 {
    public static void main(String[] args) {
        //variables
        String customer = "Stacey";
        double cashTender = 40.0;

        int apples = 12;
        int papples = 2;
        int rbags = 3;

        final double APPLE_UNIT = 0.60;
        final double PAPPLE_UNIT = 3.59;
        final double RBAG_COST_PER_POUND = 1.39;
        double rbagPounds = rbags * 2.20462;

        double appleCost = apples* APPLE_UNIT;
        double pappleCost = papples*PAPPLE_UNIT;
        double rbagCost = rbagPounds* RBAG_COST_PER_POUND;



        //reciept info
        System.out.println("-----------------------");
        System.out.println("Customer: " + customer);
        int totalItems = rbags + papples + apples;
        System.out.println("Total items: " + totalItems);
        double totalCost = (appleCost+pappleCost+rbagCost);
        System.out.println("Total Cost: $" + totalCost );
        double averageCost = totalCost/totalItems;
        System.out.println("Average Cost Per Item: $" + averageCost);

        System.out.println("");
        System.out.println("");

        System.out.println("Cash Tendered: $" + cashTender );
        double change = cashTender-totalCost;
        System.out.println("Change given: $" + change);
        System.out.println("-----------------------");
    }
}
