package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		BufferedWriter fw =  new BufferedWriter(new FileWriter(file, true));
		fw.write("박XX 다 주무셨나요?");
		fw.newLine();
		fw.write("이제 하셔야죠? 공부");
		fw.newLine();
		fw.write("공부하고 담 쌓으셨으면, 그 담 이제 허물죠~!");
		fw.flush();
		fw.close();
	}
}
