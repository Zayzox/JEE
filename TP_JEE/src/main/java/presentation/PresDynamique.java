package presentation;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;



public class PresDynamique {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("src/config.txt"));

        String dao = sc.nextLine();
        Class clsDao = Class.forName(dao);
        IDao objDao = (IDao)clsDao.newInstance();

        String metier = sc.nextLine();
        Class clsMetier = Class.forName(metier);
        IMetier objMetier = (IMetier)clsMetier.newInstance();

        Method method = clsMetier.getMethod("setDao",IDao.class);
        method.invoke(objMetier,objDao);

        System.out.println(objMetier.calcul());

    }
}
