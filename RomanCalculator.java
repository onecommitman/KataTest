package KataTest;

public class RomanCalculator {
    private int a;
    private int b;
    int result;

    public String calculate(String firstNumber, String secondNumber, String operator, boolean isRoman) {
        int a = Integer.parseInt(firstNumber);
        int b = Integer.parseInt(secondNumber);
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operator);
        }
        if(isRoman) return arabToRoman(result);
        else return Integer.toString(result);
    }

    /*Переводит римские цифры в арабские.
    * */
    public String romanToNumber (String roman) {
        String result;
        switch (roman){
            case "I":
                result = "1";
                break;
            case "II":
                result = "2";
                break;
            case "III":
                result = "3";
                break;
            case "IV":
                result = "4";
                break;
            case "V":
                result = "5";
                break;
            case "VI":
                result = "6";
                break;
            case "VII":
                result = "7";
                break;
            case "VIII":
                result = "8";
                break;
            case "IX":
                result = "9";
                break;
            case "X":
                result = "10";
                break;
            default:
                throw new IllegalArgumentException("Римские цифры от I до X");
        }
        return result;
    }

    /**
     * Переводит арабские цифры в римские
     * P.S. решение дебильное, но первое, что пришло в голову. По времени не успеваю по другому(((
    **/
    public String arabToRoman(int number) {
        String result = null;
        switch (number){
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
            break;
            case 3:
                result = "III";
            break;
            case 4:
                result = "IV";
            break;
            case 5:
                result = "V";
            break;
            case 6:
                result = "VI";
            break;
            case 7:
                result = "VII";
            break;
            case 8:
                result = "VIII";
            break;
            case 9:
                result = "IX";
            break;
            case 10:
                result = "X";
            break;
            case 11:
                result = "XI";
            break;
            case 12:
                result = "XII";
            break;
            case 13:
                result = "XIII";
            break;
            case 14:
                result = "XIV";
            break;
            case 15:
                result = "XV";
            break;
            case 16:
                result = "XVI";
            break;
            case 17:
                result = "XVII";
            break;
            case 18:
                result = "XVII";
            break;
            case 19:
                result = "XIX";
            break;
            case 20:
                result = "XX";
            break;
            case 21:
                result = "XXI";
                break;
            case 24:
                result = "XXIV";
                break;
            case 25:
                result = "XXV";
                break;
            case 27:
                result = "XXVII";
                break;
            case 28:
                result = "XXVIII";
                break;
            case 30:
                result = "XXX";
                break;
            case 32:
                result = "XXXII";
                break;
            case 35:
                result = "XXXV";
                break;
            case 36:
                result = "XXXVI";
                break;
            case 40:
                result = "XL";
                break;
            case 42:
                result = "XLII";
                break;
            case 48:
                result = "XLVIII";
                break;
            case 49:
                result = "XLIX";
                break;
            case 50:
                result = "L";
                break;
            case 54:
                result = "LIV";
                break;
            case 56:
                result = "LVI";
                break;
            case 60:
                result = "LX";
                break;
            case 63:
                result = "LXIII";
                break;
            case 64:
                result = "LXIV";
                break;
            case 70:
                result = "LXX";
                break;
            case 72:
                result = "LXXII";
                break;
            case 80:
                result = "LXXX";
                break;
            case 81:
                result = "LXXXI";
                break;
            case 90:
                result = "XC";
                break;
            case 100:
                result = "C";
                break;
            default:
                throw new IllegalArgumentException("Результат операции не может быть меньше 1 или отрицательным!");
        }
        return result;
    }
}
