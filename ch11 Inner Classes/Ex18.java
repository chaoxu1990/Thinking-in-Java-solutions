public class Ex18{
	public static class inner{
		public void f(){System.out.println("inner class!");}
	}
	
	public static void main(String[] args){
		inner i = new inner();
		i.f();
	}
}