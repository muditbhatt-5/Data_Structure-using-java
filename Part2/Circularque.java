import java.util.*;

public class Circularque {

  public static void main(String[] args) {
    int choice;
    Base b = new Base();
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("1. enqueue");
      System.out.println("2. dequeue");
      System.out.println("3. display");
      System.out.println("4. exit");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter Value For Enqueue");
          int x = sc.nextInt();
          b.enqueue(x);
          break;
        case 2:
          System.out.println("dequeued");
          b.dequeue();
          break;
        case 3:
          b.display();
          break;
        case 4:
          System.out.println("exited");
          break;
        default:
          System.out.println("invalid choice");
      }
    } while (choice != 4);
  }
}

class Base {

  int a[] = new int[10];
  int f = 0;
  int r = 0;
  int i;

  public void enqueue(int x) {
    if (r == x) {
      r = 1;
    } else {
      r = r + 1;
    }
    if (f == r) {
      System.out.println("queue is overflow");
    } else {
      a[r] = x;
    }
    if (f == -1) {
      f = 0;
    }
  }

  public void dequeue() {
    if (f == r) {
      f = -1;
      r = -1;
    }
    if (f == -1) {
      System.out.println("Queue is underflow");
    } else {
      int y = a[f];
    }
    if (f == -1) {
      f = 0;
    } else {
      f++;
    }
  }

  public void display() {
    for (int i = f; i <= r; i++) {
      System.out.println("Queue" + a[i]);
    }
  }
}
