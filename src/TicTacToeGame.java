import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scanner = new Scanner(System.in);

	public static char[] createGrid() {
		char[] grid = new char[10];
		Arrays.fill(grid, ' ');
		grid[0] = '\u0000';
		return grid;
	}

	public static void main(String[] args) {
		char[] gameGrid = createGrid();
	}
}
