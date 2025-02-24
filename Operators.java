class Operators{
    public static void main(String args[]){
       //Arithmetic Operators
       int a=10,b=15; 
       System.out.println("Addition : "+(a+b));
       System.out.println("Subtraction : "+(a-b));
       System.out.println("Multiplication : "+(a*b));
       System.out.println("Division : "+(a/b));
       System.out.println("Remainder : "+(a%b));

       //Relational (Comparison) Operators
       System.out.println("\n");
       System.out.println("Equal to : "+(a==b));
       System.out.println("Not equal to : "+(a!=b));
       System.out.println("Greater than : "+(a>b));
       System.out.println("Less than : "+(a<b));
       System.out.println("Greater than or equal to : "+(a>=b));
       System.out.println("Less than or equal to : "+(a<=b));

       //Logical Operators
       System.out.println("Returns true if both conditions are true AND: "+(a<b && b>a));
       System.out.println("OR(`) of : "+(a<b || b<a));
       System.out.println("Reverses the logical state(~) NOT of a and b "+(~a)+" "+(~b));
        
       //Bitwise Operator
       System.out.println("Bitwise AND : "+(a&b));
       System.out.println("Bitwise XOR : "+(a^b));
       System.out.println("Bitwise Complement : "+(~a));
       System.out.println("Left Shift : "+(a<<1));
       System.out.println("Right Shift : "+(b>>2));

       //Unary Operator
       System.out.println("Post Increment (adds 1) : "+(a++));//10
       System.out.println("Post Decrement (subtracts 1) : "+(a--));//11
       System.out.println("Pre Increment : "+(++a));//11
       System.out.println("Pre Decrement : "+(--a));//10

       //Ternary Operator
       System.out.println("Ternary Operator or if-else-condition  : "+((a<b)?"a b se Chota hai" : "a b se Bada hai"));


    }
}