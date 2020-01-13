package main

class SavePlace(val placesOnDisk: Places) {

    fun execute(place: Place) {
        placesOnDisk.save(place)
    }

}
