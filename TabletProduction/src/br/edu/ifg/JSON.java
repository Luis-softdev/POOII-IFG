package br.edu.ifg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class JSON {
	
	private String path = "C:\\Users\\pedrp\\OneDrive\\Área de Trabalho\\json";
	
	public void lerJson() {
		try {
			ModeloPeca modelo = null;
			File diretorio = new File(this.path);
			if(diretorio.isDirectory()) {
				File arquivos[] = diretorio.listFiles();
				for(File arquivo : arquivos) {
					Gson gson = new Gson();
					JsonReader reader = new JsonReader(new FileReader(arquivo));
					modelo = gson.fromJson(reader, ModeloPeca.class);
					System.out.println(modelo);
				}
			}
		} catch(FileNotFoundException ex) {
			System.out.println("Deu errado");
		}
	}
	
}
