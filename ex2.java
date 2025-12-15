  import java.util.ArrayList;

public class ex2{
  


    public static void main(String[] args) {
        // 1. Créer une ArrayList contenant les employés
        ArrayList<String> employes = new ArrayList<>();
        employes.add("Ali_1500");
        employes.add("Mohamed_2300");
        employes.add("Khaled_1750");

        // 2. Vérifier si un employé donné est présent
        String nomRecherche = "Mohamed";
        boolean trouve = false;
        for (String emp : employes) {
            if (emp.startsWith(nomRecherche + "_")) {
                trouve = true;
                break;
            }
        }
        System.out.println(nomRecherche + (trouve ? " est présent." : " n'est pas présent."));

        // 3. Modifier le salaire de l’employé Ali en ajoutant 200d
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).startsWith("Ali_")) {
                String[] parts = employes.get(i).split("_");
                int nouveauSalaire = Integer.parseInt(parts[1]) + 200;
                employes.set(i, "Ali_" + nouveauSalaire);
                break;
            }
        }

        // 4. Compter et afficher le nombre d’employés avec salaire < 2000
        int compteur = 0;
        for (String emp : employes) {
            String[] parts = emp.split("_");
            int salaire = Integer.parseInt(parts[1]);
            if (salaire < 2000) {
                compteur++;
            }
        }
        System.out.println("Nombre d'employés avec salaire < 2000 : " + compteur);

        // Affichage final de la liste
        System.out.println("Liste mise à jour des employés : " + employes);
    
}
}