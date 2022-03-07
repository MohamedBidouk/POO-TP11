package exercise2;

public class testPile {
	public static void main(String[]args){
		PileListe p = new PileListe();
		for(int i = 0 ; i < 10 ; i++) {
			p.empiler(new Integer(i));
			p.empiler("L'entier " + i);
		}
		for(int i = 0 ; i < 20 ; i++){
		System.out.println(p.dernier());
		p.depiler();
		}
		// Tester aussi p.empiler("L'entier " + i);
		/* System.out.println((Integer) p.dernier());

		=> Erreur à l'exécution de casting
		=> System.out.println(p.dernier());
		=> Ouverture sur les exceptions */
		/* Remplacer while(!p.estVide()) par for(int i = 0 ; i < 20 ; i++)
		=> Erreur à l'exécution lors du dépilement d'une pile vide
		=> Ouverture sur les exceptions mais surtout sur la généricité */
	}

}
