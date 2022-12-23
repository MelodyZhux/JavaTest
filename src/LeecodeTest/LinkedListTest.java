package LeecodeTest;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedListTest {
      public static void main(String[] args) {
            /*Solution3 s = new Solution3();
            int[] i = {1,3,4};
            int[] j = {2,5};
            s.findMedianSortedArrays(i,j);*/
            Solution4 s4 = new Solution4();

            int i = -10;
            System.out.println(s4.reverse(i));


      }

      public ListNode getNode (ListNode head) {

            ArrayList<ListNode> list = new ArrayList<>();
            int length = 0;

            while(head!= null) {
                  list.add(head);
                  head = head.next;
                  length++;
            }

            return list.get(length/2);


      }


}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution1 {
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummy;
            int carry = 0;
            while(p!=null || q !=null) {
                  int i = p != null ? p.val : 0;
                  int j = q != null ? q.val : 0;
                  int sum = i + j + carry;
                  carry = sum/10;
                  curr.next = new ListNode(sum%10);
            }
            if (carry>0)
                  curr.next = new ListNode(carry);
            return dummy.next;

      }

}

class Solution2 {
      public int lengthOfLongestSubstring(String s) {
            int maxLen = 0;
            for(int start = 0; start < s.length(); start++){
                  HashSet<Character> in = new HashSet<>();
                  for(int i = start; i < s.length(); i++){
                        if(!in.contains(s.charAt(i))){
                              in.add(s.charAt(i));
                              maxLen = Math.max(maxLen, in.size());
                        } else break;
                  }
            }
            return maxLen;
      }
}

class cat {
      public int i=0;
      public cat() {};

}


class Solution3 {
      public void findMedianSortedArrays(int[] nums1, int[] nums2) {
            double median = 0.00;
            List<Integer> list  = Arrays.stream( nums1 ).boxed().collect( Collectors.toList() );
            List<Integer> list1 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
            list.addAll(list1);
            Collections.sort(list);
            System.out.println(list);
            int m = list.size()/2;
            System.out.println(m);
            if(list.size()%2 ==0) {
                  median = (list.get(m - 1) + list.get(m)) / 2.0d;
                  System.out.println(list.get(m - 1));
            }
            else median = list.get(m);
            System.out.println(median);



      }
}

class Solution4 {
      public int reverse(int x) {
                  long rev = 0;

                  while(x!=0){
                        rev = rev*10+(x%10);   // construct reverse long input
                        x=x/10;
                  }

                  if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                        return 0;
                  }

                  return (int)rev;
            }
}