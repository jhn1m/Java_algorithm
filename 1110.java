Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = sc.nextInt();
        while (true) {
            if (n >= 0 && n <= 99) {
                n = (n % 10) + (n / 10);
                n = ((n % 10) * 10) + n;
            } else if (n < 10) {
                n = n * 10;
            }
            i++;
            sc.close();
