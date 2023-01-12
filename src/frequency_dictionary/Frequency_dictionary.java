package frequency_dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_dictionary {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        for(int i=0; i<string.length(); i++){
            if(map.isEmpty()){
                map.put(string.charAt(i), 1);
            }else{
                if(!map.containsKey(string.charAt(i))){
                    map.put(string.charAt(i), 1);
                }else {
                    map.put(string.charAt(i), map.get(string.charAt(i))+1);
                }
            }
        }
        for (Map.Entry entry: map.entrySet()) {

            System.out.println(entry);

        }
    }
}
