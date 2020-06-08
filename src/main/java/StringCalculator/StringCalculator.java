package StringCalculator;

public class StringCalculator {

    public int Add(String numbers) {
        String[] numbersList = numbers.split(",");
        switch (numbersList.length) {
            case 1 :
                // No arguments
                if (numbersList[0].equals("")) {
                    return 0;
                }
                // 1 number
                return Integer.parseInt(numbersList[0]);
            case 2 :
                // 2 numbers
                return Integer.parseInt(numbersList[0]) + Integer.parseInt(numbersList[1]);
        }
        return 0;
    }
}
