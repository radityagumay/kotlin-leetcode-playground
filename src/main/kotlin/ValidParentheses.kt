import java.util.*

fun main() {
    ValidParentheses.Solution().isValid("([}}])")
}

object ValidParentheses {
    class Solution {
        fun isValid(s: String): Boolean {
            if (s.length % 2 != 0) return false

            val stack = Stack<Char>()
            for (c in s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c)
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop()
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop()
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop()
                } else {
                    stack.push(c)
                }
            }
            return stack.isEmpty()
        }
    }
}