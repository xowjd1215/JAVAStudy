package com.olivia.lottery;

import java.util.Arrays;
import java.util.Random;

public class loterry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1. �ζǹ�ȣ math.random / for");
		int[] array = new int[6];
		for (int i=0;i<array.length;i++){
			array[i] = (int) (Math.random()*45)+1;
		}
		
		System.out.print("�ζ� ��ȣ :");		
		for (int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
		System.out.print("\n���� �� ��ȣ : ");

		for (int i=0;i<array.length;i++){
			for (int j=i;j<array.length;j++){
				if(array[i]>array[j]){
					int temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}				
			}
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\n\n=====================\n");
		
		System.out.println("2. �ζǹ�ȣ Random / sort");
		array = new int[6];
		Random num = new Random();
		for (int i=0;i<array.length;i++){
			array[i] = (int) (num.nextInt(45))+1;
		}
		
		System.out.print("�ζ� ��ȣ :");		
		for (int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
		System.out.print("\n���� �� ��ȣ : ");
		Arrays.sort(array);
		for (int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}

}
