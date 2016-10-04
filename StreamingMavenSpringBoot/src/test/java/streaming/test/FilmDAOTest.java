/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.dao.FilmDAO;

/**
 *
 * @author admin
 */

public class FilmDAOTest {
    
    
    @Autowired
    private FilmDAO dao;
    
    @Test
    public void toutSupprimer(){
        
        dao.deleteAll();
    }
    
    
}
