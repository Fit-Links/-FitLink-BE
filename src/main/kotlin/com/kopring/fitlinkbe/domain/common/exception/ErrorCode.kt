package com.kopring.fitlinkbe.domain.common.exception

enum class ErrorCode(val msg: String) {

    // Member-related ErrorCode
    TRAINER_IS_NOT_FOUND("해당 회원을 찾을 수 없습니다."),

    // Reservation-related ErrorCode
    RESERVATION_IS_FAILED("예약에 실패하였습니다"),
}