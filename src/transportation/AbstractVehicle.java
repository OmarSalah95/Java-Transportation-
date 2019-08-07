package transportation;

public abstract class AbstractVehicle
{
    protected int fuel;

    // Constructor
    public AbstractVehicle(int fuel)
    {
        this.fuel = fuel;
    }

    public AbstractVehicle()
    {
        fuel = 1;
    }

    // Abstract Methods
    public abstract String getPath();
    public abstract String getName();


    // Methods
    public void move()
    {
        fuel--;
    }

    public void move(int steps)
    {
        fuel = fuel - steps;
    }

    public int getFuelLevel()
    {
        return fuel;
    }

    public void addFuel(int i)
    {
        fuel = fuel + i;
    }
} 