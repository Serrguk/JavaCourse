
public class Cat
{
    public static final int EYES_COUNT = 2;
    public static final double MIN_WEIGHT = 1000;
    public static final double MAX_WEIGHT = 9000;
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private static int catCount = 0;
    private String name;
    private ColorOfCats color;

    public Cat(String name)
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        catCount = catCount + 1;
        this.name = name;
    }

    /** Создадим МЕТОД КОПИРОВАНИЯ
     *______________________________________
     */
    public Cat copy() {
        Cat copyCat = new Cat(name);
        copyCat.name = name;
        copyCat.weight = weight;
        return copyCat;
    }

    /**
     * ______________________________________
     */
    public void setColor(ColorOfCats color) {
        this.color = color;
    }

    public ColorOfCats getColor() {
        return color;
    }

    public void meow()
    {
        weight = weight - 1;
        if (weight < minWeight) {
            catCount = catCount - 1;
        }
        System.out.println(getName() + " говорит: Meow");
    }

    public static int getCatCount() {
            return catCount;
    }

    public void goToilet() {
        weight = weight - (30 + 30 * Math.random());
        System.out.println(getName() + " сходил(а) в туалет. Теперь его (её) вес: " + weight + " гр");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
     if (weight > maxWeight) {
    catCount = catCount - 1;
    }
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        if (weight > maxWeight) {
        catCount = catCount - 1;
    }
    }

    public String getName () {
        return name;
    }
    public void setWeight (double weight) {
        this.weight = weight;
    }

    public Double getWeight()
    {
        return weight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}