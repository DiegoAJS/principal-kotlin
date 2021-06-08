package com.proyecto.principal.pojo

import java.util.*

class Room(var type:String, var number:Int, var cost:Int, var status:Boolean):Pojo {
    override var id: Double
        get() = this.id
        set(value) {this.id=value}
    override var create: Date
        get() = this.create
        set(value) {this.create=value}
    override var update: Date
        get() = this.update
        set(value) {this.update=value}

    override fun defaultId() {
        this.id=0.0
    }

    override fun create() {
        this.create= Date()
    }

    override fun update() {
        this.update= Date()
    }
}