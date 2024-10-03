/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон,
 зарплата, возраст. Конструктор класса должен заполнять эти поля при создании объекта.
 Внутри класса "Сотрудник" написать метод, который выводит информацию об объекте в консоль.
 */

public class Employee {
    
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printConsole() {
        System.out.println("Full name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

      Employee employee1 = new Employee("Johni Mnemonik", "Courier", "jm@kiberpank.com", 291946738, 500, 35);

      employee1.printConsole();
    }
}
