package snackbar;

public class Main
{
    public static void main (String[] args)
    {
        // Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // Vending Machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // Snacks 
        // Food Machine
        Snack chips = new Snack("Chips", 36 , 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        // Drink Machine
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());
        
        System.out.println("*** Processing ***");
        System.out.println(soda.getCost());

        // Transaction 1
        jane.buyItem(soda.getCost(), 3);
        soda.buySnack(3);
        System.out.println("Jane CashOnHand: " + jane.getCashOnHand());
        System.out.println("Soda Left: " + soda.getQuantity());

        // Transaction 2
        jane.buyItem(pretzel.getCost(), 1);
        pretzel.buySnack(1);
        System.out.println("Jane CashOnHand #2: " + jane.getCashOnHand());
        System.out.println("Pretzels left: " + pretzel.getQuantity());

        // Transaction 3
        bob.buyItem(soda.getCost(), 2);
        soda.buySnack(2);
        System.out.println("Bob CashOnHand: " + bob.getCashOnHand());
        System.out.println("Soda Left:" + soda.getQuantity());

        // Transaction 4
        jane.addCash(10);
        System.out.println("Jane CashOnHand +10$: " + jane.getCashOnHand());

        // Transaction 5
        jane.buyItem(chocolateBar.getCost(), 1);
        chocolateBar.buySnack(1);
        System.out.println("Jane CashOnHand #3: " + jane.getCashOnHand());
        System.out.println("chocolateBar left: " + chocolateBar.getQuantity());

        // Transaction 6
        pretzel.addQuantity(12);
        System.out.println("Pretzels left: " + pretzel.getQuantity());

        // Transaction 7 
        bob.buyItem(pretzel.getCost(), 3);
        pretzel.buySnack(3);
        System.out.println("Bob CashOnHand #2: " + bob.getCashOnHand());
        System.out.println("Pretzels Left: " + pretzel.getQuantity());
        

    }
}