package com.go.ski.user.support.dto;

import com.go.ski.user.support.vo.IsInstructAvailable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UpdateInstructorRequestDTO extends InstructorImagesDTO {
    private String description;
    private IsInstructAvailable isInstructAvailable;
    private Integer dayoff;
}
