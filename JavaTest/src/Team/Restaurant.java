package Team;

public class Restaurant extends Store{
	
	double service;
	double flavor;
	double clean;

	public Restaurant(String name, String event, double service, double flavor, double clean, double price) {
		this.name = name;
		this.event = event;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
		this.price = price;
	}
	
	public double grade() {
		double score = (service + flavor + clean + price)/4 ;
		return score;
	}
}
