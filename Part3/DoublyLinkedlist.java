import java.util.*;
class Node{
  Node lptr;
  int info;
  Node rptr;
}
class LinkedList{
  Node L;
  Node R;
  
  void insertBefore(int m, int x){  
    Node newNode = new Node();
    newNode.info=x;
    if(R==null){
      newNode.lptr=null;
      newNode.rptr=null;
      L=newNode;
      R=newNode;
    }
    else if(L.info==m){
      newNode.lptr=null;
      newNode.rptr=L;
      L.lptr=newNode;
      L=newNode;
    }
    else{
      Node save=L;
      while(save.rptr!=null && save.info!=m){
        save=save.rptr;
      }
      if(save.info==m){
        newNode.lptr=save.lptr;
        newNode.rptr=save;
        save.lptr=newNode;
        newNode.lptr.rptr=newNode;
      }      
    } 
  }

  
  void delete(int old) {
    if(L==null){
      System.out.println("LL is empty");
    }
    else if(R==L && old==L.info){ 
      L=null;
      R=null;
    }
    else if(old==L.info){
      L=L.rptr;
      L.lptr=null;
    }
    else if(old==R.info){
      R=R.lptr;
      R.rptr=null;
    }
    else{
      Node save=L;
      while(save.rptr!=null && save.info!=old){
        save=save.rptr;
      }
      if(save.info==old){
        save.lptr.rptr=save.rptr;
        save.rptr.lptr=save.lptr;
      }else{
        System.out.println("Element not found");
      }
    }
  }


  void display(){
    Node save=L;
    if(L==null){
      System.out.println("LL Underflow");
    }else{
      while(save!=R){
        System.out.println(save.info+" ");
        save=save.rptr;
      }
      System.out.println(save.info);
    }
  }
}
class DoublyLinkedlist {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    int choice;
    do{
      System.out.println("1. for insert new");
      System.out.println("2. for delete");
      System.out.println("3. for display");
      System.out.println("4. for exit");
      System.out.print("Enter choice:");
      choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.println("Enter element which are inserted previous :- ");
          int m = sc.nextInt();
          System.out.println("Enter element :- ");
          int x = sc.nextInt();
          list.insertBefore(m, x);
          break;
        case 2:
          System.out.println("Enter node element to delete");
          list.delete(sc.nextInt());
          list.display();
          break;
        case 3:
          list.display();
          break;
        case 4:
            System.out.println("exited");
            break;
        default:
            System.out.println("invalid chaoice");
      }
    }while(choice!=4);
  }
}