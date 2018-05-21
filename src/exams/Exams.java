package exams;

import java.util.ArrayList;
import java.util.Scanner;

public class Exams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int choice;
        while (true) {
            System.out.println("1- New Task");
            System.out.println("2- List Tasks");
            System.out.println("3- Find Task");
            System.out.println("4- Remove Task");
            System.out.println("Select Your choice : ");

            Scanner s = new Scanner(System.in);
            choice = s.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Enter task name: ");
                    s.nextLine();
                    String name = s.nextLine();
                    System.out.println("Enter task description: ");
                    String description = s.nextLine();
                    TasksManagement.addTask(name, description);

                    break;

                case 2:
                    System.out.println(TasksManagement.listTask());
                    break;

                case 3:
                    System.out.println("Enter the name or description you want to search for ");
                    s.nextLine();
                    String key = s.nextLine();
                    TasksManagement.searchTask(key);

                case 4:
                    ArrayList<Tasks> allTasks = TasksManagement.listTask();
                    for (int i = 0; i < allTasks.size(); i++) {
                        System.out.println(i + "-" + allTasks.get(i).getName());

                    }
                    System.out.println("enter index: ");
                    int index = s.nextInt();
                    TasksManagement.deleteTasks(index);

                    System.out.println(TasksManagement.listTask());
                    break;

            }

        }

    }
}
