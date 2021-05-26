package com.myetherwallet.mewwalletbl.data.database

import android.os.Parcelable
import androidx.room.Ignore
import com.myetherwallet.mewwalletbl.MewEnvironment
import com.myetherwallet.mewwalletbl.data.AppCurrency
import com.myetherwallet.mewwalletbl.data.api.TransactionStatus
import com.myetherwallet.mewwalletkit.bip.bip44.Address
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal
import java.math.BigInteger
import java.util.*

@Parcelize
data class TransactionInfo(
    val hash: String,
    val address: Address,
    val fromRecipient: Address,
    val toRecipient: Address,
    val amount: BigDecimal,
    val status: TransactionStatus,
    val timestamp: Date,
    val tokenName: String,
    val symbol: String,
    val logo: String?,
    val contract: Address,
    val price: BigDecimal?,
    val nonce: BigInteger?,
    @Ignore
    var currency: AppCurrency = AppCurrency.USD,
    @Ignore
    var exchangeRate: BigDecimal = BigDecimal.ONE
) : Parcelable {

    constructor(
        hash: String,
        address: Address,
        fromRecipient: Address,
        toRecipient: Address,
        amount: BigDecimal,
        status: TransactionStatus,
        timestamp: Date,
        tokenName: String,
        symbol: String,
        logo: String?,
        contract: Address,
        price: BigDecimal?,
        nonce: BigInteger?
    ) : this(hash, address, fromRecipient, toRecipient, amount, status, timestamp, tokenName, symbol, logo, contract, price, nonce, AppCurrency.USD, BigDecimal.ONE)

    fun getUrl() = if (MewEnvironment.current == MewEnvironment.Type.ROPSTEN) {
        "https://ropsten.etherscan.io/tx/$hash"
    } else {
        "https://etherscan.io/tx/$hash"
    }
}
