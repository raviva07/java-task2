public class Person {
    String name;
    int age;
    public Person(String name) {
        this.name = name;
        this.age = 18; 
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Person p = new Person("Jon");       
       
        p.display();
      
    }
}
