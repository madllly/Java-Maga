package lr2;

public class Example5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Периметр: " + rectangle.calculatePerimeter());

        rectangle.setLength(6.0);
        rectangle.setWidth(4.0);
        System.out.println("Обновление площади: " + rectangle.calculateArea());
        System.out.println("Обновление периметра: " + rectangle.calculatePerimeter());
    }
}
