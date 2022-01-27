package data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JsonDataReader {
	
	public String Firstname,Lastname,Email,Password;
	
	public void JsonReader() throws JsonIOException, JsonSyntaxException, IOException, ParseException {
		
		String FilePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";
		File srcFile = new File(FilePath);
		JSONParser parser = new JSONParser();
		JSONArray Jarray =  (JSONArray) parser.parse(new FileReader(srcFile));
		
		for(Object jsonobj : Jarray) 
		{
			JSONObject person =  (JSONObject)jsonobj;
			Firstname = (String) person.get("firstname");
			Lastname = (String) person.get("lastname");
			Email = (String) person.get("email");
			Password = (String) person.get("password");
			
		}
	}

}
