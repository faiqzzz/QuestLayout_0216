package com.example.pertemuan4.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan4.R

@Composable
fun ActivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(id = R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.card_0_bg)
            )
        ) {
            Row() {
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(5.dp)
                )
                Spacer(modifier = Modifier.width(38.dp))
                Column() {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )

                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 18.dp)
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}