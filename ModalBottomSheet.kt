import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetDialog(sheetState: ModalBottomSheetState) {
    ModalBottomSheetLayout(
        sheetContent = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Manage Actions", fontSize = 20.sp, fontWeight = FontWeight.W400)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    ComponentCard(title = "Upload", icon = Icons.Rounded.UploadFile)
                    ComponentCard(title = "Scan", icon = Icons.Rounded.PhotoCamera)
                    ComponentCard(title = "Get Link", icon = Icons.Rounded.Link)
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    ComponentCard(title = "Save", icon = Icons.Rounded.Save)
                    ComponentCard(title = "Delete", icon = Icons.Rounded.Delete)
                    ComponentCard(title = "Share", icon = Icons.Rounded.Share)
                }
            }
        },
        sheetState = sheetState,
        sheetBackgroundColor = Color.White,
        sheetContentColor = Color.Black,
        sheetElevation = 8.dp,
        scrimColor = Color.Transparent.copy(.5f),
        sheetShape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp)
    ) {

    }
}

@Composable
fun ComponentCard(
    title: String,
    icon: ImageVector,
) {
    Column(
        modifier = Modifier
            .wrapContentSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            icon,
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .padding(4.dp)
        )

        Text(text = title, fontSize = 12.sp)
    }

}