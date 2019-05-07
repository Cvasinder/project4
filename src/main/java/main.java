
/*cam vasbinder*/

import java.util.Collections;

import java.util.Scanner;





public class main {



    private static TaskList taskList = new TaskList();

    private static boolean running = true;

    private static Scanner scan = new Scanner(System.in);



    private static void displayMenu(){ //Display menu and ask for a menu option every loop



        System.out.println("--------------\n" +

                "Choose an option: \n" +

                "(1) Add a Task \n" +

                "(2) Remove a Task \n" +

                "(3) Edit a Task \n" +

                "(4) List Tasks \n" +

                "(5) List Tasks according to priority\n" +

                "(0) Exit");

        String input = scan.nextLine();



        switch(input){

            case "1": taskList.addTask(); //Run add task method in taskList

                break;

            case "2": taskList.remTask(); //Run remove task method in taskList

                break;

            case "3": taskList.editTask(); //Run edit task method in taskList

                break;

            case "4":

                Collections.sort(taskList.taskList);

                for(Task task: taskList) {

                    System.out.println(task.getTaskNum() +") " + task.getTitle() + " ~ " + task.getPriority() +"\n" + task.getDescription());

                }//Run list task method in taskList

                break;

            case "5": taskList.listTasksPriority(); //Run listTaskPriority method in taskList

                break;

            case "0":

                taskList.json();

                running=false; //Exit program

                break;

            default:

                System.out.println("Input not valid"); //Invalid input

        }

    }

    public static void main(String[] args) {



        while(running){ //While program is running, keep asking for options

            displayMenu();

        }

    }

}