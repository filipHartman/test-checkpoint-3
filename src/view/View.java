package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class View {
    public static ArrayList<String> menu = new ArrayList<>(
            Arrays.asList(  "Add book",
                            "Edit book",
                            "Delete book",
                            "Search for books",
                            "Display books",
                            "Search for book by given book")
    );

    public void showMenu(){
        int counter = 1;
        System.out.println("Menu:\n");
        for(String option : menu){
            System.out.println(counter++ + ". " + option);
        }
        System.out.println("0. Exit");
    }
    public String getUserInput(String msg){
        System.out.print(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
