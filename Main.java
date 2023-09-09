public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello,world!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        String c = scanner.next();//以空白符作为分割标准读入字符串
        String d = scanner.nextLine();//以换行符作为标准
        */

        Dog dog;
        dog = new Dog("pupyy","Bernese Mountain",1,180000);
        Person person;
        person = new Person("小明",114514);
        boolean ans = person.buy(dog,person);
        System.out.println(ans);
    }
}