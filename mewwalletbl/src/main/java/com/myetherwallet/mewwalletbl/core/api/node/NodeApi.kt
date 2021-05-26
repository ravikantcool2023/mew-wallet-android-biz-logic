package com.myetherwallet.mewwalletbl.core.api.node

import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.myetherwallet.mewwalletbl.data.JsonRpcRequest
import com.myetherwallet.mewwalletbl.data.JsonRpcResponse
import com.myetherwallet.mewwalletbl.data.TransactionResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * Created by BArtWell on 21.09.2019.
 */

interface NodeApi {

    @POST("{networkId}")
    @Headers("content-type: application/json")
    fun getBalance(@Path("networkId") networkId: String, @Body jsonRpc: JsonRpcRequest<String>): Call<JsonRpcResponse<String>>

    @POST("{networkId}")
    @Headers("content-type: application/json")
    fun getGasPrice(@Path("networkId") networkId: String, @Body jsonRpc: JsonRpcRequest<Unit>): Call<JsonRpcResponse<String>>

    @POST("{networkId}")
    @Headers("content-type: application/json")
    fun getNonce(@Path("networkId") networkId: String, @Body jsonRpc: JsonRpcRequest<String>): Call<JsonRpcResponse<String>>

    @POST("{networkId}")
    @Headers("content-type: application/json")
    fun sendRawTransaction(@Path("networkId") networkId: String, @Body jsonRpc: JsonRpcRequest<String>): Call<JsonRpcResponse<String>>

    @POST("{networkId}")
    @Headers("content-type: application/json")
    fun getTransactionByHash(@Path("networkId") networkId: String, @Body jsonRpc: JsonRpcRequest<String>): Call<JsonRpcResponse<TransactionResponse>>

    @POST("{networkId}")
    @Headers("content-type: application/json")
    fun getEstimateGas(@Path("networkId") networkId: String, @Body jsonRpc: JsonRpcRequest<JsonElement>): Call<JsonRpcResponse<String>>

    @POST("{networkId}")
    @Headers("content-type: application/json")
    fun getApprovalHandler(@Path("networkId") networkId: String, @Body jsonRpc: JsonRpcRequest<JsonElement>): Call<JsonRpcResponse<String>>
}
