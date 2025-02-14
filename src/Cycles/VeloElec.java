package Cycles;



class VeloElec extends Velo{
	private double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double facteurPuissanceMoteur) {
		super(braquet,diamRoue);
		facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public VeloElec(double diamRoue, double facteurPuissanceMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double DEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		this.DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
		
	}
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	@Override
	public String toString() {
		return "VeloElec[facteurPuissanceMoteur=" + facteurPuissanceMoteur +  ']';
	}
	
	@Override
	public double getPuissance(double frequenceCoupsDePedale) {
		return super.getPuissance(frequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec V1 = new VeloElec(15.0,20.0,6);
		System.out.println(V1);
		System.out.println(V1.getPuissance(12));
		V1.setBraquet(13.0);
		System.out.println(V1.getBraquet());
		System.out.println(V1.getPuissance(12));
	}
}
