package Team;

public  class Salon extends Store {
	double technology;
	double kindness;
	
	public Salon(String name, String event, double technology, double kindness, double price) {
		this.name = name;
		this.event = event;
		this.technology = technology;
		this.kindness = kindness;
		this.price = price;
	}
	
	public double grade() {
		double score = (technology + kindness + price)/3 ;
		return score; 
	}
}
