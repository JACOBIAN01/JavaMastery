//Recursion

class Main {

    static void WriteNtimes(int n, String text) {
        if (n == 0) {
            return;
        }
        System.out.println(text);
        WriteNtimes(n - 1, text);
    }

    static void Display(int n, int count) {
        if (count == 0) {
            return;
        }
        System.out.println(n);
        Display(n + 1, count - 1);
    }

    static void RevDisplay(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        RevDisplay(n - 1);
    }

    static Integer Sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + Sum(n - 1);
    }

    static Integer Fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * Fact(n - 1);
    }

    static void RevArr(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            int index = n - i - 1;
            newArr[i] = arr[index];
        }
        System.out.println("Input Array");
        for (int m : arr) {
            System.out.print(m + " ");
        }
        System.out.println();
        System.out.println("Reversed Array");
        for (int o : newArr) {
            System.out.print(o + " ");
        }
    }

    public static void Pal(String s){
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        RevArr(arr);
    }
}
