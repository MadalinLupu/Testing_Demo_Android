package com.example.testingdemo.logic

import org.junit.Test
import org.junit.Assert.*

class LogicValidationTest {
    @Test
    fun taxes_0_donne_0() {
        assertEquals(0.0, taxes(0.0), 0.0001)
    }

    @Test
    fun taxes_100_donne_14_975() {
        // Un test simple pour la fonction de taxes.
        assertEquals(14.975, taxes(100.0), 0.0001)
    }

    @Test
    fun age_25_est_valide() {
        assertTrue(ageValide(25))
    }
    @Test
    fun age_0_est_invalide() {
        assertFalse(ageValide(0))
    }
    @Test
    fun age_121_est_invalide() {
        // On teste les cas limites.
        assertFalse(ageValide(121))
    }
    @Test
    fun age_negatif_est_invalide() {
        assertFalse(ageValide(-5))
    }
}
