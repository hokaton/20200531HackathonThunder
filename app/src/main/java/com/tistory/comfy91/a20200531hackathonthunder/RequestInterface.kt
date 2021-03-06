package com.tistory.comfy91.a20200531hackathonthunder

import com.tistory.comfy91.a20200531hackathonthunder.data.RequestCalendar
import com.tistory.comfy91.a20200531hackathonthunder.data.RequestDiaryList
import com.tistory.comfy91.a20200531hackathonthunder.data.RequestWrite
import com.tistory.comfy91.a20200531hackathonthunder.data.ResponseDiaryListData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RequestInterface {
    @GET("/diary/list/:uid")
    fun requestDiary(@Body body: RequestDiaryList) : Call<ResponseDiaryListData>

    @GET("/diary/:uid")
    fun requestCalendar(@Body body: RequestCalendar) : Call<CalendarData>

    @POST("/diary/register")
    fun requestWrite(@Body body : RequestWrite) : Call<RequestWrite>
}