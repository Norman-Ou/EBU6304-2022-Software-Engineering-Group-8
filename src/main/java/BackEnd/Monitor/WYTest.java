package BackEnd.Monitor;

import org.junit.Test;
import static org.junit.Assert.fail;

class WYTest {

	@Test
	void test() {
		bMonitors admin = new bMonitors();
		if(admin.getFlightList("CA8852")==null){
			fail("Getting target flight through flight number fails!");
		}
	}

}

