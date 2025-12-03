public class StringN {



        private static boolean isPrime(int n) {
            if (n <= 1) return false;
            if (n == 2) return true;
            if (n % 2 == 0) return false;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) return false;
            }
            return true;
        }


        private static int digitalRoot(int n) {
            while (n >= 10) {
                int sum = 0;
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                n = sum;
            }
            return n;
        }


        public static String[] transformCodes(int[] input1) {
            String[] result = new String[input1.length];

            for (int i = 0; i < input1.length; i++) {
                int n = input1[i];
                StringBuilder answer = new StringBuilder();


                if (String.valueOf(n).length() == 6) {
                    answer.append("C");
                } else {
                    answer.append("W");
                }


                if (n == 0) {
                    answer.append("Z");
                } else if (n == 1) {
                    answer.append("O");
                } else if (isPrime(n)) {
                    answer.append("P");
                } else {
                    answer.append("N");
                }

                // Step A3
                answer.append(digitalRoot(n));


                if (n % 2 == 0) {
                    answer.append(n / 2);
                } else {
                    answer.append((n - 1) / 2);
                }

                result[i] = answer.toString();
            }

            return result;
        }


        public static void main(String[] args) {
            int[] input1 = {12};
            String[] output = transformCodes(input1);

            for (String s : output) {
                System.out.println(s);
            }
        }
    }


