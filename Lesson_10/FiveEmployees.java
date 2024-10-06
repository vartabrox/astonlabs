public class FiveEmployees {

   private String fullName;
   private String position;
   private String email;
   private String phone;
   private double salary;
   private int age;

   public FiveEmployees(String fullName, String position, String email, String phone, double salary, int age) {
       this.fullName = fullName;
       this.position = position;
       this.email = email;
       this.phone = phone;
       this.salary = salary;
       this.age = age;
   }

   public void printInfo() {
       System.out.println("Full Name: " + fullName);
       System.out.println("Position: " + position);
       System.out.println("Email: " + email);
       System.out.println("Phone: " + phone);
       System.out.println("Salary: " + salary);
       System.out.println("Age: " + age);
       System.out.println(" ");
   }

   public static void main(String[] args) {

       FiveEmployees[] employeeArray = new FiveEmployees[5];

       employeeArray[0] = new FiveEmployees("Ivanov Ivan 1", "Engineer", "ivanov1@mailbox.com", "892312312", 30000, 30);
       employeeArray[1] = new FiveEmployees("Ivanov Ivan 2", "Manager", "ivanov2@mailbox.com", "892312313", 40000, 35);
       employeeArray[2] = new FiveEmployees("Ivanov Ivan 3", "Developer", "ivanov3@mailbox.com", "892312314", 50000, 28);
       employeeArray[3] = new FiveEmployees("Ivanov Ivan 4", "Analyst", "ivanov4@mailbox.com", "892312315", 45000, 32);
       employeeArray[4] = new FiveEmployees("Ivanov Ivan 5", "Designer", "ivanov5@mailbox.com", "892312316", 35000, 29);

       for (FiveEmployees employee : employeeArray) {
           employee.printInfo();
       }
   }
}