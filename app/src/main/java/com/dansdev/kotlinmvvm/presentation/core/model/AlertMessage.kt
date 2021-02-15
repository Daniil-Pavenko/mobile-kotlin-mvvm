package com.dansdev.kotlinmvvm.presentation.core.model

import android.content.res.Resources
import androidx.annotation.StringRes

sealed class AlertMessage {

    data class ErrorMessage(@StringRes val message: Int = 0, val text: String = "") : AlertMessage() {

        fun content(resources: Resources): CharSequence {
            return if (message != 0) resources.getString(message)
            else text
        }
    }

    data class SuccessMessage(@StringRes val message: Int = 0, val text: String = "") : AlertMessage() {

        fun content(resources: Resources): CharSequence {
            return if (message != 0) resources.getString(message)
            else text
        }
    }
}
