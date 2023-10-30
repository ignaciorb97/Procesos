package com.ignaciorodriguez.pruebanotepad;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Principal4 {

	public static void main(String[] args) {
		File ruta=new File("target\\classes");
		
		ProcessBuilder pb=new ProcessBuilder("java","com.ignaciorodriguez.pruebanotepad.Principal");
		pb.directory(ruta);
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
