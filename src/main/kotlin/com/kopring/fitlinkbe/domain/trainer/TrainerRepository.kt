package com.kopring.fitlinkbe.domain.trainer

interface TrainerRepository {
    fun getReservations(): List<TrainerReservation>
}