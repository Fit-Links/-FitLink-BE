package com.kopring.fitlinkbe.interfaces.controller.trainer

import com.kopring.fitlinkbe.domain.trainer.TrainerService
import com.kopring.fitlinkbe.interfaces.controller.common.dto.ApiResultResponse
import jakarta.validation.constraints.NotNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/trainers")
class TrainerController(private val trainerService: TrainerService) {


    @GetMapping("/{trainerId}/reservations")
    fun getReservations(@PathVariable(name = "trainerId") @NotNull weekend: Int): ApiResultResponse<String> {
        return ApiResultResponse.ok("good")
    }
}