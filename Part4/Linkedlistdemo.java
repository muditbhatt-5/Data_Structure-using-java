import java.util.*;

class Demo {

  Node list;

  class Node {

    Node next;
    int data;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public void insert_first(int data) {
    Node curre = new Node(data);

    if (list == null) {
      list = curre;
      return;
    } else {
      curre.next = list;
      list = curre;
    }
  }

  public void insert_last(int data) {
    Node curre = new Node(data);

    if (list == null) {
      list = curre;
      return;
    } else {
      Node currentNode = list;
      while (currentNode != null) {
        currentNode = currentNode.next;
      }
      currentNode.next = curre;
    }
  }

  public void display() {
    Node curredisplay = list;

    while (curredisplay != null) {
      System.out.println("Your element :: " + curredisplay.data);
      curredisplay = curredisplay.next;
    }
  }
}

public class Linkedlistdemo {

  public static void main(String[] args) {
    int ch;
    Demo d = new Demo();
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("choose your operation...");
      System.out.println("1. Insert data");
      System.out.println("2. Display data");
      System.out.println("3. for exit");
      System.out.print("operation");
      ch = sc.nextInt();

      switch (ch) {
        case 1:
          System.out.println("Enter For New Node:");
          int x = sc.nextInt();
          d.insert_first(x);
          break;
        case 2:
          d.display();
          break;
        case 3:
          System.out.println("exited");
          break;
        default:
          System.out.println("Invalid choice. Try again.");
      }
    } while (ch != 3);
  }
}
