package lr8.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class MyJsonCreator {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONArray tasks = new JSONArray();

        JSONObject task1 = new JSONObject();
        task1.put("task", "Сходить в магазин");
        task1.put("deadline", "17:00, 13.05.2024");

        JSONObject task2 = new JSONObject();
        task2.put("task", "Сделать JAVA");
        task2.put("deadline", "23:59, 31.05.2024");

        tasks.add(task1);
        tasks.add(task2);

        jsonObject.put("tasks", tasks);

        try (FileWriter file = new FileWriter("src/lr8/example2/my-example-json.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
