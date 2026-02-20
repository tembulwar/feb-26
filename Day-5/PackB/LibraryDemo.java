package PackB;
import packA.Library;

class LibraryDemo extends Library{

	public static void main(String args[]){
	Library obj = new Library();

	LibraryDemo objDemo = new LibraryDemo();

	
	System.out.println(obj.address);
	/*System.out.println(obj.name);
	System.out.println(obj.membershipCost);
	System.out.println(obj.id);*/

			System.out.println(objDemo.subscription());
	
	}


}