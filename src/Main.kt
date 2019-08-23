import adapter.ChargerAdapter
import adapter.DoCharging
import adapter.ExternalCharger

class Main {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            DoCharging(ChargerAdapter(ExternalCharger())).doCharging("The phone is charging")
        }
    }


}