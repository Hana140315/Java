import java.util.ArrayList;

public class CafeUtil {
	public int getStreakGoal(){
        int weeks=0;
        for (int i=0; i<10;i++){
            weeks +=i;
        }
        return weeks;
     
	}
    public double getOrderTotal(double[] prices){
        double total=0;
        for(int k=0; k<prices.length; k++){
            total+= prices[k];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for (int j=0; j<menuItems.size(); j++){
            System.out.println( j + menuItems.get(j));

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