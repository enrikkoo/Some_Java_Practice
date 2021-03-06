import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class TestJSON{

    public static void main() {
        final String filepath = "src/main/resources/AnimalsJSON";
        try {
            FileReader reader = new FileReader(filepath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonobject = (JSONObject) jsonParser.parse(reader);

            JSONArray carnivore_JSON_array = (JSONArray) jsonobject.get("carnivoreAnimals");
            Iterator i = carnivore_JSON_array.iterator();
            while (i.hasNext()){
                JSONObject carnivore_JSON_object = (JSONObject) i.next();
                Carnivore.setCount_of_carnivore((Long) carnivore_JSON_object.get("count"));
                for (int j = 1 ; j<Carnivore.getCount_of_carnivore()+1 ; j++) {
                    Zoo.all_carnivores.add(new Carnivore(Current_Status.CALM, (String) carnivore_JSON_object.get("kind"),j));
                }
            }

            JSONArray herbivore_JSON_array = (JSONArray) jsonobject.get("herbivoreAnimals");
            Iterator j = herbivore_JSON_array.iterator();
            while (j.hasNext()){
                JSONObject herbivore_JSON_object = (JSONObject) j.next();
                Herbivore.setCount_of_herbivore((Long) herbivore_JSON_object.get("count"));
                for (int x = 1 ; x<Herbivore.getCount_of_herbivore()+1 ; x++) {
                    Zoo.all_herbivores.add(new Herbivore(Current_Status.CALM, (String) herbivore_JSON_object.get("kind"),x));
                }
            }
        }
        catch  (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
}
