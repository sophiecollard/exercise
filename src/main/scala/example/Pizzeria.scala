package example

object Pizzeria {
  def placeOrder(
      numberOfPizzas: Int,
      numberOfStandardToppings: Int = 0,
      numberOfPremiumToppings: Int = 0
  ): Order =
    Order(
      numberOfPizzas,
      value = (numberOfPizzas) * pricePerPizza + (numberOfStandardToppings)
        * standardToppingPrice + numberOfPremiumToppings * premiumToppingPrice
    )

  private val pricePerPizza: BigDecimal = 10
  private val standardToppingPrice: BigDecimal = 0.5
  private val premiumToppingPrice: BigDecimal = 1

}
