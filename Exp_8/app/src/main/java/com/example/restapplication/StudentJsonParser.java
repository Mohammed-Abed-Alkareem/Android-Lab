package com.example.restapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class StudentJsonParser {
    public static List<Student> getObjectFromJson(String json) {
        List<Student> students = new ArrayList<>();
        if (json == null || json.isEmpty()) {
            return students; // Return empty list if JSON is null or empty
        }

        try {
            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Student student = new Student();
                student.setID(jsonObject.optInt("id", -1)); // Use default value if key is missing
                student.setName(jsonObject.optString("name", "Unknown")); // Use default value if key is missing
                student.setAge(jsonObject.optDouble("age", 0.0)); // Use default value if key is missing

                students.add(student);
            }
        } catch (JSONException e) {
            e.printStackTrace(); // Log error message
        }
        return students;
    }
}
