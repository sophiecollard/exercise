package example

object Pizzeria {
  def placeOrder(
    numberOfPizzas: Int
  ): Order =
    Order(
      numberOfPizzas,
      value = numberOfPizzas * pricePerPizza
    )

  private val pricePerPizza: Int = 10
}
