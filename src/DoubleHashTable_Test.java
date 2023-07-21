import org.junit.jupiter.api.Test;

public class DoubleHashTable_Test {
	
	@Test
	public void basicTest() {
		DoubleHashTable<Integer, String> dht = new DoubleHashTable<>();
		dht.put(8, "eight");
		dht.put(9, "nine");
		dht.put(10, "ten");
		dht.put(7, "seven");
	}

}
