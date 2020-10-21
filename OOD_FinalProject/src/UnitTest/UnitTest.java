package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


import Menu.*;

class UnitTest {
	List<Menu> menus = Arrays.asList(
			new MartiniMenu(), 
			new DesertMenu()
		);
	@Test
	void test() throws IOException {
		Waitress waitress = new Waitress(menus);
		int result = waitress.getOrder(1);

        assertEquals(result, 1);
	}

}
