package co.com.polloshermanos.persistence.main;

import co.com.polloshermanos.persistence.dao.PersistenceDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Usuario
 */
public class ReflectionORM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersistenceDAO dao = new PersistenceDAO();
        dao.executeExcersice();
    }
    
}
