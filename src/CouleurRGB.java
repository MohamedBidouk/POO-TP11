
public class CouleurRGB {
	int red;
	int green;
	int blue;
	public int getRed() {
		return red;
	}
	public void setRed(int red) {
		this.red = red;
	}
	public int getVert() {
		return green;
	}
	public void setVert(int vert) {
		this.green = vert;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		this.blue = blue;
	}
	public CouleurRGB(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	@Override
	public String toString() {
		return "RVB [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}
	
}
