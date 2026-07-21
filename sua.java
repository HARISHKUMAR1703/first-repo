



public class sua {
    static int p=0;
    void push(int[] a, int d){
        if(p < a.length){
            a[p] = d;
            p++;
        }
        else{
            System.out.println("stack overflow");
        }
    }
    void pop(int[] a){
        if(p>0){
            a[p-1]=0;
            p--;
        }
        else{
            System.out.println("stack underflow");
        }
        }
        void peek(int[] a){
            if(p>0){
                System.out.println("top element is :"+a[p-1]);
            }
            else{
                System.out.println("stack empty");
            }
        }
        void isfull(int[] a){
            if(p==a.length){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        void size(int[] a){
            System.out.println("size of stack :"+p);
        }


    public static void main(String args[]){
        sua s=new sua();
        int[] a=new int[10];  
        s.push(a,1);
        s.push(a,4);
        s.push(a,7);
        s.push(a,3);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        s.pop(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        s.peek(a);
        System.out.println();
        s.isfull(a);
        System.out.println();
        s.size(a);


      } 
        
    
}