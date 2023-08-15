import java.util.*;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> status = performCollisionCheck(asteroids);
        return convertListToArray(status);
    }

    public int[] convertListToArray(List<Integer> list) {
        int[] answer = new int[list.size()];
        for (int index = 0; index < list.size(); index++) {
            answer[index] = list.get(index);
        }
        return answer;
    }

    public List<Integer> performCollisionCheck(int[] asteroids) {
        List<Integer> answer = new ArrayList<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                answer.add(asteroid);
            } else if (asteroid < 0) {
                for (int i = answer.size() - 1; i >= 0; i--) {
                    if (Math.abs(answer.get(i)) > Math.abs(asteroid))
                        break; //discard left moving asteroid
                    
                    if (Math.abs(answer.get(i)) < Math.abs(asteroid)) {
                        answer.remove(i);
                        continue; //discard right moving asteroid, keep left moving asteroid.
                    }

                    if (Math.abs(answer.get(i)) == Math.abs(asteroid)) {
                        answer.remove(i);
                        break; //discard both asteroids.
                    }
                }
            }
        }

        return answer;
    }
}
