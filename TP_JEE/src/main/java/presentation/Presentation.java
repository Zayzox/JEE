package presentation;


import dao.DaoImpl;
import dao.DaoNSQL;
import metier.MetierImpl;

public class Presentation {

    public static void main (String[] args){

        MetierImpl metier= new MetierImpl();
        //DaoImpl sql=new DaoImpl();
        DaoNSQL nosql = new DaoNSQL();



        //metier.setDao(sql);
        metier.setDao(nosql);

        double resultat = metier.calcul();


        System.out.println("Resultat est:"+ resultat);
    }
}