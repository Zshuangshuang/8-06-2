/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-06
 * Time:22:48
 **/
class Animal{
    public String name;
    public void eat(){
        System.out.println(this.name+"Animal"+" +"+":正在吃");
    }
    public Animal(String name){
        this.name = name;
        System.out.println("Animal(String)");
    }

}
class Cat extends Animal{
    public Cat(String name){
        super(name);
        System.out.println("Cat:name");

    }
    public void eat(){
        System.out.println(this.name+" "+"Cat::正在吃");
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
        System.out.println("name:Bird               ");
    }
    public void fly(){

        System.out.println(this.name+"Bird:正在飞");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Animal animal = new Cat("吉吉");
        if (animal instanceof Bird){
            Bird bird = (Bird) animal;
            bird.fly();
        }

    }
    public static void main5(String[] args) {
        Animal animal = new Cat("喵喵");
        animal.eat();

    }
    public static Animal func(){
        Cat cat = new Cat("喵喵");
        return cat;
    }

    public static void main4(String[] args) {
        Animal animal = func();
        animal.eat();
    }
    public static void func(Animal animal){

    }
    public static void main3(String[] args) {
        Cat cat = new Cat("喵喵");
        func(cat);
        cat.eat();
    }
    public static void main2(String[] args) {
        Animal animal = new Cat("媌");
        animal.eat();
        Animal animal1 = new Bird("呱呱");

    }
    public static void main1(String[] args) {
        Animal animal = new Animal("豆豆");
        Cat cat = new Cat("呵呵");

    }
}
