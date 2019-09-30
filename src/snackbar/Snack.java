package snackbar;

public class Snack
{
    // Fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendId;    

    // constructor
    public Snack(String name, int quantity, double cost, int vendId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendId = maxId;
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

    public int buySnack(int quantity)
    {
       return  this.quantity = this.quantity - quantity;
    }

    public double totalCost(double cost)
    {
        return this.cost * quantity;
    }

    public int addQuantity(int quantity)
    {
        return this.quantity = this.quantity + quantity;
    }
}