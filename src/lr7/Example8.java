package lr7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Example8 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Dog car = new Dog("Умка", 5);
        String fileName = "src/lr7/dog.bin";
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(car);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Dog restoreCar = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            restoreCar = (Dog) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Объект считан!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Объект после считывания: ");
        System.out.println(restoreCar);
    }
}
