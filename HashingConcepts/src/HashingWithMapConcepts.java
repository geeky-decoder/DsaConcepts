import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashingWithMapConcepts {

    private void fetchTheCount(Map<Integer, Integer> hashMap, int key) {
        System.out.println("Count for " + key + " is " + hashMap.get(key));
    }
    public static void main(String[] args) {
        HashingWithMapConcepts hashing = new HashingWithMapConcepts();
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> hashMap = new HashMap<>();
        System.out.println("Enter the totalNumber of keys required");
        int totalNumbers = scanner.nextInt();
        for (int i = 0 ; i < totalNumbers; i++) {
            int keyValue = scanner.nextInt();
            hashMap.put(keyValue, hashMap.getOrDefault(keyValue, 0) + 1);
        }
        System.out.println("Enter the key to be searched for count");
        int key = scanner.nextInt();
        hashing.fetchTheCount(hashMap, key);

    }
}
