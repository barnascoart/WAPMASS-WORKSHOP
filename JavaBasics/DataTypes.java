enum Subjects {
        Biology,
        Physics,
        Chemistry,
        E_Maths
}
public class DataTypes {
  public static void main(String[] args){
    String[] names = {"Nana", "Yaa", "Addo"};
    //concatenation
    String combineName  = "";
    for(String name : names){
     combineName += " " +name;
    }
    System.out.println(combineName); 
    
    // find of string 
    System.out.println(combineName.length());
    
    //get part of string 
    System.out.println(combineName.substring(3, 10));
    
    //enum 
   
    System.out.println(Subjects.Biology);
  }
}