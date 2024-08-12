class Solutions {
    public static void main(String[] args) {
        System.out.println("0.4036 / 0.004");
    }

    public static void debugIntArray(int[] array){
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    public static void debugCharArray(char[] array){
        for (char i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    public static ListNode createIntLinkedList(int[] nums){

        ListNode head = new ListNode(nums[0]);
        ListNode headCopy = head;
        for (int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            head.next = temp;
        }
        
        return headCopy;
    }

    public static void intLinkedListDebug(ListNode head){
        while (head != null) {
            System.out.print( head.val + ", ");
        }
        System.out.println();
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

    