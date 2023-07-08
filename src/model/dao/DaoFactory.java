package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    //assim nao expomos a implementacao
    //ela retorna o tipo da interface, mas internamente ele realiza uma implementacao
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
