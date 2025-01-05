package com.kopring.fitlinkbe.domain.common.exception


class CustomException(
    private val errorCode: ErrorCode,
    private val msg: String
) : RuntimeException() {
    override val message: String
        get() = "[${errorCode}] $msg"

}

