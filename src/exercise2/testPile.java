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
	}

}
