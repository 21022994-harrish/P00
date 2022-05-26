import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private int a,b,c;
	Calculator cal = new Calculator();

	@Before
	public void setUp() throws Exception {
		 a = 4321;
		 b = 1234;
		 c = 0;
		
	}

	@After
	public void tearDown() throws Exception {
		
	}
	

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}

	
    public void testsubtract() {
	
	int expected = cal.subtract(a, b); 
		 
	int actual = 3087;
	assertEquals (expected, actual);
	}
    
   
    public void testmultiply() {
    		
	
	int expected = cal.multiply(a, b); 
		 
	int actual = 5332114;
	assertEquals (expected, actual);
    
    
}
    
    public void testDivide() {
        
        
        // Act
          int actual = cal.divide(a, b); 
        if (a == 0 || b == 0) {
          System.out.println("Number cannot be divisible by 0!");
        } 
        
        // Assert
        int expected = 5555;
        assertEquals(expected, actual);
        try { 
          cal.divide(a, b);
          
        } catch (ArithmeticException ae) {
          System.out.println("Error! Cannot divide by 0!");
      
        
      }
    }
    
}
    




