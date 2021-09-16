class Person{
     int a;
     int b;
     int c;
     void display(){
          System.out.println(a+"\n"+b+"\n"+c);
     }
}

class CollectionPerson{
    public static void main(String []args){
         Person p= new Person();
         p.display();
         System.out.println("hashCode of object is :"+p.hashCode());
    }
}