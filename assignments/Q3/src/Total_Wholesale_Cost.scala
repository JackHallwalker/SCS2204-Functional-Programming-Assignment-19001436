object wholesaleCostForBooks extends App {
  val numberOfCopies = 60
  val coverPrice = 24.95
  val discount = 40.0/100.0





  def CalculateCost(numberOfCopies:Int ,coverPrice:Double,discount:Double) = {


    //calculates the sipping cost
    def calculateShippingCost(noOfBooks:Int):Double = {
      if (noOfBooks <= 50) 3.0
      else 3.0 + (0.75 * (noOfBooks - 50))
    }


    //calculates the discount
    def calculateDiscount(coverPrice:Double ,numberOfCopies:Int, discount:Double) = {
      coverPrice * numberOfCopies * discount
    }

    ( (numberOfCopies * coverPrice) - calculateDiscount(coverPrice,numberOfCopies,discount) + calculateShippingCost(numberOfCopies))
  }

  val wholeSaleValue = CalculateCost(numberOfCopies,coverPrice,discount)
  print("The Total Wholesale Cost is  ")
  println(f"$wholeSaleValue%1.2f")
}