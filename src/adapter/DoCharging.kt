package adapter

/**
 * This class expose only one method to user to charge his/her phone
 * Pass any [Charger] instance to start charge with a message
 * @param charger, [Charger] instance
 */
class DoCharging(private val charger : Charger) {
    /**
     * This method handle start charging your phone
     * @param message, [String]
     */
    fun doCharging(message : String){
        charger.doCharging(message)
    }
}