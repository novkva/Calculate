public class Rome {

    public String point(int p) {
        switch (p) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 20:
                return "XX";
            case 30:
                return "XXX";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 60:
                return "LX";
            case 70:
                return "LXX";
            case 80:
                return "LXXX";
            case 90:
                return "XC";
            case 100:
                return "C";
        }
        return null;
    }

    public String romechange(double input) {

        if (input > 0 && (input % 1) == 0) {
            int norm = (int) input;
            String result = "";
            int ost;
            int por = 0;
            while (norm > 0) {
                ost = norm % 10;
                if (ost != 0) {
                    result = point((int) (ost * (Math.pow(10, por)))) + result;
                }
                por++;
                norm = norm / 10;

            }
            return result;
        }else{
            System.out.println("Error");
            System.exit(0);
            return null;
        }
    }
}