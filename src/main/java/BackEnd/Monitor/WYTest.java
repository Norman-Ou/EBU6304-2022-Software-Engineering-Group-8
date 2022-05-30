package BackEnd.Monitor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WYTest {

	@Test
	void test() {
		bMonitors admin = new bMonitors();
		if(admin.getFlightList("CA8852")==null){
			fail("Getting target flight through flight number fails!");
		}
	}

}

