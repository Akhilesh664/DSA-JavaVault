package RegexPractise;

public class AddTwoStringsWithCarry_21 {

        public static void main(String[] args) {

            String a = "1234";
            String b = "432500";

            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;

            int maxLength = Math.max(a.length(), b.length()) + 1;
            int[] res = new int[maxLength];
            int k = res.length - 1;

            while (i >= 0 || j >= 0) {
                int sum = carry;

                if (i >= 0) {
                    sum += a.charAt(i--) - '0';
                }
                if (j >= 0) {
                    sum += b.charAt(j--) - '0';
                }

                res[k--] = sum % 10;
                carry = sum / 10;
            }

            if (carry > 0) {
                res[k] = carry;
            }

            StringBuilder result = new StringBuilder();

            for (int x : res) {
                if (!(result.length() == 0 && x == 0)) {
                    result.append(x);
                }
            }

            System.out.println(result.toString());
        }
    }


