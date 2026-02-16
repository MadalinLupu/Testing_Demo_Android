package com.example.testingdemo.logic

// Stockage en mémoire (pas de fichier, pas de disque)
class FakeStorage : Storage {
  private val map = mutableMapOf<String, String>()

  override fun save(key: String, value: String) {
    map[key] = value
  }

  override fun load(key: String): String? {
    return map[key]   // null si la clé n'existe pas
  }
}
