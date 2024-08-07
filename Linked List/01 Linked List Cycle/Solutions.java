import java.util.ArrayList;
import java.util.List;

public class Solutions {
    public static void main(String[] args) {
        
    }

    public boolean hasCycle(ListNode head){

        List<ListNode> lst = new ArrayList<>();

        if (head == null) {
            return false;
        }

        while (head.next != null && !lst.contains(head.next)) {
            lst.add(head);
            head = head.next;
        }

        if (head.next != null) return true;


        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
