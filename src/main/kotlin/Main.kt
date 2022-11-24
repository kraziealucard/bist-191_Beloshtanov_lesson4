fun main(args: Array<String>) {

    /*
       Сложная
       Разложить заданное натуральное число n > 1 на простые множители.
       Результат разложения вернуть в виде строки, например 75 -> 3*5*5
       Множители в результирующей строке должны располагаться по возрастанию.
    */

    val input:Int=userInput();
    print( toDo(input) );
}

fun toDo(input: Int):String
{
    var inp:Int=input
    var res:String="$input = 1"
    var div:Int=2
    while (inp>1)
    {
        while (inp % div == 0)
        {
            res+=(" * $div");
            inp/=div
        }
        div++
    }
    return res;
}

fun userInput():Int
{
    var input:String
    var number:Int=0
    while (number<=1)
    {
        print("Введите число: ");
        input= readln()
        when(isNumber(input))
        {
            true->number=input.toInt()
            false->continue
        }
    }
    return number
}

fun isNumber(s: String?): Boolean {
    return if (s.isNullOrEmpty()) false else s.all { Character.isDigit(it) }
}