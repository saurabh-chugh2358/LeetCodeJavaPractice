package judge_route_circles;

public class OneLineSolution {
    public boolean judgeCircle(String moves) {
        moves=" " + moves + " ";
        // The idea is to tokenize the entire string with "L", "R", "U" & "D".
        // Number of tokens should be equal for "L", "R" & "U", "D" respectively.
        return moves.split("L").length==moves.split("R").length && moves.split("U").length == moves.split("D").length;
    }
}
