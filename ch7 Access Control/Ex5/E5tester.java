//E5tester.java
/*
//same director
* package Ex5;
* public class E5 {
*		int def = -1;
*		public int pub = 0;
*		protected int pro = 1;
*		private int pri = 2;
*		
*		void def1(){ System.out.println("def1()");}
*		public void pub1() {System.out.println("pub1()");}
*		protected void pro1() {System.out.println("pro1()");}
*		private void pri1() {System.out.println("pri1()");}
*}
*/
package Ex5;

public class E5tester{
	public static void main(String [] args){
		E5 a = new E5();
		System.out.println(a.def);
		System.out.println(a.pub);
		System.out.println(a.pro);
		//can not access		
		//System.out.println(a.pri);
		a.def1();
		a.pub1();
		a.pro1();
		//can not access
		//a.pri1();
		
	}
}