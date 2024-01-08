package gestion_cabinet_dentaire;

public class RendezVous {
	private String date;
    private String heure;

    public RendezVous(String date, String heure) {
        this.setDate(date);
        this.setHeure(heure);
    }

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}


}
