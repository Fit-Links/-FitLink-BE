package com.kopring.fitlinkbe.interfaces.controller.common.dto

import org.springframework.http.HttpStatus

data class ApiResultResponse<T>( // 코틀린에서는 record -> data class 로 변환(불변성과 equals, hashCode, toString 기본 지원)
    val status: HttpStatus,
    val success: Boolean,
    val msg: String,
    val data: T
) {
    companion object { // 코틀린에서는 정적 메서드 -> companion object 변환
        fun <T> of(httpStatus: HttpStatus, success: Boolean, message: String, data: T): ApiResultResponse<T> {
            return ApiResultResponse(httpStatus, success, message, data)
        }

        fun <T> of(httpStatus: HttpStatus, success: Boolean, data: T): ApiResultResponse<T> {
            return ApiResultResponse(httpStatus, success, httpStatus.name, data)
        }

        fun <T> ok(data: T): ApiResultResponse<T> {
            return of(HttpStatus.OK, true, data)
        }
    }
}