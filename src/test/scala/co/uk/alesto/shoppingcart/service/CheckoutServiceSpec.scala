package co.uk.alesto.shoppingcart.service

import co.uk.alesto.shoppingcart.domain.{Orange, Apple, Cart}
import org.scalatest._

/**
 * Created by Alsto on 27/09/15.
 */
class CheckoutServiceSpec extends FlatSpec with CheckoutService with Matchers  {

  "The service" should "return 0 if nothing in the cart" in {
    val cart = Cart(List())

    checkoutPrice(cart) should be (0)
  }

  it should "return 1.20 for two apples" in {
    val cart = Cart(List(Apple,Apple))

    checkoutPrice(cart) should be (1.20)
  }

  it should "return 2.05 for 3 apples and one orange" in {
    val cart = Cart(List(Apple, Apple, Orange, Apple))

    checkoutPrice(cart) should be (2.05)
  }

  it should "return 0.50 for 2 oranges" in {
    val cart = Cart(List(Orange, Orange))

    checkoutPrice(cart) should be (.5)
  }

  it should "return 0.75 for 3 oranges" in {
    val cart = Cart(List(Orange, Orange, Orange))

    checkoutPrice(cart) should be (.75)
  }

  it should "return 1.75 for 7 oranges" in {
    val cart = Cart(List(Orange, Orange, Orange, Orange, Orange, Orange, Orange))

    checkoutPrice(cart) should be (1.75)
  }

  it should "return 3.05 for 5 oranges and 3 apples" in {
    val cart = Cart(List(Orange, Orange, Orange, Orange, Orange, Apple, Apple, Apple))

    checkoutPrice(cart) should be (3.05)
  }
}
