package ej02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) {
		try {
			Process p = new ProcessBuilder("CMD", "/C", "start", "dir").start();
			InputStream input = p.getInputStream();

			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
