
public class FizzBuzz {

    String generate1(int number){
        String result=new String();
        
        
        
        if (number % 3 == 0 && number % 5 == 0) result="FizzBuzz";
        else if(number % 3 == 0) result="Fizz";
        else if(number % 5 == 0) result="Buzz";
               else result =Integer.toString(number);;

        return result;
    }

    void generate_much(){
        for(int i = 0; i < 100; i++) {
             System.out.println("Resultado de "+i+" = "+ generate1(i));
        }
    }


}
