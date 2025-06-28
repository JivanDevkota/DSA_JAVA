package list;

public class SingleLinkedList {
    private  ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //display LinkedList
        public void display(){
            ListNode current=head;
            while (current!=null){
                System.out.print(current.data+"--->");
                current=current.next;
            }
            System.out.println("null");
        }

        //return length of linkedlist
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

        public void  insert(int position,int data){
            //1-4-5
            //1-6-4-5
            ListNode newNode=new ListNode(data);
            if(position==1){
                newNode.next=head;
                head=newNode;
            }
            else {
                ListNode previous=head;
                int count=1;          //position-1;
                while (count<position-1){
                    previous=previous.next;
                    count++;
                }
                ListNode current=previous.next;
                previous.next=newNode;
                newNode.next=current;
            }
        }

        public void insertLast(int data){
            ListNode newNode=new ListNode(data);
            if (head==null){
                head=newNode;
                return;
            }
        ListNode current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
    }

        public ListNode deleteFirst(){
            if (head==null){
                return null;
            }
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return temp;
        }

        public void deleteNthPosition(int position){
          /* position is valid and start from 1
            8--2--7--1--null
            lets delete position 2  */
            if (position==1){
                head=head.next;
            }else {
                ListNode previous=head;
                int count=1;
                while (count<position-1){
                    previous=previous.next;
                    count++;
                }
                ListNode current=previous.next;
                previous.next=current.next;
            }

        }

        public boolean find(int searchKey){
            if (head==null){
                return false;
            }
            ListNode current=head;
            while (current!=null){
                if(current.data==searchKey){
                    return true;
                }
                current=current.next;
            }
            return false;
        }


    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.display();
        list.insert(2,8);
        list.insert(4,7);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteNthPosition(2);
        list.display();
           if (list.find(7)){
               System.out.println("yes it find 7");
           }
           else {
               System.out.println("No it dont");
           }

    }



}
