package com.example.mazegame_v2.viewModels

import androidx.lifecycle.ViewModel
import com.example.mazegame_v2.models.GameModel
import kotlin.math.sqrt

class MainViewModel : ViewModel() {

    val gameModel : GameModel = GameModel()

    fun setUp(flattenedList: IntArray) {
        gameModel.make2DArray(flattenedList)
    }
}