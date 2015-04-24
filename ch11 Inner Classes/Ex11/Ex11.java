//Why ok in Eclipse but error in terminal??

package Ex11;
class test{
	private class inner implements A{
		public void show(){System.out.println("Hello World!");}
	}
	public inner creator(){
		return new inner();
	}
}
public class Ex11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		A a = t.creator();//upcast to base interface;
		a.show();

		//error: test.inner is not visiable;
		//(test.inner)a.show();

	}

}

