package com.dxf.SingletonPattern;

public class Mammon {
	private static final Mammon mammon = new Mammon();// ��ʼ��һ������

	private Mammon() {
//		���µĵ����������㣬Ŀ�ľ��ǲ�ϣ�����ֵڶ������������
	}

	public static Mammon getMammon() {
		return mammon;
	}

//	����������
	public static void apparition() {
		System.out.println("�Ҿ��ǲ��񣬿���Ĥ���Ұɣ�");
	}

}
