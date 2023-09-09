public class Dog {
    //属性
    private String name;
    private String type;
    private int age;
    private double price;
    private boolean isBought;

    public void setName(String name) {
        this.name = name;
    }

    //方法
    public double getPrice() {
        return price;
    }

    public void setBought(boolean bought) {
        this.isBought = bought;
    }

    public void addAge() {
        this.age++;
    }

    public Dog(String name, String type,int age,double price) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.isBought = false;
        this.price = price;
    }
}
