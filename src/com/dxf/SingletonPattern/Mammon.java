package com.dxf.SingletonPattern;

public class Mammon {
	private static final Mammon mammon = new Mammon();// 初始化一个财神

	private Mammon() {
//		道德的底线束缚着你，目的就是不希望出现第二个财神抢香火
	}

	public static Mammon getMammon() {
		return mammon;
	}

//	财神显灵了
	public static void apparition() {
		System.out.println("我就是财神，快来膜拜我吧！");
	}

}
