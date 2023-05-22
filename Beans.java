/* Code snippet: */

class Employee implements java.io.Serializable{
    private String name;
    private String pass;
    Employee(){
        
    }
    void setName(String name){
        this.name = name;
    }
    void setPass(String pass){
        this.pass = pass;
    }
    public String getName(){
        System.out.println(name);
        return name;
    }
    public String getPass(){
        System.out.println(pass);
        return pass;
    }
    
}

class Main{
    public static void main(String[] args){
        Employee aman = new Employee();
        aman.setName("Aman");
        aman.setPass("1234");
        aman.getName();
        aman.getPass();
    }
}

/* Output: 
Aman
1234
*/
