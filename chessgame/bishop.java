package chessgame;
import java.lang.*;
public class bishop extends pieces
{
  bishop(String colour)
    {
	  colourpieces=colour;
	  status=0;
    }
   boolean validMoveOfPiece(int xi,int yi,int xf,int yf)
	{
	   if(Math.abs(xi-xf) == Math.abs(yi-yf))
	    {
	        return true;
	    }
	   else
	    {
		   return  false;
	    }	
	
	}
}