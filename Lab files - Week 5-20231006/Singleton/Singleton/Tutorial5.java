
/**
 *
 * @author phaedramohammed
 */
public class Tutorial5 {

    public static void main(String[] args) {
        // TODO code application logic here
        question1();
        
        
    }
    
    public static void question1(){
        for(int requests=1; requests <10; requests++){
            Agent bureau = Agent.Instance();
            System.out.println(bureau.getAgent());  
        }
    }
    
}
