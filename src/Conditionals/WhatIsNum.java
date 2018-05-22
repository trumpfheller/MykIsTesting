package Conditionals;

public class WhatIsNum {

	public static void main(String[] args) {
		int y = 0;
		while (y < 14) {
			y++;
			for (int i = 1; i < 4; i++) {
				y += i;
			}
		}
		System.out.println(y);
		// 14 because In while loop y=13. Increment y=y+i is by 1 

	}

}
