package com.raywenderlich.android.lab1.screens

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter

@Composable
fun ScaffoldScreen(){
    MyScaffold()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyScaffold(){}

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState){}

@Composable
fun MyBottomAppBar(){}