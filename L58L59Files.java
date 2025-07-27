package l58;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
//4 ways to write  a file using java
//FileWriter = Good for small or medium-sized text files
//BufferedWriter = Better performance for large amounts of text
//PrintWriter = Best for structured data, like reports or logs
//FileOutputstream = Best for binary files(e.g., images, audio files)
public class L58L59Files {

	public static void main(String[] args) {
		// filewriter
		String filePath = "/Users/ruiyuxu/Documents/死脑子快动啊/自学java/learnJavaAgain/l58/src/test.txt";
		
	String textContent = """
			Roses are Red
			Violets are Blue
			""";
		try (FileWriter writer = new FileWriter(filePath);){
			writer.write("I like pizza\nit's really good\n");
			writer.write(textContent);
			System.out.println("file has been written");
		}
		
		catch(FileNotFoundException e) {
			System.out.println("could not locate file location");
		}
		
		catch(IOException e) {
			System.out.println("could not write file");
		}
		
		// read files
		// bufferedReader is a middle man
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath));){
			System.out.println("that file exists");
			
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("could not locate file");
			
		}
		catch(IOException e) {
			System.out.println("something went wrong");
		}

	}

}
