// The goal is to check that type parameter is inserted for the right call.

class SimpleClass<T>(val f: T) {
    fun <U> toList(): List<U> = TODO()
    fun self(): SimpleClass<T> = TODO()

    val one: List<Int> = SimpleClass("one").self().self().toList().<caret>
}

// ELEMENT: asReversed