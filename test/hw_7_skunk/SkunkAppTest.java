package hw_7_skunk;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SkunkAppTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void new_dice_can_be_created() {
		Dice d = new Dice();
		assertTrue("New Dice Instance not Null!", d != null);
	}
	
	@Test
	public void new_dice_rolls_double_skunk() {
		Dice d = new Dice(new int[] {1}, new int[] {1});
		d.roll();
		assertEquals("First Die is not 1.", 1, d.getDie1Roll());
		assertEquals("Second Die is not 1.", 1, d.getDie2Roll());
	}
	
	@Test
	public void new_dice_rolls_boxcars_then_double_skunk() {
		Dice d = new Dice(new int[] {6,1}, new int[] {6, 1});
		d.roll();
		assertEquals("First Die is not 6.", 6, d.getDie1Roll());
		assertEquals("Second Die is not 6.", 6, d.getDie2Roll());
		
		d.roll();
		assertEquals("First Die is not 1.", 1, d.getDie1Roll());
		assertEquals("Second Die is not 1.", 1, d.getDie2Roll());
	}

}
