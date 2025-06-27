package list;

public class SingleLinkedList {
    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

        public void display(){
            ListNode current=head;
            while (current!=null){
                System.out.print(current.data+"--->");
                current=current.next;
            }
            System.out.println("null");
        }

        public int length(){
            if (head==null){
                return 0;
            }
            int count=0;
            ListNode current=head;   //1->2--3
            while (current!=null){
                count++;
                current=current.next;
            }
            return count;
        }

        public void  insertFirst(int data){
            ListNode newNode=new ListNode(data);
            newNode.next=head;
            head=newNode;
        }


    }
}
