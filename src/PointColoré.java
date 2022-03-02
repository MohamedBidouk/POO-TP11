
public class PointColoré<T1, T2> extends Point<T1> {
	T2 couleur;

	public T2 getCouleur() {
		return couleur;
	}

	public void setCouleur(T2 couleur) {
		this.couleur = couleur;
	}

	public PointColoré(char nom, T1 abs, T1 ord, T2 couleur) {
		super(nom, abs, ord);
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "PointColoré [couleur=" + couleur + ", toString()=" + super.toString() + "]";
	}
	
}
