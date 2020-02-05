package Animal;

public class app {
    public static void main(String[] args) {
        Animal a1 = new Animal("monkey", 20, 5);
        Animal a2 = new Animal("dog", 7, 15);
        Animal a3 = new Animal("cat", 10, 5);

        a1.setAge(30);
        System.out.println(a1.getAge());

        a2.setName("monkey");
        System.out.println(a2.getName());

        a3.setSpide(40);
        System.out.println(a3.getSpide());

        System.out.println("Назва тварини ="+ a1.getName()+", Вік тварини = "+ a1.getAge()+", Швидкість тварини = "+ a1.getSpide()+" км/год");
        System.out.println("Назва тварини ="+ a2.getName()+", Вік тварини = "+ a2.getAge()+", Швидкість тварини = "+ a2.getSpide()+" км/год");
        System.out.println("Назва тварини ="+ a3.getName()+", Вік тварини = "+ a3.getAge()+", Швидкість тварини = "+ a3.getSpide()+" км/год");
    }
}
