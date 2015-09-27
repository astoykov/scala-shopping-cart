package co.uk.alesto.shoppingcart.service
import co.uk.alesto.shoppingcart.domain.{Orange, Apple, Cart, Item}

/**
 * @author Alex
 */

object App{
  def main(args:Array[String]) = {
    
    if (args.length!=1 || Option(args(0)).getOrElse("").isEmpty())
      println("Please provide one argument - a list of shopping items, separated by comma")
    
     
     //Filter out unknown products and instantiate the correct item
     val cartItems:List[Item] = args(0).split(",").filter( x => x match {case "Apple"  => true case "Orange" => true case _ => false}).map(a => a match { case "Apple" => Apple case "Orange" => Orange }).toList
    
     val service = new CheckoutService(){}
    
     println("Total price is " + service.checkoutPrice(new Cart(cartItems)))
  }
}