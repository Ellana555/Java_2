public class Test_cat {
    public static void main(String[] args) {
        Cat barsik = new Cat(); // создали кота, объект класса Cat
        barsik.meow();

        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        // параметры кота (так нельзя записывать!)
        // Нужно доверить работу с данными (полями) методам класса.
        //barsik.weight = 3000;
        //barsik.color = "Orange";
        // тоже такой вариант недопустим
        bigCat.weight += 100; //обратились к полю "вес" большой кошки
        smallCat.weight += 1000;
        System.out.println("Вес большой кошки = " + bigCat.weight);
        System.out.println("Вес маленькой кошки = " + smallCat.weight);

        // геттер и сеттер
        bigCat.setName("Pushok");
        System.out.println("The name of big cat is " + bigCat.getName());
        System.out.println("The name of small cat is " + smallCat.getName());
    }
}

//без public
class Cat {

    //Поля класса
    double weight;
    String name;
    int age;
    String color;

    //Методы класса
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        weight += 50;
    }

    //Конструктор без аргументов
    //Просто кошка  -- это серый Барсик, логично!
    public Cat() {
        weight = 3000;
        name = "Barsik";
        age = 1;
        color = "Grey";
    }

    //Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void setName(String name) {
        this.name = name;
        }

    String getName() {
        return name;
    }
}


