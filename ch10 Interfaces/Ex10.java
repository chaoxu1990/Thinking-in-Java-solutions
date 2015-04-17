//Chapter 10, Exercise 10
import java.util.*;

enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}
interface Playable{
	public void play(Note n);
}
abstract class Instrument{
	public abstract String what();
	public abstract void adjust();
}

class Wind extends Instrument implements Playable{
	public void play(Note n) {System.out.println("Wind.play()" + n);}
	public String what(){return "Wind";}
	public void adjust() {System.out.println("Adjusting Wind");}
}

class Percussion extends Instrument implements Playable{
	public void play(Note n) {System.out.println("Percussion.play()" + n);}
	public String what(){return "Percussion";}
	public void adjust() {System.out.println("Adjusting Percussion");}
}

class Stringed extends Instrument implements Playable{
	public void play(Note n) {System.out.println("Stringed.play()" + n);}
	public String what(){return "Stringed";}
	public void adjust() {System.out.println("Adjusting Stringed");}
}

class Brass extends Wind implements Playable{
	public void play(Note n) {System.out.println("Brass.play()" + n);}
	public void adjust(){System.out.println("Adjusting Brass");}
}

class Woodwind extends Wind implements Playable{
	public void play(Note n) {System.out.println("Woodwind.play()" + n);}
	public String what(){return "Woodwind";}
}
class RandomInstrumentGenerator{
    private Random rand = new Random();
    public Playable next(){
        switch(rand.nextInt(5)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
        }
    }
}

public class Ex10{
    public static void tune(Playable i){
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Playable[] e){
		for(Playable i: e) tune(i);
	}

	public static void main(String[] args){
        RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
		Playable[] orchestra = new Playable[10];
        for(int i = 0; i<orchestra.length; i++)
            orchestra[i] = gen.next();
        tuneAll(orchestra);
	}
}




