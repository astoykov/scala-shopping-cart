package co.uk.alesto.shoppingcart.service

import co.uk.alesto.shoppingcart.domain.{Orange, Apple, Cart, Item}

/**
 * Created by Alex on 27/09/15.
 */
trait CheckoutService {

  def checkoutPrice(cart: Cart): BigDecimal = {
    cart.getCheckoutPrice()
  }

}

}
