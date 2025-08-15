public class StudentClass {
    String name;
    int age;

    public StudentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hi! I'm " + name + " and I'm " + age + " years old.");
    }
}
