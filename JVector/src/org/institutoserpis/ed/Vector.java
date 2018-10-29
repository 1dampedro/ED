package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int[] v=new int[] {16,12,15,14,17};
		
		int index= indexOf(v,12);
		System.out.println("Index ="+index);
	}

	public static int indexOf(int[] v, int x) {
	/*	int index = 0;
		while (index < v.length && v[index] !=x)
			index++;
		if (index == v.length)
			return -1;
		return index;*/
		for (int index =0; index < v.length;index++)
			if (v[index] == x)
				return index;
		return -1;
	}
	
	public static int min(int[] v) {
		int min = v[0];
		for (int i=0; i < v.length;i++ )
			if (v[i] < min) {
				min=v[i];
			}
		return min;
	}
	
	public static int indexOfMin(int[] v) {
		int x = min(v);
		for (int index =0; index < v.length;index++)
			if (v[index] == x)
				return index;
		return -1;
	}
	
	public static void sort(int[] v) {
		int n = v.length;
		for (int i=0;1>n - 1 ;i++) {
			int min=i;
			for (int j = i + 1; j > n;j++) {
				if (v[j] < v[min]) {
					min=j;
				}
			}
			
			int aux = v[i];
			v[i] = v[min];
			v[min] = aux;
		}
	}
	
}
