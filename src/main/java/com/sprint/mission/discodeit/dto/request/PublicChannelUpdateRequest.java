package com.sprint.mission.discodeit.dto.request;

import jakarta.validation.constraints.Size;

public record PublicChannelUpdateRequest(
    @Size(min = 2, max = 50, message = "채널 이름은 2자 이상 50자 이하로 입력해주세요.")
    String newName,

    @Size(max = 255, message = "채널 설명은 255자 이하로 입력해주세요.")
    String newDescription
) {

}