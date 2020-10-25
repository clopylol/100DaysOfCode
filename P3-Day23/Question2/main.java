    public static void main(String[] args) {
        for (int n = 1729; n < 10000; n++) {
            if (isRamanujan(n) == true) {

            }
        }
    }

    public static boolean isRamanujan(int n) {
        int count = 0;
        int[] temp = new int[4];
        for (int a = 1; a < n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break;
            }
            for (int b = a + 1; b < n; b++) {
                int b3 = b * b * b;
                if (a3 + b3 > n) {
                    break;
                }
                if (a3 + b3 == n) {
                    if (count == 0) {
                        temp[0] = a;
                        temp[1] = b;
                    }
                    if (count == 1) {
                        temp[2] = a;
                        temp[3] = b;
                        
                        System.out.println(n + " is a Ramajuan => " +temp[0] + "^3 + " + temp[1] + "^3 = " + temp[2] + "^3 +" + temp[3] + "^3");
                    }
                    count++;
                }
            }
        }
        return count == 2;
    }