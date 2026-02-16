package com.example.testingdemo.logic

// Interface pour le stockage de données, un contrat simple.
interface Storage {
  fun save(key: String, value: String)
  fun load(key: String): String?
}

// Gère les messages en utilisant un 'Storage'
class MessageManager(private val storage: Storage) {
  fun sauver(msg: String) {
    storage.save("msg", msg)
  }
  fun charger(): String {
    return storage.load("msg") ?: "vide"
  }
}

/**
 * Calcule les taxes à 14.975%.
 */
fun taxes(total: Double): Double = total * 0.14975

/**
 * Valide si l'âge est entre 1 et 120.
 */
fun ageValide(age: Int): Boolean {
  return age in 1..120
}
