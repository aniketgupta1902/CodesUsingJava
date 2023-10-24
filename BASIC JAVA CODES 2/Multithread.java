package best;

public class Multithread {
	 public static void main(String[] args) 
	    { 
	        int n = 8; 
	        for (int i=0; i<8; i++) 
	        { 
	            MultithreadingDemo object = new MultithreadingDemo(); 
	            object.start(); 
	        } 
	    } 
}
