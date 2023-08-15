import java.util.*;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> status = new ArrayList<>();
        for (int asteroid : asteroids) {
            status.add(asteroid);
        }
        


        return convertListToArray(status);
    }

    public int[] convertListToArray(List<Integer> list) {
        int[] answer = new int[list.size()];
        for (int index = 0; index < list.size(); index++) {
            answer[index] = list.get(index);
        }
        return answer;
    }

    public void performStep(List<Integer> list) {
        int index = 0;
        int next = index + 1;
        do {
            
            

            index++;
            next = index + 1;
        } while (next < list.size());
    }
}
