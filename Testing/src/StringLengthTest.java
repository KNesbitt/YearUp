import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringLengthTest 
{
	@Test
	public void testLengthOfString() 
	{
		Concatenate concat = new Concatenate();
		
		int resultOne = concat.StringLength("");
		assertEquals(resultOne, 0);
	}
}
