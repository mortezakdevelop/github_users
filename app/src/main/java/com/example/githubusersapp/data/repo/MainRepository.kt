package com.example.githubusersapp.data.repo

import com.example.githubusersapp.data.model.ResponseUsers
import com.example.githubusersapp.data.remote.ApiService
import com.example.githubusersapp.util.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import okhttp3.Dispatcher
import retrofit2.http.Query
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun searchUsers(query: String): Flow<NetworkResult<ResponseUsers>> {
        return flow {
            if (apiService.searchUsers(query).isSuccessful) {
                emit(
                    NetworkResult.success(
                        apiService.searchUsers(query).body()))
            }
        }
            .catch {
                emit(NetworkResult.error(it.message.toString()))
            }
            .flowOn(Dispatchers.IO)
    }
}