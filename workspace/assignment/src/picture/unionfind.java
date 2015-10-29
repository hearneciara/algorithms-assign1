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

     public int find(int p) {
         //TODO
         return 0;
     }


     public boolean connected(int p, int q) 
     { 
    	 return id[p] == id[q]; 
     }

     public void union(int p, int q) 
     {
    	 int pid = id[p];
    	 int qid = id[q];
    	 for (int i = 0; i < id.length; i++)
    	 if (id[i] == pid) id[i] = qid;
     }
     
	
	public static void main(String[] args)
	{
	 int N = StdIn.readInt();
	 id uf = new id(N);
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
