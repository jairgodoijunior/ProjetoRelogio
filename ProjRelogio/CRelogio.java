package ProjRelogio; 
 
 
public class CRelogio {
         private static CRelogio Relogio;

    public static void main(String[] args) {

        int  hora, minuto,segundo;
        


       Relogio = new CRelogio();


       Object horario;

       hora = 18;
       minuto = 30;
       segundo = 44;



       horario(); 
   

  
           System.out.println("a hora eh = "+ hora +":"+ minuto +":"+ segundo ); 


       } 
   

   private static void horario() {
   }
} 

