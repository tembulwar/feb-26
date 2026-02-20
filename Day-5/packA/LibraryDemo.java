package packA;


class LibraryDemo {

	public static void main(String args[]){
	Library obj = new Library();

	
	System.out.println(obj.address);
	System.out.println(obj.name);
	System.out.println(obj.membershipCost);
	System.out.println(obj.id);

	System.out.println(obj.subscription());
	
	}


}