public class Customer{

private String name;        //Name of a customer
private String address;     //Address of the customer
private String city;        //Name of the city
private String zip;         //Zip code of the address


public Customer(){      //no-argument constructor to create a customer

name = "";
address= "";
city="";
zip ="";

}

// argument constructor that creates a customer
public Customer(String name, String address, String city,String zip){

this.name= name;
this.address = address;
this.city = city;
this.zip = zip;

}

//Accessor methods for four data field
public void setName(String name){

this.name = name;
}

public String getName(){

return name;
}


public void setAddress(String address){

this.address = address;
}

public String getAddress(){

return address;
}


public void setCity(String city){

this.city = city;
}

public String getCity(){

return city;
}


public void setZipCode(String zip){

this.zip = zip;
}

public String getZipCode(){

return zip;
}

//Override method to get a string description for a customer
public String toString(){

return "\n"+" Name: "+getName() +"\n" + " Address: "+getAddress() + "\n" + " City: " +getCity() +"\n"+ " Zip: "+ getZipCode();
}

}