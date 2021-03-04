public class Material
{
    private int id;
    private String type;
    private double density;
    private int costPerMG;

    public Material (int id, String type, double density, int costPerMG)
    {
        this.id = id;
        this.type = type;
        this.density = density;
        this.costPerMG = costPerMG;
    }

    public int getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public double getDensity()
    {
        return density;
    }

    public int getCostPerMG()
    {
        return costPerMG;
    }
}
