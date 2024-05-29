package ui.screens.settings

data class SettingsUiState(
    val isExpanded: Map<String, Boolean> = mapOf(
        "account" to false,
        "inspection" to false,
        "stats" to false,
        "delete" to false
    ),
    val isEnabled: Map<String, Boolean> = mapOf(
        "inspection" to false,
        "alert" to false,
        "best" to false,
        "mo3" to false,
        "ao5" to false,
        "ao12" to false,
        "ao50" to false,
        "ao100" to false
    ),
    val isDeleteDialogShowing: Boolean = false
)
