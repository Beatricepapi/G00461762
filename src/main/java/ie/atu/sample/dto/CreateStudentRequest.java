package ie.atu.sample.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateStudentRequest(
        @NotBlank String name,
        @NotNull Long roomId
) {
}
