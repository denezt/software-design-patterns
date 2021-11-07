
class Main {

	public static void main(String[] args){
		Square square = new Square();
		square.calculateArea();
		System.out.println("Value of square: " + String.valueOf(square.side));

		SquareUI squareUI = new SquareUI();
		for ( int i = 0; i < 100; i++) {
			if ((i * square.side) > 0){
				squareUI.rotate(i * 5 * square.side);
			}
		}
	}
}
