package _04_BuilderPattern.ex;

public class SubwayRun {

	public static void main(String[] args) {
		
		Subway menu1 = new Subway(15,"화이트","슈레드");
//		menu1.setSize(15);
//		menu1.setBread("Parmesan");
//		menu1.setCheese("American Cheese");
//		menu1.setSource("BBQ, Olive Oil");
//		menu1.setExtraTopping("Avocado");
//		menu1.setVagetable(true);
		System.out.println(menu1);
		
		//매개변수가 너무 많으면 순서도 햇갈리고,ㅏ 중간에 안넣을려면 null을 넣어줘야함
		menu1 = new Subway(30,"하티","아메리칸",null,false,"올리브오일");
		menu1.setCheese("American Cheese");
		menu1.setSource("Black Pepper, Olive Oil");
		menu1.setExtraTopping("mayo");
		menu1.setVagetable(true);
		System.out.println(menu1);
		
	}

}
