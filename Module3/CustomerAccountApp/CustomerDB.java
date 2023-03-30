public class CustomerDB{

    /*Created database with three customer details like 
    name, address, city and zip code*/
    
public static Customer getCustomer(int customerID){

Customer customer = new Customer();

if(customerID == 1007)

customer = new Customer (" Shraddha Kulkarni ", " 4528 Stengal Loop, Unit 107 ", " Wesley Chapel ", " 33545 ");

else if (customerID == 1008)

customer = new Customer(" Kerry Matthew ", " 11267 S 114th Ave ", " Papillion ", " 68406 ");

else if (customerID == 1009)

customer = new Customer (" Jane August ", " 5729 98th Plaza ", " Omaha ", " 68416 ");

else 

customer = new Customer();
return customer;

}


}