package ch_03_disign.copy;

public class ProductRun {

	public static void main(String[] args) {
		
		Product p1 = ProductFactory.getInstance("tv");
        System.out.print(p1);

        p1 = ProductFactory.getInstance("computer");
        System.out.print(p1);
		
        p1 = ProductFactory.getInstance("TV");
        System.out.print(p1);
		
		
	}

}
