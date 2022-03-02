
public class CercleAvecRestriction<T2 extends Point> {
	int rayon;
	T2 centre;
	public int getRayon() {
		return rayon;
	}
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	public T2 getCentre() {
		return centre;
	}
	public void setCentre(T2 centre) {
		this.centre = centre;
	}
	public CercleAvecRestriction(T2 centre, int rayon) {
		this.rayon = rayon;
		this.centre = centre;
	}
	@Override
	public String toString() {
		return "CercleAvecRestriction [rayon=" + rayon + ", centre=" + centre + "]";
	}
	
	

}
