package com.example.signaturecapture.utils

class ControlTimedPoints {
    lateinit var c1: TimedPoint
    lateinit var c2: TimedPoint
    operator fun set(c1: TimedPoint, c2: TimedPoint): ControlTimedPoints {
        this.c1 = c1
        this.c2 = c2
        return this
    }
}