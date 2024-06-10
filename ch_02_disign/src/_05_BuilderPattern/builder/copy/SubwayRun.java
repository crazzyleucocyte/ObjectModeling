package _05_BuilderPattern.builder.copy;

public class SubwayRun {

	public static void main(String[] args) {
		//아래와 같이 메소드.메소드.메소드를 쓰는방법을 메소드 체이닝이라고 한다.
		//세터를 쭉 입력 하다가 마지막에 빌드를 써서 객체를 생성한다.
		Subway menu1 = new SubwayBuilder()
				.Bread("flat").withSize(15)
				.setCheese("슈레드")
				.setSource("pepper")
				.setExtraTopping("에그마요")
				.build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder().withSize(30).Bread("파마산").setCheese("아메리칸").setVagetable(true).build();
		System.out.println(menu2);

		Subway menu3 = new SubwayBuilder().withSize(30).build();
		System.out.println(menu3);
	}

}
