package com.example.githubusersapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubusersapp.data.model.ResponseUsers
import com.example.githubusersapp.data.repo.MainRepository
import com.example.githubusersapp.util.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel(
    private val mainRepository: MainRepository
):ViewModel() {
    private val _stateSearch : MutableStateFlow<NetworkResult<ResponseUsers>?> = MutableStateFlow(null)
    val stateSearch = _stateSearch.asStateFlow()


    fun searchUsers(query : String) = viewModelScope.launch {
        mainRepository.searchUsers(query).collect{
            _stateSearch.value = it
        }
    }
}