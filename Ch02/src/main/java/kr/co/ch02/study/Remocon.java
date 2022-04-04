package kr.co.ch02.study;

import org.springframework.stereotype.Component;

@Component
public class Remocon {
	
	public void powerOn() {
		System.out.println("Remopcon powerOn");
	}
	public void powerOff() {
		System.out.println("Remopcon powerOff");
	}
	public void chUp() {
		System.out.println("Remopcon chUp");
	}
	public void chDown() {
		System.out.println("Remopcon chDown");
	}
}
