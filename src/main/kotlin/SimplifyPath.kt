import java.util.*

fun main() {
    val inputs = listOf(
        "/home//foo/",
        "/home/",
        "/../"
    )

    for (i in inputs) {
        println(SimplifyPath.Solution().simplifyPath(i))
    }
}

object SimplifyPath {
    class Solution {
        fun simplifyPath(path: String): String {
            val tokens = path.split("/")
            val stack = Stack<String>()
            for (token in tokens) {
                if (token == "..") {
                    if (stack.size == 0) {
                        continue
                    } else {
                        stack.pop()
                    }
                } else if (token == "." || token == "") {
                    continue
                } else {
                    stack.push(token)
                }
            }
            val result = "/" + stack.joinToString("/").removeSuffix("/")
            if (stack.isEmpty() && result.isEmpty()) {
                return "/"
            }
            return result
        }
    }
}