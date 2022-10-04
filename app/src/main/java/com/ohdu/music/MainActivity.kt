package com.ohdu.music

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ohdu.music.ui.theme.ComposeMusicTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMusicTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(bottomBar = { MainBottomNavigation() }) {

                }

            }
        }
    }
}

@Preview(name = "首页底部导航栏")
@Composable
fun MainBottomNavigation() {
    NavigationBar {
        NavigationBarItem(selected = false, onClick = {

        }, icon = {
            Icon(Icons.Default.Home, contentDescription = "")
        }, label = {
            Text(text = "首页")
        }, alwaysShowLabel = false
        )
        NavigationBarItem(selected = false, onClick = {

        }, icon = {
            Icon(Icons.Default.Add, contentDescription = "")
        }, label = {
            Text(text = "音乐")
        }, alwaysShowLabel = false
        )
        NavigationBarItem(selected = false, onClick = {

        }, icon = {
            Icon(Icons.Default.Menu, contentDescription = "")
        }, label = {
            Text(text = "我的")
        }, alwaysShowLabel = false
        )
    }
}
