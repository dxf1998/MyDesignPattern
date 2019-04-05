package com.dxf.SingletonPattern;

public class People {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Mammon mammon = Mammon.getMammon();
			mammon.apparition();
		}
//		看看这五天显灵的是不是同一个财神
	}
}
