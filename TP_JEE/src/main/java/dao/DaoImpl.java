package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao{
    @Override
    public double getData(){

        System.out.println("FROM SQL TO DB");
        return(7);
    }


}