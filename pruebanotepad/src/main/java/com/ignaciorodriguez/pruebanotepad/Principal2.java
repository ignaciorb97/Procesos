package com.ignaciorodriguez.pruebanotepad;

import java.io.IOException;

public class Principal2 {

	public static void main(String[] args) {

		ProcessBuilder pb=new ProcessBuilder ("Calc");
		try {
			Process p=pb.start();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	

	}

}
