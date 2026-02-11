package edu.gvsu.cis.uireplication


import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.gvsu.cis.uireplication.ui.theme.UiReplicationTheme

@Composable
fun GmailHomeScreen(modifier: Modifier = Modifier) {
    val SearchBar: TextFieldState = rememberTextFieldState()

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().padding(top = 50.dp).background(color = Color.Black)) {
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)) {
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray)) {
                Text(text = "_\n_\n_",color = Color.Black)
            }
            OutlinedTextField(SearchBar, label = {
                Text("Search in mail",color = Color.Black)
            },
                colors = OutlinedTextFieldDefaults.colors( unfocusedContainerColor = Color.LightGray ),
                modifier = Modifier.height(75.dp)
            )
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray)) {
                Text(text = "\nH\n", color = Color.Black)
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Blue,  shape = CircleShape).align(Alignment.CenterVertically).padding(start=20.dp))
                Text(
                    "Fake Email One From GVSU\nText text text text text text text text\n text text text text text text text",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 20.dp)
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    checked = false,
                    onCheckedChange = {
                        checked = it
                    },
                    modifier = Modifier.padding(start = 8.dp, top = 30.dp))
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Blue,  shape = CircleShape).align(Alignment.CenterVertically).padding(start=20.dp))
                Text(
                    "Fake Email Two From GVSU\nText text text text text text text text\n text text text text text text text",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 20.dp)
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    checked = false,
                    onCheckedChange = {
                        checked = it
                    },
                    modifier = Modifier.padding(start = 8.dp, top = 30.dp))
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Blue,  shape = CircleShape).align(Alignment.CenterVertically).padding(start=20.dp))
                Text(
                    "Fake Email Three From GVSU\nText text text text text text text text\n text text text text text text text",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 20.dp)
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    checked = false,
                    onCheckedChange = {
                        checked = it
                    },
                    modifier = Modifier.padding(start = 8.dp, top = 30.dp))
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Blue,  shape = CircleShape).align(Alignment.CenterVertically).padding(start=20.dp))
                Text(
                    "Fake Email Four From GVSU\nText text text text text text text text\n text text text text text text text",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 20.dp)
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    checked = false,
                    onCheckedChange = {
                        checked = it
                    },
                    modifier = Modifier.padding(start = 8.dp, top = 30.dp))
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Blue,  shape = CircleShape).align(Alignment.CenterVertically).padding(start=20.dp))
                Text(
                    "Fake Email Five From GVSU\nText text text text text text text text\n text text text text text text text",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 20.dp)
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    checked = false,
                    onCheckedChange = {
                        checked = it
                    },
                    modifier = Modifier.padding(start = 8.dp, top = 30.dp))
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Blue,  shape = CircleShape).align(Alignment.CenterVertically).padding(start=20.dp))
                Text(
                    "Fake Email Six From GVSU\nText text text text text text text text\n text text text text text text text",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 20.dp)
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    checked = false,
                    onCheckedChange = {
                        checked = it
                    },
                    modifier = Modifier.padding(start = 8.dp, top = 30.dp))
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Blue,  shape = CircleShape).align(Alignment.CenterVertically).padding(start=20.dp))
                Text(
                    "Fake Email Seven From GVSU\nText text text text text text text text\n text text text text text text text",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 20.dp)
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    checked = false,
                    onCheckedChange = {
                        checked = it
                    },
                    modifier = Modifier.padding(start = 8.dp, top = 30.dp))
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Blue,  shape = CircleShape).align(Alignment.CenterVertically).padding(start=20.dp))
                Text(
                    "Fake Email Eight From GVSU\nText text text text text text text text\n text text text text text text text",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 20.dp)
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    checked = false,
                    onCheckedChange = {
                        checked = it
                    },
                    modifier = Modifier.padding(start = 8.dp, top = 30.dp))
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(color = Color.Blue, shape = CircleShape)
                        .align(Alignment.CenterVertically).padding(start = 20.dp)
                )
                Text(
                    "Fake Email Nine From GVSU\nText text text text text text text text\n text text text text text text text",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 20.dp)
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    checked = false,
                    onCheckedChange = {
                        checked = it
                    },
                    modifier = Modifier.padding(start = 8.dp, top = 30.dp)
                )
            }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(100.dp), modifier = Modifier.background(color = Color.DarkGray).padding(start = 60.dp, end = 60.dp).fillMaxSize()) {
            Box(modifier = Modifier.size(20.dp).background(color=Color.LightGray, shape = RectangleShape).align(Alignment.CenterVertically).weight(.25f))
            Box(modifier = Modifier.size(20.dp).background(color=Color.LightGray, shape = RectangleShape).weight(.25f).align(Alignment.CenterVertically))
            Box(modifier = Modifier.size(20.dp).background(color=Color.LightGray, shape = RectangleShape).weight(.25f).align(Alignment.CenterVertically))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GmailHomeScreenPreview() {
    UiReplicationTheme {
        GmailHomeScreen()
    }
}