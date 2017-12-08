package chessgame;
import java.lang.*;
public class rooks extends pieces
{
  rooks(String colour)
    {
	  colourpieces=colour;
	  status=0;
	  type "r";
    }
   boolean validMoveOfPiece(int xi,int yi,int xf,int yf)
	{
	 if((xi-xf)==0 || (yi-yf)==0)
	  {
		  return true;
      }	  
	  else
	  {
		  return false;
      }	  	
	}
}