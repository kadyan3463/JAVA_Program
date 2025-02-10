class Details{
    int id=1;
    String name="John Cena";
    String email="johncena1@gmail.com";
}
public class MultipleObject{
    public static void main(String args[]){
        //Create Object using new Keyword
        Details ob = new Details();
        System.out.println(ob.id);
        System.out.println(ob.name);
        System.out.println(ob.email);
        //Create Object using newInstance() Method
        try{
            //Class<?> c = Class.forName("Details");
            Details o = (Details)Class.forName("Details").getDeclaredConstructor().newInstance();
            System.out.println(o.name);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}


