class ConditionCheck{
    public static void main(String args[]){
        int a=5,b=10,c=-6;
        System.out.println(a>b && a<c); //false
        System.out.println(a<b && a>c); //true
        System.out.println(a==b || b>a); //true
        System.out.println(b>15 && c<0 || a>0); //false
        System.out.println((a/2.0==0.0 && b/2.0!=0.0) || c<0.0); //true
    }
}