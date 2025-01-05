package com.kopring.fitlinkbe.infrastructure.trainer

import org.springframework.data.jpa.repository.JpaRepository

interface TrainerJpaRepository : JpaRepository<TrainerEntity, Long> {
}