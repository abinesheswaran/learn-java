public class ExceptionHandling {
    public static void main(String args[]) throws CustomException {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("ArithmeticException occured");
        }
        try{
            throwCustomException();
        }catch(CustomException e){
            System.out.println("Custom Exception handling...");
        }
        throwCustomException();
    }

    public static void throwCustomException() throws CustomException{
        throw new CustomException("this is my custom Exception");
    }
}

