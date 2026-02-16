package com.example.testingdemo.logic

import org.junit.Test
import org.junit.Assert.*

class MessageManagerTest {
  @Test
  fun sauver_puis_charger_retourne_le_message() {
    // Arrange : on injecte un FakeStorage
    val manager = MessageManager(FakeStorage())
    // Act
    manager.sauver("Bonjour")
    // Assert
    assertEquals("Bonjour", manager.charger())
  }

  @Test
  fun charger_sans_sauver_retourne_vide() {
    val manager = MessageManager(FakeStorage())
    assertEquals("vide", manager.charger())
  }
}
