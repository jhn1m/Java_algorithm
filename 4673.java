class Main {
    static boolean[] selfNumArr = new boolean[10001];

    static int selfNum(int n) {
        String nStr = String.valueOf(n);
        String[] nStrArr = nStr.split("");
        int result = 0;

        if (nStrArr.length >= 2) {
            for (int i = 0; i < nStrArr.length; i++) {
                result += Integer.parseInt(nStrArr[i]);
            }
            result += n;
        } else {
            result = n + n;
        }

        return result;
    }

    static void selfNumAdd() {
        for (int i = 1; i < 10001; i++) {
            int n = selfNum(i);
            if (n <= 10000) {
                selfNumArr[n] = true;
            }
        }
    }

    static void selfNumPrint() {
        for (int i = 1; i < selfNumArr.length; i++) {
            if (!selfNumArr[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        selfNumAdd();
        selfNumPrint();
    }

}
