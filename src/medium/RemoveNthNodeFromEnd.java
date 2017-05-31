package medium;

//19
public class RemoveNthNodeFromEnd {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0);
		ListNode slow = start, fast = start;
		slow.next = head;
		
		for(int i = 1; i <= n + 1; i ++) {
			fast = fast.next;
		}
		
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		return start.next;
	}
	
}