import java.util.*;

public class queue {

  public static void main(String[] args) {
    Base b = new Base();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("What you Want?");
      System.out.println("Enter 1 for Enqueue");
      System.out.println(" Enter 2 for Dequeue");
      int choice = 1;
      switch (choice) {
        case 1:
          int x = sc.nextInt();
          System.out.println("Enter Value For Enqueue");
          b.enqueue(x);
          break;
        case 2:
          System.out.println("Enter value for Dequeue");
          b.dequeue();
      }
      System.out.println("Enter Value for enqueue");
    }
  }
}

class Base {

  int a[] = new int[10];
  int f = 0;
  int r = 0;
  int i;

  public void enqueue(int x) {
    if (f >= a.length) {
      System.out.println("Queue Is Overflow");
    } else {
      r = r + 1;
      a[r] = x;
    }
  }

  public void dequeue() {
    if (f == r) {
      System.out.println("queue is underflow");
    } else {
      f = f + 1;
      int y = a[f];
      System.out.println(" value is removed");
    }
  }
}
