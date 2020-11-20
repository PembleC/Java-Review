import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester25 {

    public static Map<Character, Integer> findOccurrences(String input) {
        //Implement your logic here and change the return statement accordingly
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        String[] charac = input.split("(?!^)");

        for(String str : charac){
            //System.out.println(str.charAt(0));
            if(str.charAt(0) == ' '){
                continue;
            }
            if(counts.get(str.charAt(0)) == null){
                counts.put(str.charAt(0), 1);
            } else {
                //System.out.println(counts.get(str.charAt(0)));
                counts.put(str.charAt(0), counts.get(str.charAt(0))+1);
            }
        }
        return counts;
    }

    public static void main(String args[]) {

        String input = "occurrence";
        Map<Character, Integer> occurrenceMap = findOccurrences(input);

        System.out.println("Occurrences of characters\n=======================");
        for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }

    }

}