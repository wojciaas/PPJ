public class Fruit {
    public String name;
    public double weight;

    public Fruit(String name) {
        this.name = name;
        weight = Math.random() * 0.3 + 0.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void show(){
        System.out.println(name);
        System.out.println(weight);
        System.out.println();
    }
}
