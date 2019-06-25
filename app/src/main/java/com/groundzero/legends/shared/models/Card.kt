package com.groundzero.legends.shared.models

data class Cards(var cards: List<Card>)

data class Card(
    var id: String,
    var name: String,
    var rarity: String,
    var type: String,
    var cost: Int,
    var power: Int,
    var health: Int,
    var soulSummon: Int,
    var soulTrap: Int,
    var imageUrl: String
)
