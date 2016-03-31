package com.algorithm.demo;

public class MaoPao {
	public void maopao(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int m = 0; m < a.length; m++) {
			System.out.println(a[m]);
		}
	}
}
