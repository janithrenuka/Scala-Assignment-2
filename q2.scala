object q2 {

      

    def main (arges:Array[String]){
          
          printf("%nEnter the ticket price: " ) ;
          val ticketPrice = scala.io.StdIn.readInt();
          var attend: Int = finalAttend(ticketPrice: Int);
          printf("Total attend : " + attend);
          var result: Int = profitCount(ticketPrice: Int, attend: Int);
          printf("%nProfit : Rs." + result);
          


    }

    def finalAttend(ticketPrice : Int): Int={

        val keyPrice: Int = 15;
        val keyAttend: Int = 120;
        var value: Int = (keyPrice - ticketPrice)/5;
        var attendVarience: Int = value*20;
        var finalAttend: Int = keyAttend + attendVarience;

        return finalAttend;

    }

    def profitCount(ticketPrice : Int, finalAttend: Int): Int={

          var performCost: Int = 500 + finalAttend*3;

          var profit: Int = ticketPrice*finalAttend - performCost;

          return profit;


    }
  
   

}