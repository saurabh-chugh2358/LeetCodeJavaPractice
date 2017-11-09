package judge_route_circles;

public class OneLineSolution {
    public boolean judgeCircle(String moves) {
        moves=" " + moves + " ";
        return moves.split("L").length==moves.split("R").length && moves.split("U").length == moves.split("D").length;
    }
}
