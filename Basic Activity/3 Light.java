class Lamp{
    private boolean glow;
    private String type;
    Lamp(String a){
     type=a;
    }
    public void switchOff(){
       glow=false;
       System.out.println(type+" "+"is turned OFF");
    }
    public void switchOn(){
       glow=true;
       System.out.println(type+" "+"is turned ON");
    } 

}


public class  Light {
    public static void main(String []args){
       Lamp halogen=new Lamp("halogen");
       Lamp led=new Lamp("led");
       halogen.switchOff(); 
       led.switchOn();     
    }
}
