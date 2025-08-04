package com.epam.gymcrm.api.payload.response;

public record TraineeTrainingInfo(
        String trainingName,
        String trainingDate,
        String trainingType,
        Integer trainingDuration,
        String trainerName
) {
}
