abstract class Piece {
    boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public abstract String toString();
}

class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String toString() {
        return isWhite ? "K" : "k";
    }
}

class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String toString() {
        return isWhite ? "Q" : "q";
    }
}

class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String toString() {
        return isWhite ? "R" : "r";
    }
}

class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String toString() {
        return isWhite ? "B" : "b";
    }
}

class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String toString() {
        return isWhite ? "N" : "n";
    }
}

class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String toString() {
        return isWhite ? "P" : "p";
    }
}
