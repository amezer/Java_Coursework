public class Stones
{
    private int id;
    private String type;
    private String grade;
    private int cost;
    private double weight;

    public Stones (int id, String type, String grade, int cost, double weight)
    {
        this.id = id;
        this.type = type;
        this.grade = grade;
        this.cost = cost;
        this.weight = weight;
    }

    public int getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public String getGrade()
    {
        return grade;
    }

    public int getCost()
    {
        return cost;
    }

    public double getWeight()
    {
        return weight;
    }
}
