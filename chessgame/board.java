package chessgame;
import java.lang.*;
public class board
{
	        square[][] sq=new square[8][8];
		king[] k=new king[2];
		queen[] q=new queen[2];
		bishop[] bis=new bishop[4];
		kinght[] knig=new knight[4];
		rook[] ro=new rook[4];
		pawns[] pa=new pawns[16];
         board()
	     {
		for(int i=0;i<8;i++)
		{
		  for(int j=0;j<8;j++)
		  {
		     sq[i][j]=new square();
		  }			  
		}
	         k[0]=new king("white");
		 k[1]=new king("black");
		 q[0]=new queen("white");
		 q[1]=new queen("black");
		 bis[0]=new bishop("white");
		 bis[1]=new bishop("white");
		 bis[2]=new bishop("black");
		 bis[3]=new bishop("black");
	         ro[0]=new rook("white");
		 ro[1]=new rook("white");
		 ro[2]=new rook("black");
		 ro[3]=new rook("black");
		 knig[0]=new knight("white");
		 knig[1]=new knight("white");
		 knig[2]=new knight("black");
		 knig[3]=new knight("black");
		 for(int j=0;j<8;j++)
		  {
		      pa[j]=new pawns("white"); 
		  }	
		  for(int j=8;j<16;j++)
		  {
			 pa[j]=new pawns("black"); 
		  }
	}
	public void display()
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
			  if(board.sq[i][j].p1==null)
			    {
				   System.out.println("__");
			    }  
			  else if(board.sq[i][j].p1.colour=="white");
			    {
                               System.out.println(Character.toUpperCase(board.sq[i][j].p1.type));  
			    }
		          else 
			    {
			       if(board.sq[i][j].p1.colour=="black")
			       System.out.println(Character.toLowerCase(board.sq[i][j].p1.type));  
			    }
         	        }
		 }
	}
	
       public Piece typeOfPiece(int xi,int yi)
        {
	  return sq[xi][yi].p1;  
        }
   boolean move(String color,int xi,int yi,int xf,int yf)
    {  
            Piece p = typeOfPiece(xi,yi);
	    System.out.println("color of piece at initial position " +p.colorpieces);
	    if(p.colorpieces == color)
	    {
	       boolean valid = p.validMoveOfPiece(xi,yi,xf,yf);                 
		   System.out.println("Is the move valid for piece " +valid);       
	        if(valid)
	        {
		      // check the valid move in game
		         // FOR ROOK.....
		        if(p==r[0] || p==r[1] || p==r[2] || p==r[3])
                            {
			       if (xi == xf && Math.abs(yi-yf)!=1) 
	                          {
				     int x= (yi<yf)? 1:-1;
				     for(int h=yi+x;h<yf;h=h+x)
					 {
					    sq[xi][h]!=null;
					    return false;
					 }
				   }
				else if (yi == yf && Math.abs(xi-xf)!=1) 
	                           {
				       int x= (yi<yf)? 1:-1;
				       for(int h=xi+x;h<xf;h=h+x)
				           {
							sq[h][yi]!=null;
							return false;
						}
					}
					else
					{
					  return true;
					}					  
				}
				 // FOR bishop.....
				else if(p==bis[0])||p==bis[1]||p==bis[2]||p==bis[3])
				{
					 if((xi-xf)==(yi-yf))
			            {
			               int x = (xi < xf) ? 1 : -1;
                            for(int h = xi + x; h!=xf;h=h+x)
				            {
					           int y = yi+x;
					           if(sq[h][y].p1 != null)
                               return false; 						
				            }					 
			            }
					  else if((xi-xf)==(yf-yi))	
			            {
				           int x = (xi < xf) ? 1 : -1;
                           for(int h = xi + x; h!=xf;h=h+x)
				            {
					          int y = yi-x;
					           if(sq[h][y].p1 != null)
                                return false; 						
				            }	 
			            }
					 else 
						return true;
				}
						
	              // FOR kinght...
                else if(p==kn[0] || p==kn[1] || p==kn[2] || p==kn[3])   
		            {
			    
		            }	
                   // FOR queen...
                else if(p==q[0] || p==q[1] )
				  {
					if (xi == xf && Math.abs(yi-yf)!=1) 
	                {
						int x= (yi<yf)? 1:-1;
						for(int h=yi+x;h<yf;h=h+x)
						{
							sq[xi][h]!=null;
							return false;
						}
					}
			         else if (yi == yf && Math.abs(xi-xf)!=1) 
	                {
						int x= (yi<yf)? 1:-1;
						for(int h=xi+x;h<xf;h=h+x)
						{
							sq[h][yi]!=null;
							return false;
						}
					} 
                    else if((xi-xf)==(yi-yf))
			            {
			               int x = (xi < xf) ? 1 : -1;
                            for(int h = xi + x; h!=xf;h=h+x)
				            {
					           int y = yi+x;
					           if((sq[h][y].p1 )!= null)
                               return false; 						
				            }					 
			            }
					 else if((xi-xf)==(yf-yi))	
			            {
				           int x = (xi < xf) ? 1 : -1;
                           for(int i = xi + x; i!=xf;i=i+x)
				            {
					          int y = yi-x;
					           if(sq[i][y].p1 != null)
                                return false; 						
				            }	 
			            }	
					  else 
						  return true;
				   }
                 //for pawns
			   else if (p==pa[0] || pa[2] || pa[3] || pa[4] || pa[5] || pa[6] || pa[7] || pa[1] )
			   {
				 if((xf-xi)==1 && (yf-yi)==1 ||  (xf-xi)==1 && (yf-yi)==-1)
				 {
					 if(sq[xf][yf].p1 != null)
						 return true;
				 }
			   }
			   
			}
			
                   else 
				   return true;      				 
    }
	             else 
				return false;
}
  
 boolean update(String color,int xi,int yi,int xf,int yf)
  {
	  if(sq[xf][yf].p1==null)
              {
		  sq[xf][yf].p1 = sq[xi][yi].p1;
		  sq[xi][yi].p1 = null;
		  return true;
	       }	
          if(sq[xf][yf].p1!=null)
               {
		  if(sq[xf][yf].p1.colorpiece == color)
	          return false;
		  
		   else
		    {
		        sq[xf][yf].p1.status = -1;
			sq[xf][yf].p1 = bo[xi][yi].p1;
	         	sq[xi][yi].p1 = null;
       			return true;
		    }
	         }	
                return false;	  
          }  

}


