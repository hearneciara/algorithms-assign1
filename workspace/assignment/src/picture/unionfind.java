package picture;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class unionfind {
	private int[] id;   
    private int count; 
    
    public  int[] QuickFindUF(int N) 
    {
      return id;
    }

     /**
      * Returns the number of components.
      */
     public int count() 
     {
    	   
    	 if (id.length>0) 
           {
       	return id.length ;
           }
           else 
           {
           	return 0;
           }
     }

     /**
      * Returns the component identifier for the component containing site p.
      */
     public int find(int p) {
         //TODO
         return 0;
     }

     /**
      * Returns true if the the two sites are in the same component.
      */
     public boolean connected(int p, int q) 
     { 
    	 return id[p] == id[q]; 
     }

     /**
      * Merges the component containing site p with the 
      * the component containing site q.
      */
     public void union(int p, int q) {
         //TODO
     }
     
	
	public static void main(String[] args)
	{
	 int N = StdIn.readInt();
	 UF uf = new UF(N);
	 while (!StdIn.isEmpty())
	 {
	 int p = StdIn.readInt();
	 int q = StdIn.readInt();
	 if (uf.connected(p, q)) continue;
	 uf.union(p, q);
	 StdOut.println(p + " " + q);
	 }
	}

}
