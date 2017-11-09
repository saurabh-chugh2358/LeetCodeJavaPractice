package judge_route_circles;

public class Solution {
    public boolean judgeCircle(String moves) {
        boolean isCircle = false;
        char [] charArray = moves.toCharArray();
        int side = 0;
        int height = 0;

        for (char letter : charArray) {
            System.out.println("letter is"+letter);
            switch (letter) {
                case 'L':
                    side--;
                    break;
                case 'R':
                    side++;
                    break;
                case 'U':
                    height++;
                    break;
                case 'D':
                    height--;
                    break;
            }
        }

        if (side == 0 && height == 0) {
            isCircle = true;
        }

        return isCircle;
    }
}
