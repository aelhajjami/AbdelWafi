/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import pila.Pila;

/**
 *
 * @author Win10
 */
public class Test {

    public Test() {
    }

    // Comprovar si el valor retorn es 0 o superior
    public void Test() {
        // Iniciar metòde
        pila.Pila pila = new pila.Pila();

        // Comprovar si el valor de retorn es diferent a 0
        assertNotEquals(0, pila.afegir(10));
    }

    public void testtreure1() {

    }

}
