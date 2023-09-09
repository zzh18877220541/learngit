public class Person {
    private String name;
    private double money;

    public boolean buy(Dog a,Person b) {
        double needmoney = a.getPrice();
        double havemoney = b.getMoney();
        if(needmoney > havemoney)
            return false;
        else
            return true;
    }

    public double getMoney() {
        return money;
    }

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
    }
}
