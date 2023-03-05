import java.util.ArrayList;
public class UFC implements Subject {   //subject.
    
    /*An app to notify ESPN fans the winner of a fight.*/
    ArrayList < Observer > subscribers;
    public UFC(int event){
        System.out.println("Welcome to UFC " + event);   //card has been made.
        subscribers = new ArrayList<Observer>();
    }

    public void attack(Attack attackType){
        attackType.performAttack();
        if(attackType instanceof Knockout){
            notifyObservers();
        }
    }

    public String declareWinner(){
        return "jon jones";
    }

    public void subscribe(Observer o){
        subscribers.add(o);
    }
    public void unSubscribe(Observer o){
        subscribers.remove(o);
    }
    public void notifyObservers(){
        for(Observer sub : subscribers){
            sub.update(declareWinner());
        }
    }





}
