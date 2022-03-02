
public class pointColoréNG extends Point<Integer>{
	private String couleur;

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	

	public pointColoréNG(char nom, Integer abs, Integer ord, String couleur) {
		super(nom, abs, ord);
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "pointColoréNG [couleur=" + couleur + ", toString()=" + super.toString() + "]";
	}


}
