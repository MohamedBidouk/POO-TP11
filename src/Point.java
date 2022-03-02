
public class Point<T> {
	private char nom;
	private T abs;
	private T ord;
	public Point(char nom, T abs, T ord) {
		super();
		this.nom = nom;
		this.abs = abs;
		this.ord = ord;
	}
	public char getNom() {
		return nom;
	}
	public void setNom(char nom) {
		this.nom = nom;
	}
	public T getAbs() {
		return abs;
	}
	public void setAbs(T abs) {
		this.abs = abs;
	}
	public T getOrd() {
		return ord;
	}
	public void setOrd(T ord) {
		this.ord = ord;
	}
	@Override
	public String toString() {
		return "Point [nom=" + nom + ", abs=" + abs + ", ord=" + ord + "]";
	}
	

}
