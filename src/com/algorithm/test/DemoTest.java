package com.algorithm.test;

import com.algorithm.demo.LingXing;
import com.algorithm.demo.MaoPao;
import com.algorithm.demo.NotChinese;

public class DemoTest {

	public static void main(String[] args) {
		LingXing LX = new LingXing();
		LX.lx();
		int a[]={4,2,6,1,5};
		MaoPao maopao=new MaoPao();
		maopao.maopao(a);
		String str="Œ“ «ABC";
		NotChinese nc=new NotChinese();
		System.out.println(nc.notChinese(str));
	}

}
