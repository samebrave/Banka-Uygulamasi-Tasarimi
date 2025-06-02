package sam.projects.bankingappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CardItem(
    index: Int,
){
    val card = cards[index]
    var lastPaddingItem = 0.dp
    if (index == cards.size - 1) {
        lastPaddingItem = 16.dp
    }

    var image = painterResource(R.drawable.ic_visa)
    if (card.cardType == "MasterCard"){
        image = painterResource(R.drawable.ic_mastercard)
    }

    Box(
        modifier = Modifier.padding(start = 16.dp, end = lastPaddingItem)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .padding(vertical = 12.dp, horizontal = 16.dp)
                .width(250.dp)
                .height(160.dp)
                .clickable {},
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = image,
                contentDescription = "Image of ${card.cardType}",
                modifier = Modifier.width(60.dp)
                )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = card.cardName,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = Bold
            )

            Text(
                text = "${card.balance}",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = Bold
            )

            Text(
                text = card.cardNumber,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = Bold
            )


        }
    }


}