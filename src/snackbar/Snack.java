package snackbar;

public class Snack
{
    // Fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private String vendId;    

    // constructor
    public Snack(String name, int quantity, double cost, String vendId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendId = vendId;
    }

    // Methods - Getters & Setters
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

    public double getCost(){
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendId()
    {
        return vendId;
    }

    public void setVendId(int vendId){
        this.vendId = vendId;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = this.quantity + quantity;
    }

    // other Methods

    public buySnack(int quantity)
    {
        this.quantity = this.quantity - quantity;
    }

    public totalCost(int quantity)
    {
        return this.cost * quantity;
    }
}