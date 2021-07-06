package example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "When I order 3 pizzas" should "confirm the number of pizzas I ordered" in {
    val order = Pizzeria.placeOrder(3)
    order.pizzaCount shouldBe 3
  }

  "When I order 3 pizzas and the price per pizza is £10" should "the total order value should be £30" in {
    val order = Pizzeria.placeOrder(3)
    order.value shouldBe 30
  }
}
