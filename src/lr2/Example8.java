package lr2;

public class Example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.makeSound();
        dog.bark();

        Cat cat = new Cat("Whiskers", 5, "Dry food");
        cat.makeSound();
        cat.meow();

        Bird bird = new Bird("Sunny", 2, true);
        bird.makeSound();
        bird.chirp();

        NewCircle NewCircle = new NewCircle(5.0);
        System.out.println("NewCircle Area: " + NewCircle.calculateArea());
        System.out.println("NewCircle Perimeter: " + NewCircle.calculatePerimeter());

        NewSquare NewSquare = new NewSquare(4.0);
        System.out.println("NewSquare Area: " + NewSquare.calculateArea());
        System.out.println("NewSquare Perimeter: " + NewSquare.calculatePerimeter());

        NewTirangle NewTirangle = new NewTirangle(3.0, 4.0);
        System.out.println("NewTirangle Area: " + NewTirangle.calculateArea());
        System.out.println("NewTirangle Perimeter: " + NewTirangle.calculatePerimeter());
    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    private String typeOfFood;

    public Cat(String name, int age, String typeOfFood) {
        super(name, age);
        this.typeOfFood = typeOfFood;
    }

    public void meow() {
        System.out.println("Meow!");
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void chirp() {
        System.out.println("Chirp chirp!");
    }
}

class NewShape {
    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }
}

class NewCircle extends NewShape {
    private double radius;

    public NewCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class NewSquare extends NewShape {
    private double sideLength;

    public NewSquare(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}

class NewTirangle extends NewShape {
    private double base;
    private double height;

    public NewTirangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * base;
    }
}