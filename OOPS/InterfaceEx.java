package OOPS;

public class InterfaceEx {
	public static void main(String[] args) {
		Queen q = new Queen();
		q.moves();
		Rook r = new Rook();
		r.moves();
		King k = new King();
		k.moves();
	}
}

interface ChessPlayer {
	// these function is by default abstract and public without implementation
	void moves();
}

class Queen implements ChessPlayer {
	// we need to right public because by default if we not rigth is as public it
	// gets by default
	public void moves() {
		System.out.println("up, down,, left, right, diagonal in all 4 directions");
	}
}

class Rook implements ChessPlayer {
	// we need to right public because by default if we not rigth is as public it
	// gets by default
	public void moves() {
		System.out.println("up, down,, left, right");
	}
}

class King implements ChessPlayer {
	// we need to right public because by default if we not rigth is as public it
	// gets by default
	public void moves() {
		System.out.println("up, down,, left, right, diagonal by one step");
	}
}