package chessgame;
public class pawns extends pieces
{
pawns(String colour)
{
	colourpieces=colour;
	status=0;
	type ="p";
}
    boolean validMoveOfPiece(int xi,int yi,int xf,int yf)
	{
		if((yi-yf)==0)
		{
			if(colourpieces=="white" && xi==1)
	        {
		      if((xf-xi)==2||(xf-xi)==1)
		        {
			       return true;
		        }
		  
		      else
		        {
			       return false;
		        }
	        }
			else if(colourpieces=="black" && xi==6)
            {
		       if((xf-xi)==-2||(xf-xi)==-1)
		        {
			      return true;
		        }
		  
		       else
		        {
			       return false;
		        }
	        }
			else 
				return false;
			
		}
		return false;
    }
}
