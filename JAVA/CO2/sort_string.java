import java.util.Arrays;

class sort_string {
 public static void main(String[] args) {
   char string[] = {'s', 'i', 'm', 'p', 'l', 'y', 'e', 'a', 's', 'y', 'l', 'e', 'a', 'r', 'n', 'i', 'n', 'g'};
   System.out.println("String before sorting - " + new String(string));
   Arrays.sort(string);
   System.out.println("String after sorting  - " + new String(string));
 }
}