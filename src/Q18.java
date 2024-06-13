import java.util.Scanner;
import java.util.StringTokenizer;

class Q18_ii{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        StringTokenizer st = new StringTokenizer(exp, "+-*/", true);
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
    }
}
