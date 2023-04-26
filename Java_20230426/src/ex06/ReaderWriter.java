package ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReaderWriter {

	public static void main(String[] args) throws IOException {

		String filePath1 = "C:/data/sample.txt"; 
		String filePath2 = "C:/data/data3.txt";
//		BufferedReader reader=null;
//		BufferedWriter writer=null;
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath1));
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath2));
				) {
//			FileReader reader = new FileReader("C:/data/sample.txt");
//			FileWriter writer = new FileWriter("C:/data/data1.txt");) {
			
			 String line = null;
	            while ((line = reader.readLine()) != null) {
	                writer.write(line+"\r\n");
	                
	            }

	            System.out.println("복사가 완료되었습니다.");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

			
	}



