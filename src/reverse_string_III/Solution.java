package reverse_string_III;

public class Solution {
    public String reverseWords(String s) {
        if (s.equals("") || s.equals(null)){
            return s;
        }
        StringBuilder reversedStr = new StringBuilder();
        int startPos =0;
        int endPos = s.indexOf(" ",startPos);

        while (startPos < endPos) {
            reversedStr.append(reverseString(s.substring(startPos, endPos))).append(" ");
            startPos = endPos+1;
            endPos = s.indexOf(" ", startPos);
        }
        endPos = s.length();
        reversedStr.append(reverseString(s.substring(startPos, endPos))).append(" ");
        return reversedStr.toString().trim();
    }

    public String reverseString(String s) {
        char [] charArray = s.toCharArray();
        int front = 0;
        int rear = charArray.length-1;

        while (front < rear) {
            char tmp = charArray[front];
            charArray[front] = charArray[rear];
            charArray[rear] = tmp;
            front++;
            rear--;
        }


        s = String.copyValueOf(charArray);
        return s;
    }
}