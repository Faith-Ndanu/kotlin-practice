//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
Diameter()

    var x= multiply(8, 500)
    println(x)

    getStringLength("Air Freshener")
}

fun Diameter() {
    var radius = 14
    var pi = 3.142
    var result = radius * pi
    println(result)
}

fun multiply(num1: Int, num2: Int): Int{
    var result = num1 * num2
    return result
}
fun getStringLength(word:String):Int {
    return word.length
}


