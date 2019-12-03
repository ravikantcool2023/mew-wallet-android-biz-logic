package com.myetherwallet.mewwalletbl.data

import com.myetherwallet.mewwalletkit.core.extension.addHexPrefix
import com.myetherwallet.mewwalletkit.core.extension.toBigInteger
import com.myetherwallet.mewwalletkit.core.extension.toHexString
import java.math.BigInteger
import java.util.*

/**
 * Created by BArtWell on 30.07.2019.
 */

data class TransactionData(
    val function: String,
    val address: String,
    val amount: BigInteger
) {

    companion object {
        const val FUNCTION_TOKEN_TRANSFER = "0xa9059cbb"

        fun create(data: ByteArray): TransactionData? {
            return if (data.size == 69) {
                TransactionData(
                    data.copyOfRange(0, 5).toHexString().toLowerCase(Locale.US).addHexPrefix(),
                    data.copyOfRange(17, 37).toHexString().toLowerCase(Locale.US).addHexPrefix(),
                    data.copyOfRange(37, 69).toBigInteger()
                )
            } else {
                null
            }
        }
    }
}