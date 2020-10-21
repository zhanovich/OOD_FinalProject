package UnitTest;



import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import Menu.*;

@RunWith(JUnit4.class)
public class UnitTest {
	List<Menu> menus = Arrays.asList(
			new MartiniMenu(), 
			new DesertMenu()
		);
	
	@Test
	public void getOrder1Test() throws IOException {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
		System.setIn(in);
		
		Waitress waitress = new Waitress(menus);
		int result = waitress.getOrder(1);

        assertEquals(1, result);
        System.setIn(sysInBackup);
	}
	
	@Test
	public void getOrder2Test() throws IOException {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
		System.setIn(in);
		
		Waitress waitress = new Waitress(menus);
		int result = waitress.getOrder(2);

        assertEquals(2, result);
        System.setIn(sysInBackup);
	}
	
	@Test
	public void getOrder3Test() throws IOException {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
		System.setIn(in);
		
		Waitress waitress = new Waitress(menus);
		int result = waitress.getOrder(3);

        assertEquals(3, result);
        System.setIn(sysInBackup);
	}
	
	@Test
	public void getOrder4Test() throws IOException {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
		System.setIn(in);
		
		Waitress waitress = new Waitress(menus);
		int result = waitress.getOrder(4);

        assertEquals(4, result);
        System.setIn(sysInBackup);
	}
	
	@Test
	public void getOrder5Test() throws IOException {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
		System.setIn(in);
		
		Waitress waitress = new Waitress(menus);
		int result = waitress.getOrder(5);

        assertEquals(5, result);
        System.setIn(sysInBackup);
	}
	
	@Test
	public void getStylePreferenceFancyTest() throws IOException {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
		System.setIn(in);
		
		int result = Waitress.getStylePreference(1);

        assertEquals(1, result);
        
        System.setIn(sysInBackup);
	}
	
	@Test
	public void getStylePreferenceElevatedTest() throws IOException {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
		System.setIn(in);
		
		int result = Waitress.getStylePreference(2);

        assertEquals(2, result);
        
        System.setIn(sysInBackup);
	}
	
	@Test
	public void getStylePreferenceCasualTest() throws IOException {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
		System.setIn(in);
		
		int result = Waitress.getStylePreference(3);

        assertEquals(3, result);
        
        System.setIn(sysInBackup);
	}
	
	@Test
	public void getCheckTest() throws IOException {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
		System.setIn(in);
		
		Waitress waitress = new Waitress(menus);
		double result = waitress.getCheck(3, 1, 10);

        assertEquals(3, result);
        
        System.setIn(sysInBackup);
	}
}
