package ch_03_disign.copy;

public class ProductFactory {
	
	public static Product getInstance(String name) {
		
		Product product = new Product();
		if(name.equalsIgnoreCase("tv")){//equalsIgnoreCases는 대소문자 가리지 않음
			product.setName("Tv");
			product.setPrice(300);
		}else if(name.equalsIgnoreCase("computer")) {
			product.setName("Computer");
			product.setPrice(200);
		}return product;
			
			
			
		}
		
	}


