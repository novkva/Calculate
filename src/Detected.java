public class Detected {
    String newNumb;
    boolean arabNumb = true;
    int value;


    public boolean rome(String numb){
        String [] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String upNumb = numb.toUpperCase();
        for (int i = 0; i < 10; i++){
            if (upNumb.equals(rome[i]) ){
                value = i+1;
                arabNumb = false;
                break;
            }
        }
        return arabNumb;
    }

    public void arab(String numb){
        try {
            value = Integer.parseInt(numb);
        }catch(NumberFormatException e){
            System.out.println("Error");
            System.exit(0);
        }
        if (value > 10 || value < 0){
            System.out.println("Error");
            System.exit(0);
        }
    }

    public void detect(){
        if(rome(newNumb)==true){
            arab(newNumb);
        }
    }
}
