// "Add non-null asserted (!!) call" "true"

infix fun Int.bar(i: Int) = this

fun foo(i: Int?) {
    i <caret>bar 1
}