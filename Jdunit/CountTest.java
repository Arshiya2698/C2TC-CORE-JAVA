import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTest {

	@Test
	void test() {
		Testing t=new Testing();
		int result=t.countA("ARSHIYA");
		assertEquals(5,result);
	}

}
