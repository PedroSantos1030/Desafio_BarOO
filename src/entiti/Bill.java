package entiti;

public class Bill {
    public final double cover = 4.0;
	public char gender;
	public int beer;
	public int softDrink = 3;
	public int barbecue = 7;

	public double feeding() {
		double beer = this.beer * 5.0;
		double softDrink = this.softDrink * 3.0;
		double barbecue = this.barbecue * 7;
		return beer + softDrink + barbecue;
	}

	public String cover() {
		if (feeding() > 30.0) {
			return "Isento de Couvert";

		} else {
			return "Couvert = 4.0";
		}

	}

	public double ticket() {
		if (gender == 'M') {
			return 10.0;
		} else if (gender == 'F') {
			return 8.0;
		} else {
			return 0.0;
		}
	}

	public double total() {
		if (feeding() <= 30.0) {
			return feeding() + cover + ticket();	
		}
		else {
			return feeding() + ticket();
		}
		
	}

}
