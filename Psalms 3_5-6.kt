class `Psalms 3_5-6` {
   
    fun trustIn(theLord: God) {
     	with(all(yourHeart)) {
            and(!leanOn(yourUnderstanding))
        }
        
        for (yourWays in ALL_WAYS) {
        	yourWays.submitTo(Him)
        }
        
        God.makesStraight(yourPath)
    }
}






object God {
    fun makesStraight(path: Path) = path.to(Straight())
}
val Him = God

object You

val yourHeart = Heart.FROM(You)
val yourUnderstanding = Understanding.WITHIN(You)
val yourPath = Path.FOR(You)

fun all(heart: Heart) = heart.everyThing

class Heart {
    var everyThing: Boolean = true

    companion object {
        fun FROM(you: You) = Heart() 
    }
}

fun leanOn(understanding: Understanding): Boolean = understanding.reliesOn(You) ?: true

class Understanding() {
    fun reliesOn(something: Any): Boolean? { return true }

    companion object {
        fun WITHIN(you: You) = Understanding()
    }
}

class Way {
    fun submitTo(theLord: God): Path = Path(isStraight = true)
}

val FOREVER = Float.POSITIVE_INFINITY.toInt()
var ALL_WAYS = List(FOREVER) { Way() }

open class Path(var isStraight: Boolean) {
    companion object {
        fun FOR(you: You) = Path(isStraight = false)
    }
}

class Straight: Path(isStraight = true)
