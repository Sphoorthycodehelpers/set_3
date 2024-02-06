import java.util.*;

class DLL {
    public static void main(String ar[]) {
        LinkedList<Integer> dl = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("-----Doubly Linked List-----");
        while (true) {
            System.out.println("Choose option");
            System.out.println("1. add 2. delete 3. Display 4. exit");
            int option = s.nextInt();
            switch (option) {
                case 1: {
                    System.out.print("Enter Element: ");
                    int element = s.nextInt();
                    dl.add(element);
                    break;
                }
                case 2: {
                    System.out.print("Enter Element: ");
                    int element = s.nextInt();
                    System.out.println("deleted element: " + dl.remove(dl.indexOf(element)));
                    System.out.println(dl);
                    break;
                }
                case 3: {
                    System.out.println(dl);
                    break;
                }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Choose between options 1-3");
            }
        }
    }
}
