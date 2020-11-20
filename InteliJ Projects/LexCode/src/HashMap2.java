import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester3 {


    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
        //Implement your logic here and change the return statement accordingly
        Map<String, Integer> newMap = new HashMap<String, Integer>();

        newMap.putAll(mapOne);
        System.out.println(newMap);

        for (Map.Entry<String, Integer> map : mapTwo.entrySet()) {
            System.out.println(map.getKey() + ", " + map.getValue());
            if (newMap.containsKey(map.getKey()) && newMap.get(map.getKey()) != map.getValue()) {
                newMap.put(map.getKey()+"new", map.getValue());
            } else if(!newMap.containsKey(map.getKey())) {
                newMap.put(map.getKey(), map.getValue());
            }
        }

        return newMap;
    }

    public static void main(String args[]) {
        Map<String, Integer> mapOne = new HashMap<String, Integer>();
        mapOne.put("Kelly", 10);
        mapOne.put("Micheal", 20);
        mapOne.put("Ryan", 30);

        Map<String, Integer> mapTwo = new HashMap<String, Integer>();
        mapTwo.put("Jim", 15);
        mapTwo.put("Andy", 45);

        Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

        System.out.println("Merged Map\n===========");
        for (Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }

    }
}
