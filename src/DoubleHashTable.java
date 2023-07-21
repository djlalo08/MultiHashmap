import java.util.HashMap;
import java.util.Map;

public class DoubleHashTable<A,B> {


	private Map<A, Integer> aMap = new HashMap<>();
	private Map<B, Integer> bMap  = new HashMap<>();
	private Map<Integer, AB> indexMap = new HashMap<>();
	
	private int index = 0;
	
	public DoubleHashTable(){ }
	
	public void put(A a, B b) {
		if (aMap.containsKey(a) || bMap.containsKey(b)) {
			//TODO: do something. Maybe throw err or combine them
			return;
		}
		
		aMap.put(a, index);
		bMap.put(b, index);
		indexMap.put(index, new AB(a,b));
		
		index++;
	}
	
	public B getB(A a) {
		int idx = aMap.get(a);
		return indexMap.get(idx).b;
	}
	
	public A getA(B b) {
		int idx = bMap.get(b);
		return indexMap.get(idx).a;
	}
	
	
	private class AB {
		public AB(A a, B b) {
			this.a = a;
			this.b = b;
		}
		
		A a;
		B b;
	}

}
