package com.olivia.pyramid;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1. �����ﰢ�� while��");
		int num=6;
		int i=0;
		while(i<num){
			int j=0;
			while(j<=i){
				System.out.print("*");
				j++;
			}		
			System.out.println();
			i++;
		}
		
		System.out.println("\n2. �����ﰢ�� do while��");
		num=6;
		i=0;
		do{
			int j=0;
			do{
				System.out.print("*");
				j++;
			}while (j<=i);
			
			System.out.println();
			i++;
		}while (i<num);
		
		System.out.println("\n3. �����ﰢ�� for��");
		num=6;
		for (i=0;i<num;i++){
			for (int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n4. �����ﰢ�� foreach��");
		String[] array = {"*","**","***","****","*****","******"};
		for (String i2:array){
			System.out.println(i2);
		}		
		
		System.out.println("\n=====================\n");
		
		System.out.println("1. ���ﰢ�� while��");
		i=6;
		while(i>0){
			int j=0;
			while(j<i){
				System.out.print("*");
				j++;
			}		
			System.out.println();
			i--;
		}
		
		System.out.println("\n2. ���ﰢ�� do while��");
		i=6;
		do{
			int j=0;
			do{
				System.out.print("*");
				j++;
			}while (j<i);
			
			System.out.println();
			i--;
		}while (i>0);
		
		System.out.println("\n3. ���ﰢ�� for��");
		num=6;
		for (i=0;i<num;i++){
			for (int j=i; j<=num-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
		
		System.out.println("1. �Ƕ�̵� while��");
		num=6;
		i=0;
		while(i<num){
			int j=0;
			while(j<num-i){
				System.out.print(" ");
				j++;
			}
			int j2=0;
			while(j2<i*2+1){
				System.out.print("*");
				j2++;
			}		
			System.out.println();
			i++;
		}
		
		System.out.println("\n2. �Ƕ�̵� do while��");
		num=6;
		i=0;
		do{
			int j=0;
			do{
				System.out.print(" ");
				j++;
			}while (j<num-i);
			
			int j2=0;
			do{
				System.out.print("*");
				j2++;
			}while (j2<i*2+1);
			
			System.out.println();
			i++;
		}while (i<num);
		
		System.out.println("\n3. �Ƕ�̵� for��");
		num =6;
		for (i=0;i<num;i++){
			for (int j=0; j<num-i; j++){
				System.out.print(" ");
			}
			for (int j=0; j<i*2+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
		
		System.out.println("1. ���Ƕ�̵� while��");
		num=6;
		i=0;
		while(i<num){
			int j=0;
			while(j<=i){
				System.out.print(" ");
				j++;
			}
			int j2=0;
			while(j2<(num-i)*2-1){
				System.out.print("*");
				j2++;
			}		
			System.out.println();
			i++;
		}
		
		System.out.println("\n2. ���Ƕ�̵� do while��");
		num=6;
		i=0;
		do{
			int j=0;
			do{
				System.out.print(" ");
				j++;
			}while (j<=i);
			
			int j2=0;
			do{
				System.out.print("*");
				j2++;
			}while (j2<(num-i)*2-1);
			
			System.out.println();
			i++;
		}while (i<num);
		
		System.out.println("\n3. ���Ƕ�̵� for��");
		num =6;
		for (i=num;i>0;i--){
			for (int j=0; j<=num-i; j++){
				System.out.print(" ");
			}
			for (int j=0; j<i*2-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
