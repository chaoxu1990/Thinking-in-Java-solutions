//exercise 11

package chaoxu.ucdavis.edu;


public class Ex11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllTheColorsOfTheRainbow COR = new AllTheColorsOfTheRainbow();
		COR.anIntegerRepresentingColors = 3;
		COR.hueOfTheColor = 5;
		System.out.println(COR.hueOfTheColor);
		COR.changeTheHueOfTheColor(8);
		System.out.println(COR.hueOfTheColor);
		
		
	}
}
class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	int hueOfTheColor;
	void changeTheHueOfTheColor(int newHue) {
		this.hueOfTheColor = newHue;
	}
	}
