//Chapter 10, Exercise 9
import java.util.*;

enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}

abstract class Instrument{
	public abstract void play(Note n);
	public abstract String what();
	public abstract void adjust();
}

class Wind extends Instrument{
	public void play(Note n) {System.out.println("Wind.play()" + n);}
	public String what(){return "Wind";}
	public void adjust() {System.out.println("Adjusting Wind");}
}

class Percussion extends Instrument{
	public void play(Note n) {System.out.println("Percussion.play()" + n);}
	public String what(){return "Percussion";}
	public void adjust() {System.out.println("Adjusting Percussion");}
}

class Stringed extends Instrument{
	public void play(Note n) {System.out.println("Stringed.play()" + n);}
	public String what(){return "Stringed";}
	public void adjust() {System.out.println("Adjusting Stringed");}
}

class Brass extends Wind{
	public void play(Note n) {System.out.println("Brass.play()" + n);}
	public void adjust(){System.out.println("Adjusting Brass");}
}

class Woodwind extends Wind{
	public void play(Note n) {System.out.println("Woodwind.play()" + n);}
	public String what(){return "Woodwind";}
}
class RandomInstrumentGenerator{
    private Random rand = new Random();
    public Instrument next(){
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

public class Ex9{
    public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e){
		for(Instrument i: e) tune(i);
	}

	public static void main(String[] args){
        RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
		Instrument[] orchestra = new Instrument[10];
        for(int i = 0; i<orchestra.length; i++)
            orchestra[i] = gen.next();
        tuneAll(orchestra);
	}
}



