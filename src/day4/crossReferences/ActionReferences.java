package day4.crossReferences;

public class ActionReferences {

	private String name;
	private ActionReferences ar;

	//конструктор
	public ActionReferences(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public void setAr(ActionReferences ar) {
		this.ar = ar;
	}
	
	ActionReferences getAr(){
		return ar;
	}
	
	
	void printAr(){
	System.out.println(name + " -> " + ar.getName());
	}
	
  
}
