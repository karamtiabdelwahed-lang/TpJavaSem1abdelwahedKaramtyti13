
import java.util.*;

public class EX3 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase :");
        String phrase = scanner.nextLine();

       
        String[] mots = phrase.split("\\s+");

       
        HashMap<String, Integer> hm = new HashMap<>();
        for (String mot : mots) {
            if (!mot.isEmpty()) { 
                hm.put(mot, hm.getOrDefault(mot, 0) + 1);
            }
        }

       
        System.out.println("Occurrences des mots : " + hm);
    }
}
