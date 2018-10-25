package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class datGen {

	public void generador()throws IOException
	{
		File file = new File("Files/Data/data.csv");
		FileReader filereader = new FileReader(file);
		file.mkdirs();
		
		BufferedReader reader = new BufferedReader(new FileReader(new File("doc/data.csv")));
		
		String temp="";
		String alv="";
		while((temp=reader.readLine())!=null)
		{
			alv+=temp+="separatorPro2017Lol";
		}
			
		String players[] = alv.split("separatorPro2017Lol");
		for (int i = 0; i < players.length; i++) {
			file = new File("doc1/player "+i);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			String[] criterio = players[i].split(",");
			String player = "";
			for (int j = 0; j < criterio.length; j++) {
				player+=criterio[j]+"\n";
			}
			writer.write(player);
			writer.close();
			
		}
		reader.close();
				
		String[] columna = players[0].split(",");
	}
	
}
