package de.template.api;

import java.util.UUID;

public class MockResponse {

    private final String uuid;
    private final String content;

    public MockResponse(String content) {
        this.uuid = UUID.randomUUID().toString();
        this.content = content;
    }

    public String getUuid() {
        return uuid;
    }

    public String getContent() {
        return content;
    }

}
