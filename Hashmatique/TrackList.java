import java.util.HashMap;
import java.util.Set;

public class TrackList{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("SandStorm", "Doo Doo Doo Doo Doo!");
        trackList.put("BabyShark", "Doo Doo Doo Doo Doo Doo!");
        trackList.put("AllStar", "Hey Now You're an Allstar!");
        trackList.put("Flamingo", "Shrimps are pretty rich!");
        // get the keys by using the keySet method
        System.out.println(trackList.get("SandStorm"));
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));    
    }
}
}