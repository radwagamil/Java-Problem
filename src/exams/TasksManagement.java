/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams;

import java.util.ArrayList;

public class TasksManagement {

    static ArrayList<Tasks> info = new ArrayList<>();

    public static void addTask(String name, String description) {

        Tasks t = new Tasks();
        t.setName(name);
        t.setDescription(description);
        info.add(t);
    }

    public static ArrayList<Tasks> listTask() {

        return info;

    }

    public static void searchTask(String key) {
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().equalsIgnoreCase(key) || info.get(i).getDescription().equalsIgnoreCase(key)) {
                System.out.println(info.get(i));
            }
        }
    }

    public static void deleteTasks(int index) {
        info.remove(index);
    }
}
