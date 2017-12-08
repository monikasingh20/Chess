package chessgame;
import java.lang.*;
public class queen extends pieces
{
  queen(String colour)
    {
	  colourpieces=colour;
	  status=0;
	  type="q";
    }
   boolean validMoveOfPiece(int xi,int yi,int xf,int yf)
	{
	  if(Math.abs(xi-xf) == Math.abs(yi-yf))
	    {
	      return true;
	    }
	  
	  else if((xi-xf)==0 || (yi-yf)==0)
	    {
		   return true;
        }
	  
	  else
	  {
		  return false;
	  }	
    }
}
	