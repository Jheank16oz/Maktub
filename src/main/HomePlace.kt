package main

import java.lang.UnsupportedOperationException

class HomePlace : Place {
    override var name: String
        get() = throw UnsupportedOperationException()
        set(value) {}


}
