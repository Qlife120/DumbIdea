package ma.emsi.chemlal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String filePath = "input_data/a_an_example.in.txt";
        List<String> liked = new ArrayList<>();
        List<String> disliked = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            int n = Integer.parseInt(scanner.nextLine().trim());


            int cpt = 0;
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                cpt+=1;
                String[] parts = line.split(" ");

                if (cpt%2!=0) {

                    for (int i = 1; i < parts.length; i++) {
                        liked.add(parts[i]);
                    }
                } else {

                    for (int i = 1; i < parts.length; i++) {
                        disliked.add(parts[i]);
                    }
                }
            }


            // print the liked and disliked
            System.out.println("Liked: " + liked);
            System.out.println("Disliked: " + disliked);

            // if an ingredient is liked and disliked, it should be removed.
            List<String> finalResult = new ArrayList<>();
            for (String ingredients : liked) {
                if (!disliked.contains(ingredients)) {
                    finalResult.add(ingredients);
                }
            }

            int numberOfIngredients = finalResult.size();

            try (FileWriter writer = new FileWriter("result.txt")) {
                writer.write(numberOfIngredients + " ");
                for (String ingredient : finalResult) {
                    writer.write(ingredient + " ");

                }
            }
            // print the result
            System.out.println("Result: " + finalResult);



        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }


}
