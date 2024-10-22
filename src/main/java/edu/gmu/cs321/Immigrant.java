package edu.gmu.cs321;

public class Immigrant {

    private int id;
    private String ANumber;
    private String firstName;
    private String lastName;
    private String DOB;
    private String email;
    private String phone;
    private String address;
    private int[] dependentIDs;

    public Immigrant(int id){
        this.id = id;
    }

    public void setImmigrantFields(String ANumber, String firstName, String lastName, String DOB, String email, String phone, String address){
        this.ANumber = ANumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public void getImmigrantForm(){
        System.out.println("ANumber: "+this.ANumber+"\nFirst Name: "+this.firstName+"\nLast Name: "+
        "\nDate of Birth: "+this.DOB+"\nEmail: "+this.email+"Phone: "+this.phone+"Address: "+this.address);
    }

    public boolean validateImmigrant(){
        if(this.firstName.length() >= 2 && this.lastName.length() >= 2){
            return true;
        } else {
            System.out.println("ERROR!");
            return false;
        }
    }

   
    
}
