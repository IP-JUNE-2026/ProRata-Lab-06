public class IT22629180Lab6Q2A {
    public static void main(String[] args) {
        int i = 1;
        StringBuilder sb = new StringBuilder();
        while (i <= 10) {
            sb.append(i);
            if (i < 10) {
                sb.append(" ");
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}
