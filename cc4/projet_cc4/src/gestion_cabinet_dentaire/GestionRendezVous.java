package gestion_cabinet_dentaire;
import java.util.HashMap;
import java.util.Map;


public class GestionRendezVous {
	private Map<Patient, RendezVous> agenda;

    public GestionRendezVous() {
        agenda = new HashMap<>();
    }

    public void ajouterRendezVous(Patient patient, RendezVous rdv) {
        agenda.put(patient, rdv);
    }

    public void annulerRendezVous(Patient patient) {
        agenda.remove(patient);
    }

    public RendezVous obtenirRendezVous(Patient patient) {
        return agenda.get(patient);
    }


}
