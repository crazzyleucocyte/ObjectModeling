package _06_BuilderPattern.builder.copy.copy;

import java.util.Scanner;

public class SubwayRun {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//아래와 같이 메소드.메소드.메소드를 쓰는방법을 메소드 체이닝이라고 한다.
		//세터를 쭉 입력 하다가 마지막에 빌드를 써서 객체를 생성한다.
		Subway menu1 = new SubwayBuilder(15,"flat","pepper")
				.setCheese("슈레드")
				.setExtraTopping("에그마요")
				.build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder(30,"파마산","바베큐").setCheese("아메리칸").setVagetable(true).build();
		System.out.println(menu2);

//		Subway menu3 = new SubwayBuilder().withSize(30).build();
//		System.out.println(menu3);
		
		SubwayBuilder sb = new SubwayBuilder(30, "화이트", "머스타드")/* .setCheese("모짜렐라") */;
		sb.build();
		
		System.out.println("추가 토핑을 선택하세요 : ");
		String topping = s.nextLine();
		
		Subway menu3= sb
				.setExtraTopping(topping)
				.build();
		System.out.println(menu3);
		
		
		
	}

}
