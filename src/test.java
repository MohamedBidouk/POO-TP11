
public class test {

	public static void main(String[] args) {
		Point <Integer>P1 = new Point('M', 131, 34);
		Point <Double>P2 = new Point('A', 123.4, 324.7);
		P1.toString();
		P2.toString();
		System.out.println(P1+"\n"+P2);
		pointColor�NG pcng1 = new pointColor�NG('S', 240, 450,"Vert");
		pcng1.toString();
		System.out.println("\n"+pcng1);	
		PointColor� pc1 = new PointColor�('C', 120, 23,"Happy");
		pc1.toString();
		System.out.println("\n"+pc1);	
		CouleurRGB couleur = new CouleurRGB(150,230,220);
		PointColor� pc2 = new PointColor�('C', 120, 23,couleur);
		System.out.println("\n"+pc2);	
		Cercle c1 = new Cercle(50, P1);
		System.out.println("\n"+c1);
		CercleAvecRestriction car1 = new CercleAvecRestriction(P2, 100); 
		System.out.println("\n"+car1);
		CercleAvecRestriction car2 = new CercleAvecRestriction(P1, 50); 
		System.out.println("\n"+car1);
	}

}
