package com.example.memorygame

data class MemoryGameState (

    val cards: Array <Card> = arrayOf(
        Card("1"),
        Card("2"),
        Card("3"),
        Card("4"),
        Card("5"),
        Card("6"),

        Card("7"),
        Card("8"),
        Card("1"),
        Card("2"),
        Card("3"),
        Card("4"),
        Card("5"),
        Card("6"),
        Card("7"),
        Card("8"),
    )

)

 data class Card(
     var value: String,
     var display: String ="?",
     var
 ){
     fun flipCard(){
         display = value

         fun main() {
             val cards = listOf(Card(1), Card(2), Card(3), Card(4), Card(1), Card(2), Card(3), Card(4))
             var flippedCards = mutableListOf<Card>()

             while (flippedCards.size < cards.size) {
                 displayCards(cards)
                 val (index1, index2) = getIndicesToFlip(cards)

                 cards[index1].isFlipped = true
                 cards[index2].isFlipped = true

                 displayCards(cards)

                 if (cards[index1].value == cards[index2].value) {
                     println("Match found!")
                     flippedCards.add(cards[index1])
                     flippedCards.add(cards[index2])
                 } else {
                     println("No match. Flipping cards back.")
                     cards[index1].isFlipped = false
                     cards[index2].isFlipped = false
                 }

                 readLine()
             }

             println("Congratulations! You've matched all the cards.")
         }

         fun displayCards(cards: List<Card) {
             for (card in cards) {
                 if (card.isFlipped) {
                     print("${card.value}  ")
                 } else {
                     print("?  ")
                 }
             }
             println()
