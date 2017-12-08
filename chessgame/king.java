package chessgame;
import java.lang.*;
public class king extends pieces
{
  king(String colour)
    {
	  colourpieces=colour;
	  status=0;
	  type="k";
    }
   boolean validMoveOfPiece(int xi,int yi,int xf,int yf)
	{
	     if((Math.abs(xi-xf)==1&& Math.abs(yi-yf)==1))
	    {   
	        return true;
	    }
		else if(( Math.abs(xi-xf)==1&& Math.abs(yi-yf)==0))
	    {   
	        return true;
	    }
		else if((Math.abs(xi-xf)==0&& Math.abs(yi-yf)==1))
	   {   
	        return true;
	    }
	   else
	    {
		   return  false;
	    }	
	
	}
}
 