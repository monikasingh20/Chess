package chessgame;
import java.util.*; 
public class Game
{
  board bo=new board();
  Game()
   {
     bo.sq[0][0].p1=bo.ro[0];
     bo.sq[0][1].p1=bo.knig[0];
     bo.sq[0][2].p1=bo.bis[0];
     bo.sq[0][3].p1=bo.k[0];
     bo.sq[0][4].p1=bo.q[0];
     bo.sq[0][5].p1=bo.bis[1];
     bo.sq[0][6].p1=bo.knig[1];
     bo.sq[0][7].p1=bo.ro[1];
     for(int i=0;i<8;i++)
      {
        bo.sq[1][i].p1=bo.p[i];	
      }	
     bo.sq[8][0].p1=bo.ro[2];
     bo.sq[8][1].p1=bo.knig[2];
     bo.sq[8][2].p1=bo.bis[2];
     bo.sq[8][3].p1=bo.k[1];
     bo.sq[8][4].p1=bo.q[1];
     bo.sq[8][5].p1=bo.bis[3];
     bo.sq[8][6].p1=bo.knig[3];
     bo.sq[8][7].p1=bo.ro[3];
     for(int i=0;i<8;i++)
      {
        int l=8
        bo.sq[7][i].p1=bo.p[l];
        l++;		
      }	
  }
  public static void main(String args[])
  {
	Game game = new Game();
        String color = "white";
	Scanner scan = new Scanner(System.in);
	while(true)                                    
	{
	  if(color == "white")
	  {
		System.out.println("PLAYER WHITE......."); 
		System.out.println("enter initial position");
		int xi = scan.nextInt();
		int yi = scan.nextInt();
		System.out.println();
		if(xi>0 || xi<8 && yi>0 || yi<8)
		{
		  System.out.println("enter final position");
		  int xf = scan.nextInt();
		  int yf = scan.nextInt();
                  System.out.println();
		}
		else
		{
		  System.out.println("invalid");
		}
		if(xi-xf==0 && yi-yf==0)
		{
		  System.out.println("invalid");
		}
		else
		{
		   boolean check = game.board.move(color,xi,yi,xf,yf);  
                   System.out.println("Is the move valid for game?"+check);
                   System.out.println();		   
		   if(check)
		      {
			 boolean checker = game.board.update(color,xi,yi,xf,yf);
			 if(checker)
			    {
			       color = "black";
			       System.out.println("valid move");
			       System.out.println();
			    }
			 else
			    {
			      System.out.println("invalid move as there is already a piece of same color.");
			      System.out.println();
			    }
		       }
		   else
		    {
		        System.out.println("invalid try as the move is not valid..");
			System.out.println();
		    }
               }
	  }
	  game.board.display();
	}
	else
	  {
		System.out.println("PLAYER WHITE......."); 
		System.out.println("enter initial position");
		int xi = scan.nextInt();
		int yi = scan.nextInt();
		System.out.println();
		if(xi>0 || xi<8 && yi>0 || yi<8)
		{
		  System.out.println("enter final position");
		  int xf = scan.nextInt();
		  int yf = scan.nextInt();
                  System.out.println();
		}
		else
		{
			System.out.println("invalid");
		}
		if(xi-xf==0 && yi-yf==0)
		{
			System.out.println("invalid");
		}
		else
		{
		   boolean check = game.board.move(color,xi,yi,xf,yf);  
                   System.out.println("Is the move valid for game? "+check);
                   System.out.println();		   
		   if(check)
		   {
			 boolean checker = game.board.update(color,xi,yi,xf,yf);
			 if(checker)
			    {
		               color = "white";
			       System.out.println("valid move");
			       System.out.println();
			    }
			 
			 else
			    {
			      System.out.println("invalid move as there is already a piece of same color.");
			      System.out.println();
			    }
		   }
		
		   else
		    {
		      System.out.println("invalid try as the move is not valid..");
		      System.out.println();
		    }
             }
	game.board.display();
    }
  }
}
