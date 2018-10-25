package org.institutoserpis.ed;

public class ClaseAProbar {
	public static int VALOR_INICIAL = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VALOR_INICIAL = 100;
		int i;
		String s = "Hola";
		int[] v = new int[] {1,3,5,7,9};
		
		//v = new int[5];
		
		System.out.println("v[0]=" + v[0]);
		System.out.println("v[1]=" + v[1]);
		System.out.println("v[2]=" + v[2]);
		System.out.println("v[3]=" + v[3]);
		System.out.println("v[4]=" + v[4]);
		
		String[] v= new String[] {"Pedro", "Ismail","David"}
		for (int index=0;index<5;index++)
			System.out.printf("v[%5]=%s/n", index, v[index]);

	}

}
