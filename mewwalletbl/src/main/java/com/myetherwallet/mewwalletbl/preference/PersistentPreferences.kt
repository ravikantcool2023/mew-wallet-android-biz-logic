package com.myetherwallet.mewwalletbl.preference

import android.content.Context
import com.myetherwallet.mewwalletbl.data.AppCurrency
import com.myetherwallet.mewwalletbl.data.AppLanguage
import com.myetherwallet.mewwalletbl.util.ApplicationUtils
import java.util.*

/**
 * Created by BArtWell on 05.08.2019.
 */

private const val PREFERENCES_NAME = "persistent"
private const val WHATS_NEW_DIALOG_VERSION = "whats_new_dialog_version"
private const val SHOULD_FAIL_SWAPS = "should_fail_swaps"
private const val DISABLE_SWAP_CHECK_BALANCE = "disable_swap_check_balance"
private const val DEBUG_BINANCE_BRIDGE = "debug_binance_bridge"
private const val API_TOTAL_COUNT_PREFIX = "api_total_count_"
private const val API_ERROR_COUNT_PREFIX = "api_error_count_"
private const val APP_LANGUAGE = "app_language"
private const val APP_CURRENCY = "app_currency"
private const val IS_MANUAL_GAS_PRICE_ENABLED = "is_manual_gas_price_enabled"

class PersistentPreferences internal constructor(context: Context) {

    private val preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

    fun shouldShowWhatsNewDialog(versionCode: Int): Boolean {
        val current = preferences.getInt(WHATS_NEW_DIALOG_VERSION, 0)
        preferences.edit().putInt(WHATS_NEW_DIALOG_VERSION, versionCode).apply()
        return current > 0 && current != versionCode
    }

    fun updateTotalRequestCount(apiName: String) = incrementIntValue(API_TOTAL_COUNT_PREFIX + "_" + apiName)

    fun getTotalRequestCount(apiName: String) = preferences.getInt(API_TOTAL_COUNT_PREFIX + "_" + apiName, 0)

    fun updateErrorRequestCount(apiName: String) = incrementIntValue(API_ERROR_COUNT_PREFIX + "_" + apiName)

    fun getErrorRequestCount(apiName: String) = preferences.getInt(API_ERROR_COUNT_PREFIX + "_" + apiName, 0)

    fun setFailSwaps(isEnable: Boolean) = preferences.edit().putBoolean(SHOULD_FAIL_SWAPS, isEnable).apply()

    fun shouldFailSwaps() = preferences.getBoolean(SHOULD_FAIL_SWAPS, false)

    fun setSwapCheckBalanceDisabled(isEnable: Boolean) = preferences.edit().putBoolean(DISABLE_SWAP_CHECK_BALANCE, isEnable).apply()

    fun isSwapCheckBalanceDisabled() = preferences.getBoolean(DISABLE_SWAP_CHECK_BALANCE, false)

    fun setDebugBinanceBridgeEnabled(isEnable: Boolean) = preferences.edit().putBoolean(DEBUG_BINANCE_BRIDGE, isEnable).apply()

    fun isDebugBinanceBridgeEnabled() = preferences.getBoolean(DEBUG_BINANCE_BRIDGE, false)

    fun setManualGasPriceEnabled(isEnabled: Boolean) = preferences.edit().putBoolean(IS_MANUAL_GAS_PRICE_ENABLED, isEnabled).apply()

    fun isManualGasPriceEnabled() = preferences.getBoolean(IS_MANUAL_GAS_PRICE_ENABLED, false)

    private fun incrementIntValue(key: String) {
        val current = preferences.getInt(key, 0)
        preferences.edit().putInt(key, current + 1).apply()
    }

    fun setAppLanguage(appLanguage: AppLanguage) = preferences.edit().putString(APP_LANGUAGE, appLanguage.name).apply()

    fun getAppLanguage() = preferences.getString(APP_LANGUAGE, null)?.let { AppLanguage.valueOf(it) } ?: ApplicationUtils.getSystemLanguage()

    fun setAppCurrency(currency: AppCurrency) = preferences.edit().putString(APP_CURRENCY, currency.name).apply()

    fun getAppCurrency() = preferences.getString(APP_CURRENCY, null)?.let { AppCurrency.valueOf(it) } ?: ApplicationUtils.getCurrency()
}
