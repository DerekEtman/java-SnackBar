package snackbar;

public class Main
{
    public static void main (String[] args)
    {
        // Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // Vending Machines
        VendingMachine food = new VendingMachine("Food", "food");
        VendingMachine drink = new VendingMachine("Drink", "drink");
        VendingMachine office = new VendingMachine("Office", "office");

        // Snacks 
        Snack chips = new Snack("Chips", 36 , 1.75, food.Id);
        Snack chocolateBar = new Snack("Chocolate bar", 36, 1.00, food.Id);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.Id);

        




    }
}