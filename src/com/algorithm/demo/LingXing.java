package com.algorithm.demo;

public class LingXing {
public void lx(){
	int size=4;
	for(int i=1;i<=size;i++){
		for(int j=i;j<size;j++){
			System.out.print(" ");
		}
		for(int m=0;m<2*i-1;m++){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int k=size-1;k>=1;k--){
		for(int n=k;n<size;n++){
			System.out.print(" ");
		}
		for(int p=2*k-1;p>=1;p--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
