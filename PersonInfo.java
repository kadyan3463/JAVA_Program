class Information{
    int id;
    String name;
    String mail;
    Information(int id,String name,String mail){
        this.id=id;
        this.name=name;
        this.mail=mail;
    }
    public void displayInformation(){
        System.out.println("ID: "+id+" Name: "+name+" Mail: "+mail);
    }
}
public class PersonInfo {
    public static void main(String args[]){
        //System.out.println("Hello World!");
        Information[] persons={new Information(1,"A","A@gmail.com"),
        new Information(2,"B","B@gmail.com"),
        new Information(3,"C","C@gmail.com"),
        new Information(4,"D","D@gmail.com"),
        new Information(5,"E","E@gmail.com"),
        };
        for(Information p:persons){
            p.displayInformation();
        }
    }
}
