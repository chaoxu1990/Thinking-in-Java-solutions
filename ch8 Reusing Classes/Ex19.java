
public class Ex19{
	final String s;
	//final blank must be initialized.
	Ex19(String in){this.s = in;}
	public static void main(String[] args){
			Ex19 a = new Ex19("Hello World!");
			//a.s = "Hello";
			//can't change the final variable.
			System.out.println(a.s);
		}
}