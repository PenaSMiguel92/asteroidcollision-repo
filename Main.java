import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.asteroidCollision(new int[] { 5, 10, -5})));
        System.out.println(Arrays.toString(sol.asteroidCollision(new int[] { 8, -8})));
        System.out.println(Arrays.toString(sol.asteroidCollision(new int[] { 10, 2, -5 })));
        System.out.println(Arrays.toString(sol.asteroidCollision(new int[] { -2, -1, 1, 2 })));
    }
}