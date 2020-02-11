
public class FizzBuzz {

    String generate1(int number){
        String result=new String();
        
        
        /*Dividible entre 3 y 4*/
        if (number % 3 == 0 && number % 5 == 0) result="FizzBuzz";
        
        /*Dividible entre solo 3*/
        else if(number % 3 == 0) result="Fizz";
        
        /*Dividible entre solo 5*/
        else if(number % 5 == 0) result="Buzz";
        
        		/*No divide ni 3 ni 5*/
               else result =Integer.toString(number);;

        return result;
    }

    void generate_much(){
        for(int count = 0; count < 100; count++) {
             System.out.println("Resultado de "+count+" = "+ generate1(count));
        }
    }


}
