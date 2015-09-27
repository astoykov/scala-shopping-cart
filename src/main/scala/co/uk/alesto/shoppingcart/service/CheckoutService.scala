package co.uk.alesto.shoppingcart.service

import co.uk.alesto.shoppingcart.domain.{Orange, Apple, Cart, Item}

/**
 * Created by Alex on 27/09/15.
 */
trait CheckoutService {

  def checkoutPrice(cart: Cart): BigDecimal = {

    //group by item and count
    val countItems = cart.items.groupBy(w => w).mapValues(_.size)
    
    //sum up all prices by groups
    countItems.map(x => offerPrice(x._1, x._2)).sum
    
  }
  
  def offerPrice(item: Item, units: Int): BigDecimal = item match {
    //Buy one get one free for apples
    case Apple => item.getPrice() * (units/2 + units%2)
    // Get 3 for 2 for oranges
    case Orange => item.getPrice() * (units/3*2 + units%3)
  }

}
