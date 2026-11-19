package json_test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/** Purpose: Encapsulates json examples behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class JsonExamples {
		
		public static void main(String s[]) {
		 String jsonString = "{\n" +
		            "        \"libraryname\":\"My Library\",\n" +
		            "                \"mymusic\":[{\"ArtistName\":\"Aaron\",\"Song Name\":\"Beautiful\"},\n" +
		            "        {\"ArtistName\":\"Britney\",\"SongName\":\"Oops I did It Again\"},\n" +
		            "        {\"ArtistName\":\"Britney\",\"SongName\":\"Stronger\"}]}";
		 ObjectMapper mapper = new ObjectMapper();
		 try {
			JsonNode jsonNodeRoot = mapper.readTree(jsonString);
			System.out.println(jsonNodeRoot);
			JsonNode jsonNodeYear = jsonNodeRoot.get("libraryname");
			System.out.println(jsonNodeYear);
			JsonNode jsonNodemymusic = jsonNodeRoot.get("mymusic");
			System.out.println(jsonNodemymusic);
			
			JsonNode artistName = jsonNodemymusic.get(0).get("ArtistName");
			System.out.println(artistName.asText());
			JsonNode SongName = jsonNodemymusic.get(1).get("SongName");
			System.out.println(SongName.asText());
			JsonNode artistName2 = jsonNodemymusic.get(2).get("ArtistName");
			
			System.out.println(artistName2.asText());
			artistName2.asText("tesdt");
			System.out.println(artistName2.asText());
//			JsonNode jsonNodeYear = jsonNodeRoot.get("libraryname");
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
