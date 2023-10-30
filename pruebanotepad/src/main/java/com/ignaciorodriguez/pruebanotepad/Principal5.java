package com.ignaciorodriguez.pruebanotepad;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Principal5 {

	public static void main(String[] args) {
		ProcessBuilder pb=new ProcessBuilder("CMD","/C","tasklist");
		File fout=new File("salida.txt");
		File fErr=new File("Error.txt");
		pb.redirectOutput(fout);
		pb.redirectError(fErr);
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
