package objects;
class Object{
    String name,shape;
    int number;
    Float size,price;   
}
public class Furniture{
    public static void main(String[] args){
     Object table = new Object();
     table.name = "Dining Table";
     table.shape = "Rectangle";
     table.number = 123;
     table.size = 12.5f;
     table.price = 1500.0f;

     Object chair = new Object();

     chair.name = "Office Chair";
     chair.shape = "Round";
     chair.number = 456;
     chair.size = 8.0f;
     chair.price = 1000.0f;

    Object bed = new Object();
     bed.name = "Bed";
     bed.shape = "Rectangle";
     bed.number = 789;
     bed.size =180.0f;
     bed.price = 1000.0f;
     System.out.println("Table Details:");
     System.out.println("Name: "+table.name+"\n"+"Shape: "+table.shape+"\n"+ "Price:" +table.price+"\n"+"Number: "+table.number+"\n"+"Size: "+table.size+"\n");

    }
}
