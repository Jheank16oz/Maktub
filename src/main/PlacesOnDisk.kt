package main

class PlacesOnDisk : Places {
    override fun save(place: Place) {
        throw UnsupportedOperationException()
    }

}
