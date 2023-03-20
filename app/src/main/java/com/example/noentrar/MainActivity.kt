package com.example.noentrar

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.foundation.Image
import android.os.Bundle
import android.text.Html.ImageGetter
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.noentrar.navegation.AppNavegation
import com.example.noentrar.ui.theme.NOENTRARTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NOENTRARTheme {
                AppNavegation()
            }

        }
    }

}

