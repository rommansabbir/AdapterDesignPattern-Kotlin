package adapter

/**
 * A simple [Charger] interface which expose only one method to client
 */
interface Charger {
    fun doCharging(message : String)
}