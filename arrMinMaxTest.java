package NText;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class arrMinMaxTest {

	@Test
	void test1() { //normal 
		ArrMinMax obj = new ArrMinMax();
		int[] arr = {2,6, 8,3,3,4,1};
		int[] res = obj.minMax(arr);
		int[] exp = {8,1};
		assertEquals(Arrays.toString(exp), Arrays.toString(res));
	
	}
	
	void test2() {// zero
		ArrMinMax obj = new ArrMinMax();
		int[] arr = {2,6, 8,0,3,4,1};
		int[] res = obj.minMax(arr);
		int[] exp = {8,0};
		assertEquals(Arrays.toString(exp), Arrays.toString(res));
	
	}
	
	void test3() { //repeated # 
		ArrMinMax obj = new ArrMinMax();
		int[] arr = {2,6, 8,1,3,4,1};
		int[] res = obj.minMax(arr);
		int[] exp = {3,0};
		assertEquals(Arrays.toString(exp), Arrays.toString(res));
	
	}
	void test4() { //negative # 
		ArrMinMax obj = new ArrMinMax();
		int[] arr = {2,6, -8,1,-3,4,1};
		int[] res = obj.minMax(arr);
		int[] exp = {6,-8};
		assertEquals(Arrays.toString(exp), Arrays.toString(res));
	
	}
	void test5() { // out of bound # 
		ArrMinMax obj = new ArrMinMax();
		int[] arr = {2,6, 999999998,111111111,3,4,1};
		int[] res = obj.minMax(arr);
		int[] exp = {6 ,1}; 
		assertEquals(Arrays.toString(exp), Arrays.toString(res));
	
	}
} 
 