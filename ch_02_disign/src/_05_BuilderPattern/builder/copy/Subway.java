package _05_BuilderPattern.builder.copy;

public class Subway {
	
	
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private String source;
	
	
	public Subway(int size, String bread, String cheese) {
		super();
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
	}
	public Subway(int size, String bread) {
		super();
		this.size = size;
		this.bread = bread;
	}
	public Subway(int size, String bread, String cheese, String extraTopping, boolean vagetable, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		this.vagetable = vagetable;
		this.source = source;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public void setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
	}
	public void setVagetable(boolean vagetable) {
		this.vagetable = vagetable;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping=" + extraTopping
				+ ", vagetable=" + vagetable + ", source=" + source + "]";
	}
	
	
	
	
	
}
