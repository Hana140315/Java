import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
	public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> myArray =new ArrayList<Integer>();
        Random r = new Random();
        for (int i=0; i<10;i++){
        
        myArray.add(r.nextInt(20)); 
    }
    return myArray;
	}	

    public char getRandomLetter(){
        Random rand=new Random();
        char[] letter={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i=0; i<25; i++){
        }
        return letter[rand.nextInt(25)];
        
    }
    
    public String[] generatePassword(){
        String [] Password;
        Password= new String[8];
        for (int i=0; i<8; i++){
            Random r=new Random();
            Password[i]= r.getRandomLetter() ||r.getTenRolls();

        }
    }
       
    public void addCustomer(ArrayList<String> customer){
        System.out.println( "Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println( "Hello, "+ userName);
        System.out.println("There are   " + customer. size()+ "    in front of you");
        customer.add(userName);
        System.out.println(customer);

    }
}