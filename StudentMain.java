public class StudentMain {
    public static void main(String[] args) {
        StudentClass s1 = new StudentClass("Alice", 18);
        StudentClass s2 = new StudentClass("Bob", 20);
        StudentClass s3 = new StudentClass("Elzen", 21);
        StudentClass s4 = new StudentClass("Jian", 22);

        s1.sayHello(); 
        s2.sayHello(); 
        s3.sayHello(); 
        s4.sayHello();
    }
}
