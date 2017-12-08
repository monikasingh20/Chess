package chessgame;
public abstract class pieces
{
String colourpieces;
int status;
String type;
int x,y;
abstract boolean validMoveOfPiece(int xi,int yi,int xf,int yf);

}