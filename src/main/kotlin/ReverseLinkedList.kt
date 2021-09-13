import ReverseLinkedList.ListNode

fun main() {

    val node5 = ListNode(5)
    val node4 = ListNode(4).apply { next = node5 }
    val node3 = ListNode(3).apply { next = node4 }
    val node2 = ListNode(2).apply { next = node3 }
    val node1 = ListNode(1).apply { next = node2 }

    var result = ReverseLinkedList.Solution().reverseList(node1)
    while (result != null) {
        print(result.`val`)
        print(",")
        result = result.next
    }
}

object ReverseLinkedList {
    class Solution {
        fun reverseList(head: ListNode?): ListNode? {
            var prev: ListNode? = null
            var tempHead: ListNode? = head

            while (tempHead != null) {
                val next = tempHead.next
                tempHead.next = prev
                prev = tempHead
                tempHead = next
            }

            return prev
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}