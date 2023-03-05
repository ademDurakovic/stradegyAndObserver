public class ESPN implements Observer{

    public ESPN(Subject UFC){
        UFC.subscribe(this);  //now listens to UFC
    }
    
    public void update(String winner){
        System.out.println("ESPN NOTIFICATION");
        System.out.println("NEW HEAVYWEIGHT TITLE GOES TO: " + winner);
        
    }

}
