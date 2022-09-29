import java.io.*;

public class FileOI {

    public static void main(String[] args) {
        String [] names = {"Mikail", "Elisa", "Kristina"};
        try { // her skriver i filen
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")); //her opretter vi en filetekst der hedder output.txt. så det er der alt bliver skrevet
       writer.write("Hello");
       writer.write("\nName pls.");

       for(String name : names) { // den her kigger på den string array ovenover.
       writer.write("\n" + name);
       }

       writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //den her linje gør vi kan læse fra filen
        try {
            BufferedReader reader = new BufferedReader ( new FileReader("output.txt"));

            String line;
            while((line = reader.readLine()) != null){ // den her line gøre at man kan læse alt det linjer der i filen
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

