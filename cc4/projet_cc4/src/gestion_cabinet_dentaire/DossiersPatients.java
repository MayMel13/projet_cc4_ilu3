package gestion_cabinet_dentaire;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.NavigableSet;



public class DossiersPatients implements Iterable<Patient> {
    private NavigableSet<Patient> patients;

    public DossiersPatients() {
        patients = new TreeSet<>();
    }

    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }

    public NavigableSet<Patient> getPatientsTries() {
        return patients;
    }

    @Override
    public Iterator<Patient> iterator() {
        return patients.iterator();
    }
}



