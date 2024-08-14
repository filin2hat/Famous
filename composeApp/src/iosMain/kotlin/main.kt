import androidx.compose.ui.window.ComposeUIViewController
import dev.filinhat.famous.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
