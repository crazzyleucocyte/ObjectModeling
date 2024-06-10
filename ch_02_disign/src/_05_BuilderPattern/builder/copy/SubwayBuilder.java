package _05_BuilderPattern.builder.copy;

public class SubwayBuilder {
	
	//1. 맴버 변수를 동일하게 넣어줌
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private String source;
	
	
	//2. 속성의 setter메소드 구현
//		builder를 쓸때는 세터에 리턴값이 있는데 리턴값은 내 객체이다.
	/*
	 * 메서드명 지정하는 방법
	 *  1) 속성명()     : setter메소드와 구분을 위해 사용
	 *  2) set속성명()  : 일반적인 setter
	 * 	3) with속성명() : setter메소드와 구분을 위해 'with'라는 키워드 사용
	 * 
	 */
//	1) size(int size)
//	2) setSize(int size)
//	3) withSize(int size)
	
	
	//builder를 쓸때는 setter에 리턴값이 있다.
	
	public SubwayBuilder withSize(int size) {
		this.size = size;
		return this;//나 자신 객체를 반환
	}
	public SubwayBuilder Bread(String bread) {
		this.bread = bread;
		return this;
	}
	public SubwayBuilder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public SubwayBuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;
	}
	public SubwayBuilder setVagetable(boolean vagetable) {
		this.vagetable = vagetable;
		return this;
	}
	public SubwayBuilder setSource(String source) {
		this.source = source;
		return this;
	}
	
	
	//3. subway의 생성자 호출하여 객체 생성하여 리턴 : Subway 생성자 호출로
	public Subway build() {
		return new Subway(size, bread, cheese, extraTopping, vagetable, source);
	}
	
	
	@Override
	public String toString() {
		return "SubwayBuilder [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping="
				+ extraTopping + ", vagetable=" + vagetable + ", source=" + source + "]";
	}

	
	
	
	
	
	
	
}
