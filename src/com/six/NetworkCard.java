package com.six;

class SoundCard implements PCI{
	public void start() {
		System.out.println("dudududududu");
	}
	public void stop() {
		System.out.println("sound stop!");
	}
}

public class NetworkCard implements PCI{
	public void start() {
		System.out.println("send!");
	}
	public void stop() {
		System.out.println("network stop");
	}
    public static void main(String[] args) {
    	SoundCard sc = new SoundCard();
    	sc.start();
    	sc.stop();
    	NetworkCard nc = new NetworkCard();
    	nc.start();
    	nc.stop();
    }
}
