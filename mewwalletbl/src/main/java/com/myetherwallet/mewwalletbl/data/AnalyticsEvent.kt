package com.myetherwallet.mewwalletbl.data

import java.util.*

data class AnalyticsEvent internal constructor(
    val id: String,
    val timestamp: Date
) {

    constructor(id: Id, timestamp: Date = Date()) : this(id.value, timestamp)

    enum class Id(val value: String) {
        MAIN_ADD_ACCOUNT_CLICKED("Android-Main-AddAccount-clicked"),
        MAIN_RECEIVE_BIG_CLICKED("Android-Main-Receive-big-clicked"),
        MAIN_BUY_BIG_CLICKED("Android-Main-Buy-big-clicked"),
        MAIN_GUIDE_CLICKED("Android-Main-WhatIsEthereum-clicked"),
        MAIN_KEY_CORRUPTED("Android-KeyCorrupted-Authorization"),
        GENERATING_KEY_CORRUPTED_POPUP_SHOWN("Android-KeyCorrupted-CreateWallet-Popup-shown"),
        GENERATING_KEY_INVALID_MNEMONIC("Android-CreateWallet-MnemonicCheckout-failed"),
        MAIN_KEY_RESTORED("Android-KeyRestored"),
        MAIN_KEY_CORRUPTED_POPUP_SHOWN("Android-KeyCorrupted-Authorization-Popup-shown"),
        ACCOUNT_DETAILS_RECEIVE_CLICKED("Android-AccountDetails-Receive-clicked"),
        ACCOUNT_DETAILS_BUY_CLICKED("Android-AccountDetails-Buy-clicked"),
        ACCOUNT_DETAILS_TOKEN_INFO_SWAP_CLICKED("Android-AccountDetails-TokenPopupSwap-clicked"),
        ADD_ACCOUNT_ADD_CLICKED("Android-AddAccount-Add-clicked"),
        LINK_POPUP_SHOWN("Android-LinkPopup-shown"),
        LINK_POPUP_LINK_CLICKED("Android-LinkPopup-Link-clicked"),
        LINK_POPUP_IMPORT_MEWCONNECT_CLICKED("Android-LinkPopup-ImportMEWconnect-clicked"),
        LINK_POPUP_FRESH_WALLET_CLICKED("Android-LinkPopup-FreshWallet-clicked"),
        MEWCONNECT_POPUP_SHOWN("Android-MEWconnectPopup-shown"),
        MEWCONNECT_POPUP_IMPORT_CLICKED("Android-MEWconnectPopup-import-clicked"),
        MEWCONNECT_POPUP_IMPORT_SUCCESS("Android-MEWconnectPopup-import-success"),
        MEWCONNECT_POPUP_FRESHWALLET_CLICKED("Android-MEWconnectPopup-FreshWallet-clicked"),
        RATER_SHOWN("Android-Rater-Shown"),
        RATER_FEEDBACK_CLICKED("Android-Rater-Feedback-clicked"),
        RATER_RATE_CLICKED("Android-Rater-Rate-clicked"),
        RATER_CLOSED("Android-Rater-closed"),
        CAMERA_VALID_MEWCONNECT_QR("Android-camera-valid-mewconnect-QRcode-scanned"),
        CAMERA_VALID_ADDRESS_QR("Android-camera-valid-eth-address-QRcode-scanned"),
        CAMERA_INVALID_QR("Android-camera-invalid-QRcode-scanned"),
        CAMERA_VALID_QR_CONNECTION_FAILED("Android-camera-valid-mewconnect-QRcode-scanned-connection-failed"),
        CAMERA_VALID_QR_CONNECTION_SUCCESS("Android-camera-valid-mewconnect-QRcode-scanned-connection-success"),
        CAMERA_VALID_QR_CONNECTING("Android-camera-valid-mewconnect-QRcode-scanned-connecting"),
        EXCHANGE_SWAP_CLICKED("Android-ExchangeScreen-Swap-clicked"),
        EXCHANGE_BUY_ETH_CLICKED("Android-ExchangeScreen-BuyEth-clicked"),
        EXCHANGE_MARKET_TOKEN_CLICKED("Android-ExchangeScreen-TokenMarket-clicked"),
        EXCHANGE_TOKEN_INFO_SWAP_CLICKED("Android-ExchangeScreen-TokenPopupSwap-clicked"),
        SWAP_SHOWN("Android-Swap-MainScreen-shown"),
        SWAP_LOW_LIQUIDITY("Android-Swap-MainScreen-LowLiquidity-shown"),
        SWAP_MAX_CLICKED("Android-Swap-SwapTokensScreen-Max-clicked"),
        SWAP_FIRST_TOKEN_CLICKED("Android-Swap-MainScreen-FirstFieldToken-clicked"),
        SWAP_SECOND_TOKEN_CLICKED("Android-Swap-MainScreen-SecondFieldToken-clicked"),
        SWAP_WANTED_TOKEN_SHOWN("Android-Swap-MainScreen-TokenYouWantToGetScreen-shown"),
        SWAP_WANTED_TOKEN_SEARCH_CLICKED("Android-Swap-MainScreen-TokenYouWantToGetScreen-SearchIcon-clicked"),
        SWAP_WANTED_TOKEN_CLICKED("Android-Swap-MainScreen-TokenYouWantToGetScreen-Token-clicked"),
        SWAP_FIND_BEST_RATE_CLICKED("Android-Swap-MainScreen-FindBestRate-clicked"),
        SWAP_PROVIDER_SHOWN("Android-Swap-SelectProviderScreen-shown"),
        SWAP_PROVIDER_SELECTED("Android-Swap-SelectProviderScreen-provider-selected"),
        SWAP_VERIFY_SHOWN("Swap-VerifySwapScreen-shown"),
        SWAP_VERIFY_PROCEED_SWAP("Android-Swap-VerifySwapScreen-ProceedWithSwap-clicked"),
        SWAP_INITIATED_SHOWN("Android-Swap-SwapInitiatedPopup-shown"),
        SWAP_SUCCESS_EXECUTED("Android-Swap-successfully-executed"),
        PUSH_NOTIFICATION_RECEIVED("Android-broadcast-push-notification-received"),
        COMIC_MAIN_CLICKED("Android-Main-Comic-banner-clicked"),
        COMIC_EDUCATION_CLICKED("Android-Education-center-Comic-banner-clicked"),
        COMIC_SHARE("Android-Comic-Share-clicked"),
        CORRUPTED_KEYS_REPORT("Android-Corrupted-Keys-Report"),
        APPLICATION_LAUNCHED_WITH_SAMSUNG_STORAGE("Android-App-launchedWithSamsungStorage"),
        APPLICATION_LAUNCHED_WITH_MEW_STORAGE("Android-App-launchedWithMewStorage"),

        MAIN_TRANSACTION_CLICKED("Android-Main-transaction-Clicked"),
        ACCOUNT_DETAILS_TRANSACTION_CLICKED("Android-AccountDetails-transaction-history-Clicked"),
        TRANSACTION_DETAILS_SHOWN("Android-TransactionDetailsScreen-Shown"),
        TRANSACTION_DETAILS_SPEEDUP_CLICKED("Android-TransactionDetailsScreen-SpeedUp-Clicked"),
        TRANSACTION_DETAILS_CANCEL_CLICKED("Android-TransactionDetailsScreen-Cancel-Clicked"),
        SPEEDUP_UPDATE_CLICKED("Android-SpeedUpScreen-UpdateTransaction-Clicked"),
        CANCEL_TRANSACTION_ATTEMPT_CLICKED("Android-CancelTransactionScreen-AttemptToCancel-Clicked"),
        SPEEDUP_TRANSACTION_SUCCESS_UPDATED("Android-SpeedUpTransaction-SuccessfullyUpdated"),
        CANCEL_TRANSACTION_SUCCESS_REPLACED("Android-CancelTransaction-SuccessfullyReplaced"),

        EARN_MAINSCREEN_SHOWN("Android-EARN-MainScreen-Shown"),
        EARN_MAINSCREEN_ETH2BANNER_CLICKED("Android-EARN-MainScreen-Eth2Banner-Clicked"),
        EARN_ETH2_INFOSCREEN_MOREABOUTRISKS_CLICKED("Android-EARN-Eth2-InfoScreen-MoreAboutRisks-Clicked"),
        EARN_ETH2_INFOSCREEN_STARTSTAKING_CLICKED("Android-EARN-Eth2-InfoScreen-StartStaking-Clicked"),
        EARN_ETH2_STAKEONETH2SCREEN_SHOWN("Android-EARN-Eth2-StakeOnEth2Screen-Shown"),
        EARN_ETH2_STAKEONETH2SCREEN_ENABLESTAKING_CLICKED("Android-EARN-Eth2-StakeOnEth2Screen-EnableStaking-Clicked"),
        EARN_ETH2_STAKEONETH2SCREEN_STAKEETH_CLICKED("Android-EARN-Eth2-StakeOnEth2Screen-StakeETH-Clicked"),
        EARN_ETH2_STAKEONETH2SCREEN_INPUTFIELD_CLICKED("Android-EARN-Eth2-StakeOnEth2Screen-InputField-Clicked"),
        EARN_ETH2_STAKEONETH2SCREEN_READYTOSTAKE_SHOWN("Android-EARN-Eth2-StakeOnEth2Screen-ReadyToStake-Shown"),
        EARN_ETH2_STAKEONETH2SCREEN_BUYETHER_CLICKED("Android-EARN-Eth2-StakeOnEth2Screen-BuyEther-Clicked"),
        EARN_ETH2_STAKEONETH2SCREEN_SWAP_CLICKED("Android-EARN-Eth2-StakeOnEth2Screen-Swap-Clicked"),
        EARN_ETH2_STAKINGFEEOVERLAY_SHOWN("Android-EARN-Eth2-StakingFeeOverlay-Shown"),
        EARN_ETH2_ONEWAYDISCLAIMER_SHOWN("Android-EARN-Eth2-OneWayDisclaimer-Shown"),
        EARN_ETH2_ONEWAYDISCLAIMER_CONFIRMCLICKED("Android-EARN-Eth2-OneWayDisclaimer-ConfirmClicked"),
        EARN_ETH2_ONEWAYDISCLAIMER_CANCELCLICKED("Android-EARN-Eth2-OneWayDisclaimer-CancelClicked"),
        EARN_ETH2_VERIFYSCREEN_CONFIRMANDSTAKE_CLICKED("Android-EARN-Eth2-VerifyScreen-ConfirmAndStake-Clicked"),
        EARN_ETH2_VERIFYSCREEN_SEND_TRANSACTION_SUCCESS("Android-EARN-Eth2-VerifyScreen-SendTransaction-Success"),
        EARN_ETH2_VERIFYSCREEN_SEND_TRANSACTION_FAIL("Android-EARN-Eth2-VerifyScreen-SendTransaction-Fail"),
        EARN_ETH2_STAKEONETH2SCREEN_STAKEMORE_CLICKED("Android-EARN-Eth2-StakeOnEth2Screen-StakeMore-Clicked"),
        EARN_ETH2_STAKEONETH2SCREEN_CANIWITHDRAW_CLICKED("Android-EARN-Eth2-StakeOnEth2Screen-CanIWithdraw-Clicked"),
        EARN_ETH2_STAKEONETH2SCREEN_YOUWILLNEEDTOENABLEAGAINALERT_SHOWN("Android-EARN-Eth2-StakeOnEth2Screen-YouWillNeedToEnableAgainAlert-Shown"),

        MARKET_MAINSCREEN_SHOWN("Android-Market-MainScreen-Shown"),
        MARKET_ALLTOKENS_SELECTED("Android-Market-AllTokens-Selected"),
        MARKET_OVERVIEW_BIGMOVERS_CLICKED("Android-Market-Overview-BigMovers-Clicked"),
        MARKET_OVERVIEW_TOPPERIOD_CLICKED("Android-Market-Overview-TopPeriod-Clicked"),
        MARKET_OVERVIEW_TOPGAINERS_CLICKED("Android-Market-Overview-TopGainers-Clicked"),
        MARKET_OVERVIEW_TOPLOSERS_CLICKED("Android-Market-Overview-TopLosers-Clicked"),
        MARKET_TOKEN_INFO_SWAP_CLICKED("Android-Market-TokenPopupSwap-Clicked"),

        SWAP_VERIFY_FEE_DISCLAIMER_CLICKED("Android-Swap-VerifySwapScreen-FeeDisclaimer-Clicked"),
        SWAP_VERIFY_CHOOSE_FEE_DISCLAIMER_CLICKED("Android-Swap-ChooseFeeOverlay-FeeDisclaimer-Clicked"),
        SEND_INPUT_FEE_DISCLAIMER_CLICKED("Android-SendInputScreen-FeeDisclaimer-Clicked"),
        SEND_CHOOSE_FEE_DISCLAIMER_CLICKED("Android-Send-ChooseFeeOverlay-FeeDisclaimer-Clicked"),

        DAPP_MAIN_BANNER_CLICKED("Android-DAPP-MainScreen-Banner-Clicked"),

        ERROR_SWAP_SAVE_PURCHASE_HISTORY("Android-Error-Swap-SavePurchaseHistory-failed"),

        SURVEY_SHOWN("Android-Survey-Shown"),
        SURVEY_RATE1("Android-Survey-Rate1-Sent"),
        SURVEY_RATE2("Android-Survey-Rate2-Sent"),
        SURVEY_RATE3("Android-Survey-Rate3-Sent"),
        SURVEY_RATE4("Android-Survey-Rate4-Sent"),
        SURVEY_RATE5("Android-Survey-Rate5-Sent"),
        SURVEY_TEXTSUBMIT_CLICKED("Android-Survey-TextSubmit-Clicked"),
        SURVEY_EMAILSUBMIT_CLICKED("Android-Survey-EmailSubmit-Clicked"),
        SURVEY_MARKET_OPENED("Android-Survey-Market-Opened"),
        SURVEY_RECOMMEND_CLICKED("Android-Survey-Recommend-Clicked"),

        SURVEY_SUBMIT_CLICKED("Android-Survey-Submit-Clicked"),

        EXCHANGE_BINANCE_CLICKED("Android-ExchangeScreen-BinanceBridge-Clicked"),
        BINANCE_MOVETOBSC_CLICKED("Android-Binance-MoveToBsc-Clicked"),
        BINANCE_MOVETOETH_CLICKED("Android-Binance-MoveToEth-Clicked"),

        BINANCE_MOVETOBSCSCREEN_SHOWN("Android-Binance-MoveToBscScreen-Shown"),
        BINANCE_MOVETOBSCSCREEN_MAX_CLICKED("Android-Binance-MoveToBscScreen-Max-Clicked"),
        BINANCE_MOVETOBSCSCREEN_TOKEN_CLICKED("Android-Binance-MoveToBscScreen-FieldToken-Clicked"),
        BINANCE_WANTED_TOKEN_SHOWN("Android-Binance-MoveToBscScreen-TokenYouWantToMoveScreen-Shown"),
        BINANCE_SUGGESTSWAP_SHOWN("Android-Binance-MoveToBscScreen-TokenYouWantToGetScreen-SuggestSwapPopup-Shown"),
        BINANCE_MOVETOBSCSCREEN_NEXT_CLICKED("Android-Binance-MoveToBscScreen-Next-Clicked"),
        BINANCE_VERIFY_SHOWN("Android-Binance-VerifyMoveScreen-Shown"),
        BINANCE_YOURBSCADDRESSSCREEN_SHOWN("Android-Binance-YourBscAddressScreen-Shown"),
        BINANCE_VERIFY_PROCEED_MOVE("Android-Binance-VerifyMoveScreen-ProceedWithMove-Clicked"),
        BINANCE_INITIATED_SHOWN("Android-Binance-MoveInitiatedPopup-Shown"),
        BINANCE_INITIATED_SEND_TRANSACTION_SUCCESS("Android-Binance-MoveInitiatedPopup-SendTransaction-Success"),
        BINANCE_INITIATED_SEND_TRANSACTION_FAIL("Android-Binance-MoveInitiatedPopup-SendTransaction-Fail"),
        BINANCE_DEPOSITDETAILS_SHOWN("Android-Binance-DepositDetailsScreen-Shown"),

        BINANCE_MOVETOETHSCREEN_SHOWN("Android-Binance-MoveToEthScreen-Shown"),
        BINANCE_MOVETOETH_DISCLAIMER_SHOWN("Android-Binance-MoveToEthScreen-Disclaimer-Shown"),
        BINANCE_SENDETHSCREEN_SHOWN("Android-Binance-SendEthScreen-Shown"),
        BINANCE_SENDETHSCREEN_DEPOSITADDRESS_SHOWN("Android-Binance-SendEthScreen-DepositAddress-Shown"),
        BINANCE_SENDETHSCREEN_QR_SHOWN("Android-Binance-SendEthScreen-QrPopup-Shown"),
        BINANCE_SENDETHSCREEN_COPYADDRESS_CLICKED("Android-Binance-SendEthScreen-CopyAddress-Clicked"),
        BINANCE_SENDETHSCREEN_CHOOSEDEPOSIT_SHOWN("Android-Binance-SendEthScreen-ChooseDepositAddress-Shown")

    }

    companion object {
        fun createConnectingDappEvent(dapp: String? = null) = when (dapp) {
            null -> AnalyticsEvent(Id.CAMERA_VALID_QR_CONNECTING)
            else -> AnalyticsEvent("Android-MEWconnect-$dapp-connecting", Date())
        }

        fun createSuccessDappEvent(dapp: String? = null) = when (dapp) {
            null -> AnalyticsEvent(Id.CAMERA_VALID_QR_CONNECTION_SUCCESS)
            else -> AnalyticsEvent("Android-MEWconnect-$dapp-connected", Date())
        }

        fun createFailDappEvent(dapp: String? = null) = when (dapp) {
            null -> AnalyticsEvent(Id.CAMERA_VALID_QR_CONNECTION_FAILED)
            else -> AnalyticsEvent("Android-MEWconnect-$dapp-failed", Date())
        }

        fun createClickDappEvent(dapp: String) = AnalyticsEvent("Android-DAPP-Featured-${dapp.format()}-Clicked", Date())

        fun createSpeedUpClickTypeEvent(type: String) = AnalyticsEvent("Android-SpeedUpScreen-$type-speed-Clicked", Date())

        fun createClickMarketBannerEvent(name: String?) = AnalyticsEvent("Android-Market-OverviewBanner-${name?.format()}-Clicked", Date())

        fun createClickMarketCollectionTokenEvent(symbol: String) = AnalyticsEvent("Android-Market-Collection-${symbol.format()}-token-Clicked", Date())

        private fun String?.format() = this?.toUpperCase(Locale.US)?.replace(" ", "_")
    }
}
