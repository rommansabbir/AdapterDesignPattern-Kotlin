package adapter

/**
 * Implement [Charger] to [ChargerAdapter]
 * Pass [ExternalCharger] instance via parameter to consume it's service
 * @param externalCharger, [ExternalCharger]
 */
class ChargerAdapter(private val externalCharger: ExternalCharger) : Charger {
    override fun doCharging(message : String) {
        /**
         * Start charging phone with a message
         */
        externalCharger.chargeMyPhone(message)
    }
}