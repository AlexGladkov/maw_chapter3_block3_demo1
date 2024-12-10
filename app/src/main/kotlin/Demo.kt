import com.arkivanov.decompose.router.slot.ChildSlot

class Demo {

    fun test() {
        val slot = ChildSlot<String, String>()
        val child = slot.child
    }
}