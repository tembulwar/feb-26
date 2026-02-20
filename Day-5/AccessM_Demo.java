class xyz{
	xyz(){System.out.println("0 Para. constr. of parent");}
	xyz(int a){System.out.println(" 1 Para. constr. of parent");}
}
class AccessM extends xyz{
		int x=10;
		public int x1=10;
		 protected int x2=10;
		private int x3=10;
	 AccessM(){
		this(10);
		System.out.println("0 Para. constr.");
	
	}
	AccessM(int a){
		super(10);
		System.out.println("1 Para. constr.");

	}
	AccessM(int a, int b){
		System.out.println("2 Para. constr.");

	}
}
class AccessM_Demo{
	public static void main(String args[]){
		AccessM amObj = new AccessM();













		//System.out.println(amObj.x);
		//System.out.println(amObj.x1);
		//System.out.println(amObj.x2);
		//System.out.println(amObj.x3);	
	}
}




/*

public 
private
protected
default


*/