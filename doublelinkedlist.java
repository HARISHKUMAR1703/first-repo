
 
    

public class dllist{

    class node{
       int data;
       node next;
       node prev;
       node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
       }
    }
       
       node head;
       node tail;
       void insert(int d){
        node n=new node(d);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
       }
       void tfront(){
        node temp;
            temp=head;
            if(head==null){
                System.out.println("linked list is empty");
            }
            else{
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }
       
    
       void tback(){
            node temp=tail;
            if(head==null){
                System.out.println("linked list is empty");
            }
            else{
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.prev;

                }
            }
        }
        void reverse(){
            node temp;
            node current=head;
            while(current!=null){
                temp=current.prev;
                current.prev=current.next;
                current.next=temp;
                current=current.prev;
            }
            temp=head;
            head=tail;
            tail=temp;

        }
    
       
   
    public static void main(String args[])
{
    dllist a=new dllist();
    a.insert(5);
    a.insert(6);
    a.insert(7);
    a.tfront();
    System.out.println("------");
    a.reverse();
    a.tfront();
    }
}
