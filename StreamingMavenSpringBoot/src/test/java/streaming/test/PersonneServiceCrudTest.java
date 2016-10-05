/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Personne;
import streaming.service.PersonneServiceCRUD;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class PersonneServiceCrudTest {

    @Autowired
    private PersonneServiceCRUD dao;

    @Before
    public void avant() {

        dao.deleteAll();

        Personne p = new Personne();

        p.setNom("Morgan");
        p.setPrenom("Clara");
        dao.save(p);
 
        p = new Personne();
        p.setNom("Marie");
        p.setPrenom("Phoenix");
        dao.save(p);

    }

    @Test
    public void cherchePersonne() {

        dao.findAllByprenomAndNom("Clara", "Morgan");
     
    }

    
    public void test (){
        
        Assert.assertNotNull(dao.findOneByPrenomAndNom("Clara", "Morgan"));
        
        
        
        
    }
    
    
    
    
    
    
    
    @Test
    public void ajouter() {

        dao.save(new Personne());

    }

}
