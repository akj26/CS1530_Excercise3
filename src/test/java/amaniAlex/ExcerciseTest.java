import org.junit.Test;
import static org.junit.Assert.*;
import amaniAlex.Excercise;

public class ExcerciseTest{
	@Test
	public void testExcercise5(){
		assertEquals(Excercise.triangle(5),15);
	}

	@Test
	public void testExcercise7(){
		assertEquals(Excercise.triangle(7),28);
	}

	@Test
	public void testExcercise3(){
		assertEquals(Excercise.triangle(3),6);
	}

	@Test
	public void testExcercise4(){
		assertEquals(Excercise.lazy(4),11);
	}

	@Test
	public void testExcercise6(){
		assertEquals(Excercise.lazy(6),22);
	}

	@Test
	public void testExcercise2(){
		assertEquals(Excercise.lazy(2),4);
	}

}