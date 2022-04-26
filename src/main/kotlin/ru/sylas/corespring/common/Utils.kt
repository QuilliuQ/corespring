package ru.sylas.corespring.common

import java.security.MessageDigest


fun String.sha256():String{
    return hashString(this)
}

private fun hashString(input: String): String {
    return MessageDigest
        .getInstance("SHA-256")
        .digest(input.toByteArray())
        .fold("") { str, it -> str + "%02x".format(it) }
}