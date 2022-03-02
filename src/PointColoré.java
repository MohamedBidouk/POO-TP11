
public class PointColor�<T1, T2> extends Point<T1> {
	T2 couleur;

	public T2 getCouleur() {
		return couleur;
	}

	public void setCouleur(T2 couleur) {
		this.couleur = couleur;
	}

	public PointColor�(char nom, T1 abs, T1 ord, T2 couleur) {
		super(nom, abs, ord);
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "PointColor� [couleur=" + couleur + ", toString()=" + super.toString() + "]";
	}
	
}
