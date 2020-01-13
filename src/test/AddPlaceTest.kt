package test

import main.Place
import main.Places
import main.SavePlace
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify


class AddPlaceTest{

    @Mock
    lateinit var place:Place
    @Mock
    lateinit var places:Places
    lateinit var savePlace: SavePlace

    @Test
    fun addPlace(){

        given_a_place()
        when_save_place_action_execute()
        then_save_action_is_called()
    }

    private fun given_a_place() {
        place = mock(Place::class.java)
        places = mock(Places::class.java)
    }

    private fun when_save_place_action_execute() {
        savePlace = SavePlace(places)
        savePlace.execute(place)
    }

    private fun then_save_action_is_called() {
        verify(places).save(place)
    }


}