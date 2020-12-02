package Joseph;

public class Main {
    public static void main(String[] args) {
        System.err.println(joseph(12, 2, 2));
    }

    static int joseph (int n, int k, int s) {
        int res = 0;
        for (int i=s; i<=n; ++i)
            res = (res + k + s) % (i);
        return res + 1;
    }
}
