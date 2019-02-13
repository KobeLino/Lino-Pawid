package RPG;

public class Char2 {

    public Char2(){
        Dice d = new Dice();    
        Char keith = new Char("Keith the chupapi ", d.roll(), d.roll(), d.roll());
        Char kobe = new Char("The uncircumcised Kobe ", d.roll(), d.roll(), d.roll());
        
        for(int i = 1; i <= 3; i++){   
            System.out.println("ROUND " + i + "!");
            
            
            System.out.println(keith.getName() + " HP: " + keith.getCurrentLife());
            System.out.println(kobe.getName() + "HP: " + kobe.getCurrentLife());
            
            int jAttack = keith.attack(), mAttack = kobe.attack();
            
           System.out.println(keith.getName() + "attacks " + kobe.getName() + " for " + jAttack + " damage!");
           System.out.println(kobe.getName() + "attacks " + keith.getName() + " for " + mAttack + " damage!");
            
            kobe.wound(jAttack);
            keith.wound(mAttack);
         
           System.out.println(" ");
            if((keith.getCurrentLife() <= 0) && (kobe.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " +keith.getName() + " is: " + keith.getCurrentLife() + "!");
            System.out.print("\nFinal HP of " + kobe.getName() + "is: " + kobe.getCurrentLife() + "!");
                System.out.println(" ");
                System.out.println(kobe.getName() + " wins!" );
                break;
            }
            else if ((kobe.getCurrentLife() <= 0) && (keith.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " + keith.getName() + " is: " + keith.getCurrentLife() + "!");
            System.out.print("\nFinal HP of " + kobe.getName() + " is: " +kobe.getCurrentLife() + "!");
            System.out.println(" ");
                System.out.println(keith.getName() + " wins!");
                break;
            }
            else if((keith.getCurrentLife()<=0) && (kobe.getCurrentLife()<=0) ){
                System.out.print("\nFinal HP of " + keith.getName() + " is: " + keith.getCurrentLife() + "!");
                System.out.print("\nFinal HP of " +kobe.getName() + " is: " + kobe.getCurrentLife() + "!");
                System.out.println(" ");
                System.out.println("Draw!");
                break;
            }
        }
   }

    int getIntelligence() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

}