
public class Cercle<T>{
	int rayon;
	Point<T> centre;

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public Cercle(int rayon, Point<T> centre) {
		super();
		this.rayon = rayon;
		this.centre = centre;
	}

	public Point<T> getCentre() {
		return centre;
	}

	public void setCentre(Point<T> centre) {
		this.centre = centre;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", centre=" + centre + "]";
	}

	
	

}
