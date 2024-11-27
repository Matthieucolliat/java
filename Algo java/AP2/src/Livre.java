public class Livre {
    private String id;
    private String titre;
    private String auteurId; // Référence à un auteur
    private String datePublication;

    public Livre(String id, String titre, String auteurId, String datePublication) {
        this.id = id;
        this.titre = titre;
        this.auteurId = auteurId;
        this.datePublication = datePublication;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteurId() {
		return auteurId;
	}

	public void setAuteurId(String auteurId) {
		this.auteurId = auteurId;
	}

	public String getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(String datePublication) {
		this.datePublication = datePublication;
	}

}
