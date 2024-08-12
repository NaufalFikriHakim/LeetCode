public class Solutions {

    public static ListNode createIntLinkedList(int[] nums){

        ListNode head = new ListNode(nums[0]);
        ListNode headCopy = head;
        for (int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            head.next = temp;
            head = head.next;
        }
        
        return headCopy;
    }

    public static void intLinkedListDebug(ListNode head){
        while (head != null) {
            System.out.print( head.val + ", ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,4};
        ListNode head1 = createIntLinkedList(nums1);

        int[] nums2 = new int[]{1,3,4};
        ListNode head2 = createIntLinkedList(nums2);

        mergeTwoLists(head1, head2);
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode returnNode = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list1.next;
            }
        }

        head.next = (list1 != null) ? list1 : list2;

        return returnNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    
}


