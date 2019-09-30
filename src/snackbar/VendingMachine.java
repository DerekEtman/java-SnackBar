package snackbar;

public class VendingMachine
{
    // Fields
    // private static int maxId = 0;
    private String id;
    private String name;

    // Constructor
    public VendingMachine(String name, String id)
    {
        this.id = id;
        this.name = name;

    }

    // Get & Set Methods
    public int id()
    {
        return id;
    }

    public void id(int id)
    {
        this.id = id;
    }

    public String name()
    {
        return name;
    }

    public void name(String name)
    {
        this.name = name;
    }


    // Other methods



}