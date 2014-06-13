//Third.java

import A.*;
public class Third {
	public static void main(String [] args){
		First fst = new First();
		fst.f();
		Second sec = new Second();
		sec.s();// Wrong! s() is a protected method, can not be accessed out of the package.
	}
}