package ch.hearc.jee.bean;

public class FirstBean {

	private String test;
	
	public FirstBean() {
		this.test = "default";
	}
	
	public FirstBean(String test) {
		this.test = test;
	}

	

	@Override
	public String toString() {
		return "FirstBean [test=" + test + "]";
	}
	
	
}
