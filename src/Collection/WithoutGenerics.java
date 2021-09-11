package Collection;

import java.util.ArrayList;

public class WithoutGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList res = returnlist();
		    System.out.print(res.get(0));
		}
		public static ArrayList<ArrayList<Integer>> returnlist() {
		    ArrayList result = new ArrayList();
		    ArrayList<Integer> content = new ArrayList<Integer>();
		    content.add(1);
		    result.add(content);
		    return result;
		}

	}


