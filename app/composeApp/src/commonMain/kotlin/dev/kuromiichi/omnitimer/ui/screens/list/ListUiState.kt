package dev.kuromiichi.omnitimer.ui.screens.list

import dev.kuromiichi.omnitimer.data.models.Category
import dev.kuromiichi.omnitimer.data.models.Subcategory
import java.util.UUID


data class ListUiState(
    val subcategory: Subcategory = Subcategory(UUID.randomUUID(), "Default", Category.THREE),
    val showArchived: Boolean = false,
    val count: Int = 0,
    val isCategoryDialogShowing: Boolean = false,
    val isSubcategoryDialogShowing: Boolean = false,
    val isCreateSubcategoryDialogShowing: Boolean = false,
    val isEditSubcategoryDialogShowing: Boolean = false,
    val originalSubcategoryName: String = "",
    val subcategoryName: String = ""
)
