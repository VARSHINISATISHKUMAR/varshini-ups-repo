import java.util.*;
import java.util.stream.*;

public class streamapi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 20, 40, 50);
        nums.stream()
            .filter(n -> n > 25)
            .forEach(System.out::println);
        func(new int[]{10, 20, 30, 20, 40, 50});
    }

    public static void func(int[] nums) {
        Arrays.stream(nums)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
    }
}
