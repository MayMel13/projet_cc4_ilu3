package gestion_cabinet_dentaire;


public class Patient implements Comparable<Patient> {
    private String nom;
    private String prenom;
    private int age;
    private String dateNaissance;
    
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String numeroTelephone;

    public Patient(String nom, String prenom, int age, String dateNaissance, String numeroTelephone) {
        this.nom = nom;
        this.setPrenom(prenom);
        this.age = age;
        this.setDateNaissance(dateNaissance);
        this.setNumeroTelephone(numeroTelephone);
    }

    @Override
    public int compareTo(Patient autrePatient) {
        // D'abord, comparer par âge
        int comparaisonAge = Integer.compare(this.age, autrePatient.age);
        if (comparaisonAge != 0) {
            return comparaisonAge;
        }
        
        // Si les âges sont égaux, comparer par nom
        return this.nom.compareTo(autrePatient.nom);
    }

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

    
}
