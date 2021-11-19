    private static void baekjoon() {
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int cnt = 10;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a <= 1000 && a > 0) {
                arr[i] = a;
            }
        }

        for (int i : arr) {
            arr[i] %= 42;
        }
        Arrays.sort(arr);
        for (int i : arr) {
            if (arr[i] == arr[i + 1]) {
            }
        }
    }
