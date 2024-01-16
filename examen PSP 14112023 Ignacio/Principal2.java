package com.ignaciorodriguez.pruebanotepad;

import java.io.IOException;
import java.io.*;

public class Principal2 {

	public static void main(String[] args) {
		

		ProcessBuilder pb =new ProcessBuilder("CMD","/C","tasklist");
		try {
			Process process=pb.start();
			InputStream is= process.getInputStream();
			int c;
			while((c=is.read())!=-1) {
				System.out.print((char)c);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
