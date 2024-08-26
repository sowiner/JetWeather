package com.sowinsoft.jetweather.utils

object Constants {
    // "https://opendata.cwa.gov.tw/api/v1/rest/datastore/F-D0047-091?Authorization=CWA-2F26782A-4E5D-4D75-93E6-2052CACE5C81"
    private const val SCHEMA = "https"
    private const val DATAID = "F-D0047-091"
    private const val BASE_URL = "opendata.cwa.gov.tw/api/v1/rest/datastore"
    private const val API_KEY = "CWA-2F26782A-4E5D-4D75-93E6-2052CACE5C81"

    fun getWeatherUrl(): String {
        return "$SCHEMA://$BASE_URL/$DATAID?$API_KEY"
    }
}