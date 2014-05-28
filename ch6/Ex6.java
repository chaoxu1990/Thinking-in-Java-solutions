//Ex6

class Dog{
	void bark(){System.out.println("BARK!");}
	void bark(char i){System.out.println("A! " + i);}
	void bark(byte i){System.out.println("B! " + i);}
	void bark(short i){System.out.println("C! " + i);}
	void bark(int i){System.out.println("D! " + i);}
	void bark(long i){System.out.println("E! " + i);}
	void bark(float i){System.out.println("F! " + i);}
	void bark(double i){System.out.println("G! " + i);}
	void bark(int i, char c){System.out.println("H! " + i + c);}
	void bark(char c, int i){System.out.println("I! " + c + i);}

}
public class Ex6{
	
	public static void main(String[] args){
	
	Dog d = new Dog();
		char c = 'c';
		byte b = 0;
		short s = 0;
		d.bark();
		d.bark((char)c);
		d.bark((byte)b);
		d.bark((short)s);
		d.bark(1);
		d.bark(1L);
		d.bark(1.0f);
		d.bark(1.0);
		d.bark(1,c);
		d.bark(c,1);

	}
}