
public class Bike {
	
	String model;
    String color;
    int speed;
    double price;
    
    public void setData () {
		model="Honda Unicorn";
		color="Metalic Grey";
		speed= 160;
		price= 138000.00;
	}
    
    public void setModel(String model) {
		this.model = model;
	}
    
	 public String getModel() {
		return model;
	}
	 
	 public void setColor(String color) {
			this.color = color;
		}

	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public void showData() {
		System.out.println("Bike Model:" +model);
		System.out.println("Bike Speed:" +speed);
		System.out.println("Bike Color:" +color);
		System.out.println("Bike Price:" +price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();
		b1.setData();
		b1.showData();

	}

}
