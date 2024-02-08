import static java.lang.Integer.parseInt;

public class FizzBuzz {
    public static void main(String[] args) {
        if(args.length ==3){ // Check about correct arguments length
            try { // check argument type
                int startNum = 1; // variable for counting Num
                int limitNum = parseInt(args[0]); // variable for limit
                int xNum = parseInt(args[1]); // first arg about check multiple
                int yNum = parseInt(args[2]); // second arg about check multiple

                while(startNum<=limitNum){ //loop when Num in limit
                    if ((startNum % xNum) == 0 || (startNum % yNum) == 0 ){ //mod xNum and yNum
                        String printStr="";
                        if((startNum % xNum) == 0){
                            printStr += "Fizz";
                        }
                        if((startNum % yNum) == 0){
                            printStr += "Buzz";
                        }
                        System.out.println(printStr);
                    }
                    else {
                        System.out.println(startNum);
                    }
                    startNum++;
                }
            }
            catch (NumberFormatException e){
                System.out.println("this is incorrect arguments type-> " + e.getMessage());
            }

        }
        else {
            System.out.println("This is wrong argument length");
        }

    }
}
