package snackbar;


public class Customer
{
    // Fields
    private static int maxId = 0;
    public int id;
    public String name;
    public double cashOnHand;

    public Customer(String name, Double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // Get & Set Methods
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getCashOnHand(){
        return cashOnHand;
    }
    public void setCashOnHand(double cashOnHand)
    {
        this.cashOnHand = cashOnHand;
    }

    // Other Methods

    public double buyItem(double cashOnHand, double cost){
        return this.cashOnHand - cost; 
    }


}