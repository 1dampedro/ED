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
		assertEquals(12,Vector.min(new int[] {16,12,15,14,17}));
		assertEquals(9,Vector.min(new int[] {9,12,15,14,17}));
		assertEquals(6,Vector.min(new int[] {17,12,6,14,7}));
		assertEquals(15,Vector.min(new int[] {15}));
		assertEquals(11,Vector.min(new int[] {11,18}));
		assertEquals(13,Vector.min(new int[] {16,13,15}));
	}
	
	@Test
	void indexOfMin() {
		assertEquals(1, Vector.indexOfMin(new int[] {16,12,15,14,17}));
		assertEquals(0, Vector.indexOfMin(new int[] {12,16,15,14,17}));
		assertEquals(2, Vector.indexOfMin(new int[] {16,15,12,14,17}));
		assertEquals(3, Vector.indexOfMin(new int[] {16,15,14,12,17}));
		assertEquals(4, Vector.indexOfMin(new int[] {16,17,15,14,12}));
	}
	
	@Test
	void sort() {
		int[] v = new int[] {12};
		Vector.sort(v);
		assertArrayEquals(new int[] {12},v );
		v = new int[] {15,12};
		Vector.sort(v);
		assertArrayEquals(new int[] {12,15},v );
		v = new int[] {17,12,15};
		Vector.sort(v);
		assertArrayEquals(new int[] {12,15,17},v );
		v = new int[] {16,17,15,12,13};
		Vector.sort(v);
		assertArrayEquals(new int[] {12,13,15,16,17},v );
		v = new int[] {16,14,15,16,17};
		Vector.sort(v);
		assertArrayEquals(new int[] {14,15,16,16,17},v );
	}
	
	@Test
	void sortEmpty() {
		int[] v = new int[] {};
		Vector.sort(v);
		assertArrayEquals(new int[] {},v );
	}
	
	@Test
	void indexOfMinWithInitial() {
		assertEquals(1,Vector.indexOfMin(new int[] {16,12,15,14,17}));
		assertEquals(3,Vector.indexOfMin(new int[] {16,14,15,12,17}));
	}
	}
