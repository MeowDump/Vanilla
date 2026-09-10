package com.sosauce.vanilla.data.actions

sealed interface CalcAction {
    data object GetResult : CalcAction
    data object ResetField : CalcAction
    data object Backspace : CalcAction
    data object MemoryClear : CalcAction
    data object MemoryRecall : CalcAction
    data object MemoryAdd : CalcAction
    data object MemorySubtract : CalcAction

    data class AddToField(
        val char: Char
    ) : CalcAction

    data class AddExpressionToField(
        val expression: String
    ) : CalcAction
}
