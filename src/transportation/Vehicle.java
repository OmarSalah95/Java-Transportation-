package transportation;

public interface Vehicle
{
    String getPath();
    void move();
    int getFuel();
    void addFuel(int i);
}