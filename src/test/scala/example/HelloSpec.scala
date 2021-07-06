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

  "When I order 3 pizzas with 4 standard toppings and the standard toppings are 50p" should "give and order value of £32" in {
    val order = Pizzeria.placeOrder(3, 4)
    order.value shouldBe 32
  }

  "When I order 4 pizzas with 2 standard and 5 premium toppings" should "give and order value of £46" in {
    val order = Pizzeria.placeOrder(4, 2, 5)
    order.value shouldBe 46
  }
}
