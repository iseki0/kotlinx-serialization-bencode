package space.iseki.bencoding

internal actual fun bytes2Long(bytes: ByteArray, off: Int, len: Int): Long =
    bytes.copyOfRange(off, off + len).decodeToString().toLong()

internal actual fun bytes2StringIso88591(bytes: ByteArray, off: Int, len: Int): String {
    return js("new TextDecoder('windows-1252').decode(bytes.slice(off, off + len))")
}