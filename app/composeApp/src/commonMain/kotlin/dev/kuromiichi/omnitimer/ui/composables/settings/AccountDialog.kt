package dev.kuromiichi.omnitimer.ui.composables.settings

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.kuromiichi.omnitimer.ui.composables.settings.AccountCredentials

@Composable
fun AccountDialog(
    modifier: Modifier = Modifier,
    isOpen: Boolean,
    isLogin: Boolean,
    email: String,
    password: String,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onTopButtonClicked: (Boolean) -> Unit,
    onBottomButtonClicked: (Boolean) -> Unit,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    if (isOpen) {
        AlertDialog(
            onDismissRequest = onDismiss,
            confirmButton = {
                Button(
                    onClick = onConfirm
                ) {
                    Text(text = "Done")
                }
            },
            text = {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    shape = MaterialTheme.shapes.medium
                ) {
                    AccountCredentials(
                        isLogin = isLogin,
                        email = email,
                        password = password,
                        onEmailChange = onEmailChange,
                        onPasswordChange = onPasswordChange,
                        onTopButtonClicked = onTopButtonClicked,
                        onBottomButtonClicked = onBottomButtonClicked
                    )
                }

            },
            modifier = modifier
        )
    }
}
