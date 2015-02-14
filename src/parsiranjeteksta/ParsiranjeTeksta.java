
package parsiranjeteksta;

import java.util.ArrayList;


public class ParsiranjeTeksta {

    
    public static void main(String[] args){
      String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";

      String[] usrArray = text.split("[ ./]");
      
      for(int i=0; i<usrArray.length; i+= 4){
          String ime = usrArray[i];
          String prezime = usrArray[i+1];
          String datRodjenja = usrArray[i+2];
          String mestoRodjenja = usrArray[i+3];
      }
      
                Person person1 = new Person(usrArray[0], usrArray[1], usrArray[2], usrArray[3]);
                Person person2 = new Person(usrArray[4], usrArray[5], usrArray[6], usrArray[7]);
                Person person3 = new Person(usrArray[8], usrArray[9], usrArray[10], usrArray[11]);
                
                ArrayList list = new ArrayList();
                list.add(person1);
                list.add(person2);
                list.add(person3);
                
                for(int j=0; j<list.size(); j++){
                    System.out.println(list.get(j));
                }
    }
    }
    

