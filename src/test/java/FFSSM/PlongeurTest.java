/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FFSSM;

import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cecil
 */
public class PlongeurTest {
    private Plongeur p1, p2;
    private Moniteur m1;
    private Club c1;
    private Licence l1, l2;
    private LocalDate delivrance1, delivrance2;
    
    @BeforeEach
    public void setUp() {
        //Création plongeur  
        p1 = new Plongeur("1A", "Bastide", "Rémi", "Castres", "0694843920", LocalDate.of(1965, Month.MARCH, 2), 4);
        p2 = new Plongeur("2A", "Laborde", "Eric", "Castres", "0656789201", LocalDate.of(1970, Month.MARCH, 26), 4);
        //Création moniteur 
        m1 = new Moniteur("1A", "Bastide", "Rémi", "Castres", "06948467808", LocalDate.of(1980, Month.APRIL, 14), 4, 123);
        //Création club 
        c1 = new Club(m1, "CLubPlongee", "0687956434"); 
        //On crée la date de délivrance
    //    delivrance1 = LocalDate.of(2018, Month.AUGUST, 1);
      //  delivrance2 = LocalDate.of(2020, Month.MARCH, 1);
        //Création licences de test
       // l1 = new Licence(p1, "1AB", delivrance1, 4, c1 );
        //l2 = new Licence(p2, "1AA", delivrance2, 4, c1);
    }

    /**
     * Test of ajouteLicence method, of class Plongeur.
     */
    @Test
    public void testAjouteLicence() {
         assertTrue(p1.licences.isEmpty());
         p1.ajouteLicence("1", LocalDate.now(), c1);
         assertFalse(p1.licences.isEmpty());
    }
    
}
