//Ex8.java

class Connection{
	private Connection(){System.out.println("Connection()");}
	private static int cnt = 0;
	static Connection  makeConnection(){
		cnt++;
		return new Connection();
	}
	public static int howMany()	{return cnt;}
}


public class Ex8{
	static int howManyLeft = 3;
	static Connection[] ca = new Connection[3];
	{
	for(Connection x: ca)
		x = Connection.makeConnection();
	}
	public static Connection getConnection(){
		if(howManyLeft > 0)
			return ca[--howManyLeft];
		else {
			System.out.println("No more connections!");
			return null;
		}
	}


	public static void main(String[] args){
		Ex8 cm = new Ex8();
		
		for(int i = 4; i > 0; i++){
		if(cm.howManyLeft<0) break;
		System.out.println(cm.howManyLeft);
		cm.getConnection();
		}
		}
}