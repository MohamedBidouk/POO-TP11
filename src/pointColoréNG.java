
public class pointColor�NG extends Point<Integer>{
	private String couleur;

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	

	public pointColor�NG(char nom, Integer abs, Integer ord, String couleur) {
		super(nom, abs, ord);
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "pointColor�NG [couleur=" + couleur + ", toString()=" + super.toString() + "]";
	}


}
