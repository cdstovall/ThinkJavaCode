public class Product
{

    private String name;
    private int quantityInStock;

    public Product(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public int getQuantityInStock()
    {
        return this.quantityInStock;
    }

    public void stock(int newStock)
    {
        quantityInStock += newStock;
    }

    public void sell(int soldStock)
    {
        quantityInStock -= soldStock;
    }

    public void recordLoss(int stockLost)
    {
        quantityInStock -= stockLost;
    }

    public String toString()
    {
        return "" + name + ", Quantity in Stock " + quantityInStock;
    }
}
