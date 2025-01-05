package com.kopring.fitlinkbe.infrastructure.trainer

import com.kopring.fitlinkbe.domain.trainer.TrainerRepository
import com.kopring.fitlinkbe.domain.trainer.TrainerReservation
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Repository

@Repository
@RequiredArgsConstructor
class TrainerRepositoryImpl(
    private val trainerJpaRepository: TrainerJpaRepository
) : TrainerRepository {

    override fun getReservations(): List<TrainerReservation> {
        TODO("Not yet implemented")
    }
}