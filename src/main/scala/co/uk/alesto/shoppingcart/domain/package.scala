package co.uk.alesto.shoppingcart

/**
 * Created by Alex on 27/09/15.
 */
package object domain {

  /**
   * Created by alex on 27/09/15.
   */
  trait Item
  {
  
    def getPrice(): BigDecimal
  }
  
  case object Apple extends Item
  {
    override def getPrice():BigDecimal = BigDecimal(.60D)
  }
  
  case object Orange extends Item
  {
    override def getPrice():BigDecimal = BigDecimal(.25D)
  }

  case class Cart(items: List[Item])

}
