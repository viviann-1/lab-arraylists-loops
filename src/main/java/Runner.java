import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add(5, "Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(1, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.get(2));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(3);
//        7. Print the number of islands in your arraylist
        int lengthOfArrayList = scottishIslands.size();
        System.out.println(lengthOfArrayList);
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (int i =0; i<scottishIslands.size(); i++){
            String scottishIsland = scottishIslands.get(i);
            System.out.println(i);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for (int i = 1; i < 100; i+=1){
            numbers.add(i);
        }

        System.out.println("numbers" + numbers);


        //second solution
        for (int i = 1; i < 100; i++){
            if (i%2==0);

        }

        System.out.println(i + "");


//        2. Print the difference between the largest and smallest value
        int max_val= numbers[0];
        int min_val= numbers[0];

        for (int i =1, i; <numbers.length; i++;){
            if (numbers[i] > max_val)
                max_val = numbers[i];
            else if (numbers[i] < min_val)
                min = numbers[i];

            System.out.println("The difference is:"  + (max_val - min_val));

        }


//        3. Print True if the list contains a 1 next to a 1 somewhere.
        if (numbers == 1){
            return "true";
        }

//        4. Print the sum of the numbers,
        int sum = IntStream.of(numbers).sum();
        System.out.println(sum);


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

        int sum = IntStream.of(numbers).sum();
        System.out.println(sum);

        for (int i = 0; i <14;)
            if (i == 13) {
                break;

                System.out.println(i);
            }



    }

}
