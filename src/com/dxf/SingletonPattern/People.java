package com.dxf.SingletonPattern;

public class People {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Mammon mammon = Mammon.getMammon();
			mammon.apparition();
		}
//		����������������ǲ���ͬһ������
	}
}
