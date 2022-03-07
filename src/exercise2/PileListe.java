package exercise2;

public class PileListe<T> implements Pile<T>{
	private Noeud<T> sommet;
	public PileListe(){
	sommet = null;
	}
	public boolean estVide(){
	return (sommet == null);
	}
	public Object dernier(){
	return sommet.info;
	}
	public void empiler(Object o){
	Noeud<T> n = new Noeud<T>();
	n.info = o;
	n.suivant = sommet;
	sommet = n;
	}
	public void depiler(){
		sommet = sommet.suivant;
	}
}
