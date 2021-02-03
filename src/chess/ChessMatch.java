package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.*;


public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumns()];
		for(int row=0; row<board.getRow(); row++) {
			for(int column=0; column<board.getRow(); column++) {
				mat[row][column] = (ChessPiece) board.piece(row,column);
				
			}
		}
		return mat;
	}
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(2,1));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
		
		
	}
}
