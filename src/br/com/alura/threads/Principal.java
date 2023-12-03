package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Isso é a Thread main");
		Thread.sleep(50000);
		System.out.println("Acabou a thread");

	}

}
