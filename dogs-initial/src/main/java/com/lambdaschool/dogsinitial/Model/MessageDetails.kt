package com.lambdaschool.dogsinitial.Model

import java.io.Serializable

class MessageDetails(var text: String, var priority: Int, var secret: Boolean): Serializable{
    override fun toString(): String {
        return "MessageDetails(text='$text', priority=$priority, secret=$secret)"
    }
}