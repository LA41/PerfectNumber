public class PerfectNumber {
    public static void main(String[] args) {
        //check whether 496 is a perfect number
        System.out.println(isPerfectNumber(496));
        //check when -1 is a given number
        System.out.println(isPerfectNumber(-1));

    }
    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int sumOfProperDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sumOfProperDivisors += i;
        }
        return (sumOfProperDivisors == number);

    }
}
