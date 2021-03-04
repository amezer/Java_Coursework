import java.util.ArrayList;

public class Ring
{
    private int id;
    private Material material;
    private int weight;
    private int size;
    private ArrayList<Stones> stones;
    private int productionCost;

    public Ring (int id, Material material, int weight, int size, ArrayList<Stones> stones, int productionCost)
    {
        this.id = id;
        this.material = material;
        this.weight = weight;
        this.size = size;
        this.stones = stones;
        this.productionCost = productionCost;
    }

    public int getId()
    {
        return id;
    }

    public Material getMaterial()
    {
        return material;
    }

    public int getWeight()
    {
        return weight;
    }

    public int getSize()
    {
        return size;
    }

    public int getProductionCost()
    {
        return productionCost;
    }

    public ArrayList<Stones> getStones()
    {
        return stones;
    }

    public double getCost()
    {
        double total = 0;
        double stoneSum = 0;
        for (int i = 0; i < stones.size(); i++){
            stoneSum += stones.get(i).getCost();
        }
        total = weight * material.getCostPerMG() + stoneSum + productionCost;
        return total;
    }
}
