package Practice;

public class Number13 {

    public static int roman(String s) {
        String[] ary = s.split("");

        System.out.println(ary.length);
        int romanInt = 0;
        for (int i=0; i<ary.length;i++) {
            if ((i+1) < ary.length) {
                if ((ary[i] + ary[i + 1]).equals("IX")) {
                    romanInt += 9;
                    i++;
                    continue;
                }

                if ((ary[i] + ary[i + 1]).equals("IV")) {
                    romanInt += 4;
                    i++;
                    continue;
                }

                if ((ary[i] + ary[i + 1]).equals("XL")) {
                    romanInt += 40;
                    i++;
                    continue;

                }
                if ((ary[i] + ary[i + 1]).equals("XC")) {
                    romanInt += 90;
                    i++;
                    continue;
                }
                if ((ary[i] + ary[i + 1]).equals("CD")) {
                    romanInt += 400;
                    i++;
                    continue;
                }
                if ((ary[i] + ary[i + 1]).equals("CM")) {
                    romanInt += 900;
                    i++;
                    continue;

                }
            }

            switch (ary[i]){
                case ("I"):
                    romanInt += 1;
                    break;
                case ("V"):
                    romanInt += 5;
                case ("X"):
                    romanInt += 10;
                case ("L"):
                    romanInt += 50;
                case ("C"):
                    romanInt += 100;
                case ("D"):
                    romanInt += 500;
                case ("M"):
                    romanInt += 1000;

            }

        }

    return romanInt;
    }
    public static void main(String[] args) {
        System.out.println(roman("MCMXCIV"));
    }
}
