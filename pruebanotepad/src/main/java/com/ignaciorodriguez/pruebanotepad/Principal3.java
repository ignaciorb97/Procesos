package com.ignaciorodriguez.pruebanotepad;

import java.io.IOException;
import java.io.*;

public class Principal3 {

	public static void main(String[] args) {
	//	ProcessBuilder pb =new ProcessBuilder("CMD","/C","tasklist");
		ProcessBuilder pb =new ProcessBuilder("CMD","/C","ipconfig");
	//	ProcessBuilder pb =new ProcessBuilder("CMD","/C","tasklis");
		try {
			Process process=pb.start();
			InputStream is= process.getInputStream();
	//		InputStream is =process.getErrorStream();
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
