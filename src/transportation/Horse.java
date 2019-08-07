package transportion;

public class Horse implements Vehicle, Animal
{
    private int fuel = 0;
    private String name;

    // Default Constructor
    public Horse()
    {

    }

    // Constructor
    public Horse(String name)
    {
        this.name  = name;
    }

    // Implement interfaces
    @Override
    public void move()
    {
        fuel = fuel -1
    }

    @Override
    public void eat(int i)
    {
        fuel  = fuel + i
    }

    @Override
    public String speak()
    {
        return "Neigh"
    }

    @Overridepublic 
    public String getPath();
    {
        return "grass"
    }
    
    @Override
    public void getFuel();
    {
        return fuel
    }

    @Override
    public void addFuel(int i);
    {
        eat(i)
    }
}