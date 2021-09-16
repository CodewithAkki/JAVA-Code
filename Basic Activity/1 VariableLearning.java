class Vars{
static int a; //static variable
String str;
Vars(){
a=13; //assigned value to static variable
/* value assigned to instance varable */
str="***This program is about types of variable in java***";
    }
}

class VariableLearning {
    public static void main(String args[]){
    int local=12; //local variable 
    Vars v=new Vars(); 
    /* displaying variables*/
    System.out.println(v.str+"\nLocal Varial Value:\t"+local+"\nStatic Variable Value\t"+v.a);    
    }
}
