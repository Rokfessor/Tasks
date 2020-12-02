package Joseph;

public class Main {
    public static void main(String[] args) {
        System.err.println(joseph(12, 8, 3));
    }

    static int joseph(int count, int step, int start) {
        if (start > count)
            return 0;

        int res = 0;
        for (int i = 1; i <= count; ++i)
            res = (res + step) % (i);
        return res + start - (count * ((res + start) / count));
    }
}
