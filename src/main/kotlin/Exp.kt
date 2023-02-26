
import java.util.Collections
import java.util.stream.Collector

//Added second commit by monish

//Julin committing again
//Julin commiting second time
import java.util.stream.Collectors
import kotlin.streams.toList

fun main() {
    val p1 = Person(1, "A","Student")
    val p2 = Person(2, "B","Student")
//    val opt1 = Option((0..1000).random())
//    val opt2 = Option((0..1000).random())


    val arr = listOf(
        p1,
        p2
//        listOf(p1,p2,opt3),
//        listOf(p2,p1,opt4)
    )

//    val newOne:List<Person> = listOf()

//    val distinctNames = arr.flatten().mapNotNull {
//        when(it) {
//            is Person -> it.name
//            else -> null
//        }
//    }.distinct()
    val distinctNames =arr.stream().distinct().collect(Collectors.toList())
        arr.distinctBy { it.name }.stream().toList()
    val names:ArrayList<String> = arrayListOf(distinctNames)
//        names.addAll(distinctNames)
    println(names)
    println(distinctNames)
    val original: List<Int> = listOf(1, 2, 3, 4, 5);

    val copy: List<Int> = original

    println(copy)
}

class Person (
    var id:Int,
    var name:String,
    var type:String


)

//class Option (
//    var level:Int
//)



//        fun parameterizedNewInstance(funnelList: ArrayList<String>): FunnelFilterFragment {
//            val fragment = FunnelFilterFragment(funnelList)
//            return fragment
//        }

//        FunnelFilterFragment.parameterizedNewInstance(funnelList as ArrayList<String>)

//    constructor(funnelList: ArrayList<String>) : this() {
//        this.funnelList = funnelList
//    }

//var funnelList = counsellorList.map { it.funnelCode }.distinct()
//FunnelFilterFragment.newInstance(funnelList as ArrayList<String>)


//fun newInstance(
//    counsellorList: ArrayList<CounsellorFromResponse>
//): FunnelFilterFragment {
//    var filteredFunnelList = counsellorList.map { it.funnelCode }.distinct()
////            FunnelFilterFragment.newInstance(funnelList as ArrayList<String>)
//    return FunnelFilterFragment(filteredFunnelList as ArrayList<String>)
//        .apply {
//            this.funnelList.addAll(filteredFunnelList as ArrayList<String>)
//        }
//}