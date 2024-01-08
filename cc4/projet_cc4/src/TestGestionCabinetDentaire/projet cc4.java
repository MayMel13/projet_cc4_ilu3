package TestGestionCabinetDentaire;
import gestion_cabinet_dentaire.GestionRendezVous;
import gestion_cabinet_dentaire.RendezVous;
import gestion_cabinet_dentaire.DossiersPatients;
import gestion_cabinet_dentaire.Patient;

public class TestGestionCabinetDentaire {
	public static void main(String[] args) {
        // Création de l'instance de gestion des rendez-vous
        GestionRendezVous gestionRendezVous = new GestionRendezVous();

        // Création de patients
        Patient charlotte = new Patient("Charlotte", "Dupont", 30, "1990-01-01", "123456789");
        Patient bertrand = new Patient("Bertrand", "Martin", 40, "1980-02-02", "987654321");
        Patient eloise = new Patient("Eloise", "Durand", 25, "1995-03-03", "111222333");

        // Création de rendez-vous
        RendezVous rdvCharlotte = new RendezVous("2024-01-01", "10:00");
        RendezVous rdvBertrand = new RendezVous("2024-02-02", "11:00");
        RendezVous rdvEloise = new RendezVous("2024-03-03", "12:00");

        // Ajout de rendez-vous
        gestionRendezVous.ajouterRendezVous(charlotte, rdvCharlotte);
        gestionRendezVous.ajouterRendezVous(bertrand, rdvBertrand);
        gestionRendezVous.ajouterRendezVous(eloise, rdvEloise);

        // Affichage des rendez-vous
        System.out.println("Rendez-vous d'Alice: " + gestionRendezVous.obtenirRendezVous(charlotte).getDate() + " à " + gestionRendezVous.obtenirRendezVous(charlotte).getHeure());
        System.out.println("Rendez-vous de Bob: " + gestionRendezVous.obtenirRendezVous(bertrand).getDate() + " à " + gestionRendezVous.obtenirRendezVous(bertrand).getHeure());

        // Annulation d'un rendez-vous
        gestionRendezVous.annulerRendezVous(bertrand);

        // Vérification de l'annulation
        if (gestionRendezVous.obtenirRendezVous(bertrand) == null) {
            System.out.println("Rendez-vous de Bob annulé.");
        }

        // Gestion des dossiers patients
        DossiersPatients dossiersPatients = new DossiersPatients();
        dossiersPatients.ajouterPatient(charlotte);
        dossiersPatients.ajouterPatient(bertrand);
        dossiersPatients.ajouterPatient(eloise);

        // Affichage des patients triés
        System.out.println("Patients triés :");
        for (Patient patient : dossiersPatients.getPatientsTries()) {
            System.out.println(patient.getNom() + ", " + patient.getAge() + " ans");
        }
    }

}
