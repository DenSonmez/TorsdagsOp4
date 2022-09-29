import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu;

   public Cafe() {
       this.coffeeMenu = new ArrayList<>();

   }
    public void loadDate(){


    try {
        File file = new File("coffees.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()) {
            coffeeMenu.add(scan.nextLine());
        }
    }
    catch(Exception e) {
        System.out.println("File is not found");


}

    }
    }

