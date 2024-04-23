import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueImplement {
    public static void main(String[] args) {
        QueueImplement mine = new QueueImplement();
        mine.menu();
    }

    Queue<Integer> antrian = new LinkedList<>();
    Scanner input = new Scanner(System.in);
    int max = 5, top = 0;

    public void insert() {
        System.out.print("\nInput number : ");
        antrian.add(input.nextInt());
        this.top++;
    }

    public void pop() {
        System.out.print("Select the data you want to delete  : ");
        antrian.remove(input.nextInt());
        this.top--;
    }

    public void menu() {
        String choose;
        do {
            System.out.println("\nQUEUE OPERATIONS");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.println("7. Exit");
            System.out.print("\nYour Choice ? : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    if (top < max) {
                        insert();
                        System.out.println("Queue = " + antrian);
                    } else {
                        System.out.println("Queue full!\n");
                    }
                    break;
                case 2:
                    if (top != 0) {
                        System.out.println("Queue = " + antrian);
                        pop();
                        System.out.println("New Queue = " + antrian);
                    } else {
                        System.out.println("Queue empty!\n");
                    }
                    break;
                case 3:
                    if (top != 0) {
                        System.out.println("First Data in the Queue = " + antrian.peek());
                    } else {
                        System.out.println("Queue empty!\n");
                    }
                    break;
                case 4:
                    if (top == 0) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;
                case 5:
                    if (top == max) {
                        System.out.println("Queue full!\n");
                    } else {
                        System.out.println((max - top) + " more slot(s) available");
                    }
                    break;
                case 6:
                    System.out.println("Size = " + antrian.size());
                    System.out.println("Queue = " + antrian);
                    break;
                case 7:
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input!\n");
                    break;
            }
            System.out.print("Do you want to continue? <Y or N> : ");
            choose = input.next();
        } while (choose.equalsIgnoreCase("Y"));
        input.close();
    }
}
