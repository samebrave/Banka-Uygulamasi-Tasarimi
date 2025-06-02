package sam.projects.bankingappui

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import sam.projects.bankingappui.data.Card
import sam.projects.bankingappui.ui.theme.BlueEnd
import sam.projects.bankingappui.ui.theme.BlueStart
import sam.projects.bankingappui.ui.theme.GreenEnd
import sam.projects.bankingappui.ui.theme.GreenStart
import sam.projects.bankingappui.ui.theme.OrangeEnd
import sam.projects.bankingappui.ui.theme.OrangeStart
import sam.projects.bankingappui.ui.theme.PurpleEnd
import sam.projects.bankingappui.ui.theme.PurpleStart


val cards = listOf<Card>(

    Card(
        cardType = "Visa",
        cardNumber = "**** **** **** 1234",
        cardName = "John Doe",
        balance = 1500.0,
        color = getGradient(PurpleStart, PurpleEnd)
    ),
    Card(
        cardType = "MasterCard",
        cardNumber = "**** **** **** 5678",
        cardName = "Jane Smith",
        balance = 2500.0,
        color = getGradient(BlueStart, BlueEnd)
    ),
    Card(
        cardType = "MasterCard",
        cardNumber = "**** **** **** 9012",
        cardName = "Alice Johnson",
        balance = 3000.0,
        color = getGradient(OrangeStart, OrangeEnd)
    ),
    Card(
        cardType = "Visa",
        cardNumber = "**** **** **** 3456",
        cardName = "Bob Brown",
        balance = 1800.0,
        color = getGradient(GreenStart, GreenEnd)
    )

)

fun getGradient(
    startColor: Color,
    endColor: Color
) : Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}

@Preview
@Composable
fun CardsSection() {
    LazyRow {
        items(cards.size) { index ->
            CardItem(index)
        }
    }
}
