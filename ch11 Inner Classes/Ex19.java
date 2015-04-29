public class Ex19{
	public static class inner{
		public void f(){System.out.println("inner class!");}
		public static class inner2{
			public void f(){System.out.println("inner class 2!");}
		}
	}
	
	public static void main(String[] args){
		inner i = new inner();
		i.f();
		inner.inner2 i2 = new inner.inner2();
		i2.f();
	}
}