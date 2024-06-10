package ch_03_disign.copy;

public class Product {
	private String name;
    private int price;

    public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
        this.name = name;
        if(name.equalsIgnoreCase("tv")) {
            price = 300;
        } else if(name.equalsIgnoreCase("computer")) {
            price = 200;
        }
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
	

}
