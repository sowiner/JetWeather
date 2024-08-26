package com.sowinsoft.jetweather.data


class DataOrException<T, E : Exception, Boolean>(
    var data: T? = null,
    var exception: E? = null,
    var loading: kotlin.Boolean? = null
)
