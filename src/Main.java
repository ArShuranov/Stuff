public class Main {
    public static void main(String[] args) {
        Person vitya = new Person();
        Person viktor = new Person(100, 20);
        vitya.setHeight(111);
        vitya.setAge(12);

        System.out.println(vitya.getHeight());
        System.out.println(vitya.getAge());

        System.out.println(viktor.getAge());
        System.out.println(viktor.getHeight());

    }
}

