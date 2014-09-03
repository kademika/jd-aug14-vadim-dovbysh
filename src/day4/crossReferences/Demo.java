package day4.crossReferences;

public class Demo {
	public static void main(String[] args){
		
		
		ActionReferences ar1  = new ActionReferences("AR1");
		ActionReferences ar2  = new ActionReferences("AR2");
		ActionReferences ar3  = new ActionReferences("AR3");
		
		
		ar1.setAr(ar2);
		ar2.setAr(ar3);
		ar3.setAr(ar1);
		
		//System.out.println(ar1.getName() + " " + ar2.getName() + " " + ar3.getName());
		
		ar1.printAr();
		ar2.printAr();
		ar3.printAr();
		
		
		
	}

}
