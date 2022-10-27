package card;

public class Ex01 {
	// ┌,│,─,┐,┘,└
	
	static void draw(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("┌ ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int width = 5;
		int height = 7;
		
		draw(width, height);
	}

}
