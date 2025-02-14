package Cycles;
import java.util.Random;

public class Velo {
	private static double DEFAULT_BRAQUET = 13.0;
	private double braquet;
	public double diamRoue;
	private Random genAlea = new Random();
	
	public double getDEFAULT_BRAQUET(){
		return DEFAULT_BRAQUET;
	}
	
	public void setDEFAULT_BRAQUET(double DEFAUT_BRAQUET) {
		this.DEFAULT_BRAQUET = DEFAULT_BRAQUET;
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
	}
	
	public Velo(){
		braquet = DEFAULT_BRAQUET;
	}

	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	@Override
	public String toString() {
		return "Velo[braquet=" + braquet + ", diamRoue=" + diamRoue + ']';
	}
	
	public double getPuissance(double frequenceCoupDePedale) {
		return frequenceCoupDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Velo V1 = new Velo(15.0,20.0);
		System.out.println(V1);
		System.out.println(V1.getGenAlea());
		System.out.println(V1.getPuissance(12));
		System.out.println(V1.getGenAlea());
		System.out.println(V1.getPuissance(12));
	}
}
