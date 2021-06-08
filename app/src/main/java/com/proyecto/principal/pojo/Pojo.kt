package com.proyecto.principal.pojo

import java.util.*

interface Pojo {
    var id:Double
    var create:Date
    var update:Date
    public fun defaultId()
    public fun create()
    public fun update()
}