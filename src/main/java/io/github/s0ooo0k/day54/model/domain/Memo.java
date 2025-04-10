package io.github.s0ooo0k.day54.model.domain;

import java.time.LocalDateTime;

public record Memo(Long id, String text, String createdAt) {
    public static Memo fromText(String text) {
        return new Memo(
                null,                           // id는 생성 시점에 null (DB에서 자동 생성 예상)
                text,                           // 사용자가 입력한 메모 내용
                LocalDateTime.now().toString()  // 현재 시간으로 createdAt 설정
        );
    }
}
