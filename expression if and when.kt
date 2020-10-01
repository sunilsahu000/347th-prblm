fun main(args:Array<String>)
{
    var n1=10
    var n2=20
    var max = if(n1>n2) n1 else n2
    print("Max : $max")


    var number = 19
    var age = when(number) {
       in 1..10 ->println("child")
        in 10..20 ->println("school life")
       in 20..30 ->println("struggle life")
       in 30..40 ->println("Enjoy your life")
        
        else ->println("incorrect nomber")
    }
  
}

   
   
  

    
   
