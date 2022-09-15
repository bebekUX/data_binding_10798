package com.gd.data_binding_10798

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

object FakeRepository {
    private val fruitNames: List<String> = listOf(
        "Apel", "mangga", "pisang", "Anggur", "Stroberi",
        "jambu", "Raspberi", "bambu", "kiwi", "Pir"
    )

    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFruitName

    init{
        _currentRandomFruitName.value = fruitNames.first()
    }

    fun getRandomfruitName(): String{
        val random = Random.nextInt(fruitNames.size)
        return fruitNames[random]
    }

    fun changeCurrentRandomFruitName(){
        _currentRandomFruitName.value = getRandomfruitName()
    }
}
