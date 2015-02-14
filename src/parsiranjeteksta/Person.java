

package parsiranjeteksta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Person {
   private String ime;
   private String prezime;
   private String datum;
   private String mesto;
    
   public Person(String ime, String prezime, String datum, String mesto){
       this.ime=ime;
       this.prezime=prezime;
       this.datum=formatirajDatum(datum);
       this.mesto=mesto;
   }
    
 public String formatirajDatum(String datumRodjenja){
     try{
         DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("ddMMyyyy");
         DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd. MM. yyyy");
         LocalDate datum = LocalDate.parse(datumRodjenja, dtf1);
         return datum.format(dtf2);
     }catch(Exception ex){
         System.out.println(ex.getMessage());
     }
     return datumRodjenja;
 }
    
    public String getIme() {
        return ime;
    }

    
    public String getPrezime() {
        return prezime;
    }

  
    public String getDatum() {
        
           
           
           return datum;
       
    }
 
    public void setDate(String date){
        this.datum=date;
    }
    
    public String getMesto() {
        return mesto;
    }

   @Override
   public String toString(){
   
       StringBuilder sb = new StringBuilder();
       sb.append("Ime: ").append(getIme()+"\n");
       sb.append("Prezime: ").append(getPrezime()+"\n");
       sb.append("Datum rodjenja: ").append(getDatum()+"\n");
       sb.append("Mesto rodjenja: ").append(getMesto()+"\n");
       sb.append("******* *******");
       return sb.toString();
   }
}
