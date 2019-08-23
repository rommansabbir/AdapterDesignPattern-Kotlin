package adapter

/**
 * This is an external charger class
 * which expose only one method [chargeMyPhone]
 */
class ExternalCharger {
    /**
     * This external charger method handle charging phone with a message
     */
    fun chargeMyPhone(message : String){
        println(message)
    }
}