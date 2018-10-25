package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void indexOf() {
		int[] v = new int[] {16,12,15,14,17};
		assertEquals(0, Vector.indexOf(v, 16));
		assertEquals(2, Vector.indexOf(v, 15));
		assertEquals(4, Vector.indexOf(v, 17));
		assertEquals(-1, Vector.indexOf(v, 33));
	}

	void indexOfEmpty() {
		int [] v = new int [] {};
		assertEquals(-1, Vector.indexOf(v, 22));
	}
	
	@Test
	void min() {
		int[] v = new int[] {16,12,15,14,17};
		assertEquals(12,Vector.min(new int[] {16,12,15,14,17}));
		//assertEquals(9,Vector.min(new int[] {9,12,15,14,17}));
		//assertEquals(6,Vector.min(new int[] {17,12,6,14,7}));
		//assertEquals(15,Vector.min(new int[] {15}));
		//assertEquals(11,Vector.min(new int[] {11,18}));
		//assertEquals(13,Vector.min(new int[] {16,13,15}));
	}
}
