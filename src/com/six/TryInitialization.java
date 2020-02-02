package com.six;

public class TryInitialization {
	static int[] values = new int[10];
	static {
		for (int i = 0;i<values.length;i++) {
			values[i] = (int)(100.0 * Math.random());
		}
	}
}
