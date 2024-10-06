/* Создать класс Park с внутренним классом, с помощью объектов которого можно хранить
информацию об аттракционах, времени их работы и стоимости.
 */

public class Park {

    public class Attraction {
        private String name;          
        private String workingHours;  
        private double price;         

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " бел. руб.");
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {

        Park park = new Park();


        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 - 18:00", 5);
        Park.Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "11:00 - 20:00", 3);
        Park.Attraction hauntedHouse = park.new Attraction("Дом с привидениями", "12:00 - 22:00", 9);


        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        hauntedHouse.printInfo();
    }
}