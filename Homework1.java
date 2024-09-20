package student;

public class Homework1 {

    public double shippingCalculator(int n) {
        //TODO Write your code here for problem 1
        double charge;
        if (n == 1) {
            charge = 10.95;
        } else if (n > 1) {
            charge = ((n - 1) * 2.95) + 10.95;
        }
        return charge;
    }

    public boolean isValidTriangle(int a, int b, int c) {
        //TODO Write your code here for problem 2
        boolean isTrue = true;
        if (a < b + c && b < a + c && c < a + b) {
            return isTrue;
        } else {
            return false;
        }

    }

    public boolean isPrime(int number) {
        //TODO Write your code here for problem 3
        boolean result = true;
        if (number < 1) {
            result = false;
        }
        for (int i = 2; i < number; i++)
            if (number % i == 0) {
                result = false;
                break;
            }
        return result;
    }

    public int hex2int(String hex) {
        //TODO Write your code here for problem 4
        if (hex.length() > 1) {
            return -1;
        }
        if (Character.isDigit(hex.charAt(0))) {
            return Integer.valueOf(hex);
            if (hex.charAt(0) == 'A' || hex.charAt(0) == 'a') {
                return 10;
            }
            if (hex.charAt(0) == 'B' || hex.charAt(0) == 'b') {
                return 11;
            }
            if (hex.charAt(0) == 'C' || hex.charAt(0) == 'c') {
                return 12;
            }
            if (hex.charAt(0) == 'D' || hex.charAt(0) == 'd') {
                return 13;
            }
            if (hex.charAt(0) == 'E' || hex.charAt(0) == 'e') {
                return 14;
            }
            if (hex.charAt(0) == 'F' || hex.charAt(0) == 'f') {
                return 15;
            }
            return -1;
        }
        return -1;
    }

    public String int2hex(int value) {
        if (value < 0 || value > 15) {
            return "-1";
        }
        if (value < 10) {
            return String.valueOf(value);
        }
        if (value == 10) {
            return "A";
        }
        if (value == 11) {
            return "B";
        }
        if (value == 12) {
            return "C";
        }
        if (value == 13) {
            return "D";
        }
        if (value == 14) {
            return "E";
        }
        return "F";

    }


}
