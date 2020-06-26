
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class AssetLoader {
	static Hashtable<Integer, Weapon> weapons = new Hashtable<Integer, Weapon>();
	static Hashtable<String, Integer> weaponsNamebyId = new Hashtable<String, Integer>();

	// Reads Assets from JSON file and converts to usable Java objects
	public static void readWeaponAssetsFromFile() throws IOException {

		JSONParser parser = new JSONParser();

		String path = new File(".").getCanonicalPath();
		try (BufferedReader bfr = new BufferedReader(new FileReader(path + "/src/main/java/Assets/weapons.json"))) {

			// Read File

			Object obj = parser.parse(bfr);

			JSONArray assetList = (JSONArray) obj;

			for (Object a : assetList) {
				Weapon w = parseWeaponObject((JSONObject) a);
				weapons.put(w.getId(), w);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static Weapon parseWeaponObject(JSONObject obj) {
		return new Weapon((int) ((long) obj.get("guid")), (double) obj.get("accuracy"), (double) obj.get("damage"));
	}
}
