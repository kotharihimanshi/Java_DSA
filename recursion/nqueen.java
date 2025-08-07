// 2.03 3.00
import java.util.Scanner;
class nqueen
{
	 static int solCtr ;
     public static void solve_n_queen ( int noq )
	 {
	    // arm / validation
		
		// set an environment
		int [] qpos = new int [ noq ];
		int qpos_ind;
		for( qpos_ind  = 0; qpos_ind < noq; qpos_ind ++)
		    qpos [ qpos_ind ] = -1;
		solve_n_queen_helper ( qpos ,noq, 0 );	
	 }
	 private static boolean isSafe ( int [] qpos, int qno, int pos )
	 {
	   int row;
	   int col;
	   // uld
	   for( row = qno -1, col = pos -1; row >= 0 && col >= 0; row--,col--)
	   {
	        if ( qpos [ row ] == col )
			   return false;
	   }
	   // up
       for( row = qno - 1, col = pos; row >= 0; row --)
	   {
	        if ( qpos [ row ] == col )
			   return false;
	   }
	   
	   // urd
	   for( row = qno - 1, col = pos +1 ; row >= 0 && col < qpos.length; row--,col++)
	   	   {
	        if ( qpos [ row ] == col )
			   return false;
	   }
           return true;
	 }
	 private static void printBoard ( int [] qpos )
	 {
		 int row;
		 int col;
		 for( row = 0; row < qpos.length; row++, System.out.println())
		 {
			  for ( col = 0; col < qpos.length; col ++)
				  System.out.printf("%c ", qpos [ row ] == col ? 'Q' : '-');
		 }
		 char ch;
		 Scanner kbd = new Scanner ( System.in );
         ch = kbd.next().charAt(0);
	 }
	 private static void solve_n_queen_helper ( int [] qpos, int noq, int qno )
	 {
	    // enumerate all the choices
		// 0 to noq - 1
		if ( noq == qno )
		{
		    System.out.printf( "Solution # %d\n", ++solCtr);
			printBoard ( qpos );
			return;
		}
		int position;
		for ( position = 0; position < noq ; position ++)
		{
		// validity - SAFETY
		    if ( isSafe(qpos, qno, position) == true)
			{
			   qpos [ qno ] = position;
			   solve_n_queen_helper ( qpos, noq, qno + 1);
			   qpos [ qno ] = -1;
			}
		}
		
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int noq;
		noq = kbd.nextInt();
		solve_n_queen(  noq  );
	 }
}







