class Exx extends Exception{
    
    public Exx(){
    }
    
}

class Callme{
    static int count = 0; 
    Callme(){
        count++;
        if(count==3){
            try{
                throw new Exx() ;
            }
            catch(Exx e){
                System.out.println("out bond") ; 
            }
             
        }
    }
}



public class Main
{
	public static void main(String[] args) {
		
		Callme a = new Callme() ;
		Callme a1 = new Callme() ;
		Callme a2 = new Callme() ;
		
	}
}
