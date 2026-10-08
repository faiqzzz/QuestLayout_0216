package com.example.pertemuan4.ui.theme

@Composable
fun ActivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {}
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
}