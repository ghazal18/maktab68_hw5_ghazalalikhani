import java.util.*
import kotlin.collections.ArrayList

fun main(){
    var arr = arrayListOf("a","b","c","d","e","f","g")
    var numSlice = 3
    slice(arr,numSlice)

}
fun <T> slice(array:ArrayList<T>, numSlice:Int){
    var x = numSlice + 1
    var y = numSlice + 1
    var size = array.size
    var c = size-x

    var sliceArr = arrayListOf<T>()

    while (x < size){
        sliceArr.add(array[x])
        x++
    }

    for (z in 1..c){
        println(array)
        array.removeAt(y)
    }

    print("$array  $sliceArr")


}
