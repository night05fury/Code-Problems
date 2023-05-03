//package LeetCode_Problems;
//
////import org.w3c.dom.Node;
//
////https://leetcode.com/LeetCode_Problems/middle-of-the-linked-list/solutions/?envType=study-plan&id=algorithm-i
//public class Middle_Of_LinkedList {
//
//        public ListNode middleNode(ListNode head) {
//            if(head==null || head.next==null)
//                return head;
//            ListNode left=head;
//            ListNode right=head;
//            while(right!=null && right.next!=null)
//            {
//                left=left.next;
//                right=right.next.next;
//            }
//            return left;
//        }
//
//}
