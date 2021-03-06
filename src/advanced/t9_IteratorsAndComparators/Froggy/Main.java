package advanced.t9_IteratorsAndComparators.Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<Integer> numbersList = Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Lake lake = new Lake(numbersList);
        List<String> result = new ArrayList<>();
        for (Integer integer : lake) {
            result.add(integer+"");
        }
        System.out.print(String.join(", ",result));
    }
}
