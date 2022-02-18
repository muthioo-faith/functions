fun main() {
    greet("faith")
    rem(20, 7)
    add(5,10,40,52)
    likes("football,netball")
}
fun greet(name:String) {
    var name="faith"
 println("hello "+name)
}



fun rem(a:Int,b:Int,){
    var remainter=a/b
    println(remainter)
}

fun add(a:Int,b:Int,c:Int,d:Int){
  var sum=( a+b+c+d)
 println(sum)
}

fun likes(introWords:String){
    var answer=("what is intresting about me"+introWords)
    println(answer)
}
