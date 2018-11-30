
public class Cardo {

	private String namae;
	private int stars;
	private int atk;
	private int def;
	
	public Cardo() {
		namae = "default";
		stars = 1;
		atk = 0;
		def = 0;
	}
	
	public Cardo(String name, int stars, int atk, int def) {
		namae = name;
		this.stars = stars;
		this.atk = atk;
		this.def = def;
	}
	
	public String getName() {
		return namae;
	}
	
	public int getStars() {
		return stars;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getDef() {
		return def;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		s += namae + " (" + stars + ") " + "ATK[" + atk + "] " + "DEF[" + def + "]";
		
		return s;
	}
	
}
