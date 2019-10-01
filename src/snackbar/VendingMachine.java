package snackbar;

public class VendingMachine
{
    // Fields
    private static int maxId = 0;
    private int id;
    private String name;

    // Constructor
    public VendingMachine(String name)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
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


    // Other methods



}