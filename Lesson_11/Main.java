import java.util.ArrayList;

class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}

class Cat extends Animal {
    private boolean isHungry;
    private int satiety; // сытость

    public Cat(String name) {
        super(name, 200, 0); // коты могут бегать до 200 м, не умеют плавать
        this.isHungry = true; // все коты голодные при создании
        this.satiety = 0;
    }

    public boolean eatFromBowl(FoodBowl bowl) {
        if (isHungry) {
            int foodToEat = 5; // кот пытается съесть 5 единиц еды
            int foodEaten = bowl.takeFood(foodToEat);

            if (foodEaten >= foodToEat) {
                satiety = 3; // кот полностью сыт
                isHungry = false;
                System.out.println(name + " поел и теперь сыт.");
                return true;
            } else if (foodEaten > 0) {
                satiety = 1; // кот наполовину сыт
                System.out.println(name + " поел немного и наполовину сыт.");
                return true;
            } else {
                System.out.println(name + " не смог поесть, так как еды не хватило.");
                return false;
            }
        } else {
            System.out.println(name + " не голоден.");
            return false;
        }
    }

    public int getSatiety() {
        return satiety;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name, 500, 10); // собаки могут бегать до 500 м и плавать до 10 м
    }
}

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int takeFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return amount;
        } else {
            int takenFood = foodAmount;
            foodAmount = 0;
            return takenFood;
        }
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}

public class Main {
    public static void main(String[] args) {
        // Счетчик созданных животных
        int catsCount = 0;
        int dogsCount = 0;
        int animalsCount = 0;

        // Создаем миску с едой
        FoodBowl bowl = new FoodBowl(10); // 10 единиц еды в миске

        // Создаем массив котов
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Мурзик"));
        cats.add(new Cat("Барсик"));
        cats.add(new Cat("Васька"));
        catsCount = cats.size();
        animalsCount += catsCount;

        // Создаем собаку
        Dog dog = new Dog("Бобик");
        dogsCount++;
        animalsCount++;

        // Коты пытаются поесть из миски
        for (Cat cat : cats) {
            cat.eatFromBowl(bowl);
        }

        // Выводим информацию о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.getSatiety());
        }

        // Вывод количества созданных животных
        System.out.println("Создано котов: " + catsCount);
        System.out.println("Создано собак: " + dogsCount);
        System.out.println("Всего животных: " + animalsCount);

        // Собака выполняет действия
        dog.run(150); // собака пробегает 150 м
        dog.swim(10); // собака плывет 10 м
    }
}