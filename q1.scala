object q1{

    def main (arges:Array[String]){

        var value=salarycount(40,20);
        println("Final salary : " + value);


    }


   def salarycount(normalH : Int , otH : Int ): Double={

           var salary = normalH * 150 + otH * 75;
           var salaryFinal = salary - salary * 0.1;

         return salaryFinal;

   }

}