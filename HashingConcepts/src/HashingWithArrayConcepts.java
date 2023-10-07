import java.util.Arrays;
import java.util.Scanner;

/*
- Frequency array concept based on the index of the element.
- Uses extra space to the length of max. element present in the input.
- In case of characters either we can
    - Create frequency array till the size of ASCII value of 256 to entertain all types of character if asked.
    - If it is particularly asked for lower or uppercase characters than we can just create 26 size frequency array.
 */
public class HashingWithArrayConcepts {

    /*
    - T(c): O(totalQueriesCount)
    - S(c): O(max number queried)
     */
    private void numberHashingWithFreqArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total elements required:");
        int totalElements = scanner.nextInt();
        int[] numbers = new int[totalElements];

        for (int i = 0; i < totalElements ; i++) {
            numbers[i] = scanner.nextInt();
        }

        /*
        preStoring the values passed as input into a hashing/frequency array were each element passed
        as input will be an index value of the frequency array.
         */
        int[] freqArr = new int[20];
        Arrays.fill(freqArr, 0);
        for (int i : numbers) {
            freqArr[i] += 1;
        }

        System.out.println("Enter total queries required:");
        int totalQueries = scanner.nextInt();

        // fetching from the preStored count in frequency array
        for (int j = 0 ; j < totalQueries ; j++) {
            int queryNumber = scanner.nextInt();
            System.out.println("Count of " + queryNumber + " is " + freqArr[queryNumber]);
        }
    }

    /*
    Logic is to subtract the ASCII value of queried character
     with lowercase 'a' ASCII value to create the index value of frequency array.
     */

    /*
    - T(c): O(totalQueriesCount)
    - S(c): O(total alphabets count)
     */
    private void lowerCaseCharacterHashingWithFreqArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for counting characters:");
        String requiredString = scanner.next();
        char[] characters = requiredString.toCharArray();

        /*
        preStoring the values passed as input into a hashing/frequency array were each character element passed
         as input will be an index value(characters ASCII) of the frequency array.
         */
        int[] freqArr = new int[26];
        Arrays.fill(freqArr, 0);
        for (char character : characters) {
            int charAscii = character - 'a';
            if (charAscii < 0) {
                throw new IllegalArgumentException("Not a valid character");
            }
            freqArr[charAscii] += 1;
        }

        System.out.println("Enter total queries required:");
        int totalQueries = scanner.nextInt();

        // fetching from the preStored count in frequency array
        for (int j = 0 ; j < totalQueries ; j++) {
            char queryCharacter = scanner.next().charAt(0);
            System.out.println("Count of " + queryCharacter + " is " + freqArr[queryCharacter - 'a']);
        }
    }

    /*
    Logic is to create a 256 size array bcoz that's the total ASCII values present for dealing with characters
     and each index will denote the actual ASCII value of character.
     */

    /*
    - T(c): O(totalQueriesCount)
    - S(c): O(total ASCII count)
     */
    private void allCharacterHashingWithFreqArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for counting characters:");
        String requiredString = scanner.next();
        char[] characters = requiredString.toCharArray();

        /*
        preStoring the values passed as input into a hashing/frequency array were each character element passed
         as input will be an index value(characters ASCII) of the frequency array.
         */
        int[] freqArr = new int[256];
        Arrays.fill(freqArr, 0);
        for (char character : characters) {
            if (character < 0 && character > 255) {
                throw new IllegalArgumentException("Not a valid character");
            }
            freqArr[character] += 1;
        }

        System.out.println("Enter total queries required:");
        int totalQueries = scanner.nextInt();

        // fetching from the preStored count in frequency array
        for (int j = 0 ; j < totalQueries ; j++) {
            char queryCharacter = scanner.next().charAt(0);
            System.out.println("Count of " + queryCharacter + " is " + freqArr[queryCharacter]);
        }
    }

    public static void main(String[] args) {
        HashingWithArrayConcepts hashingObject = new HashingWithArrayConcepts();
        hashingObject.numberHashingWithFreqArr();
        hashingObject.lowerCaseCharacterHashingWithFreqArr();
        // similar code for upperCase just we need to replace 'a' with 'A' in the logic.

        hashingObject.allCharacterHashingWithFreqArr();
    }
}