package de.template.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/mock")
    public MockResponse handleMockResponseRequest(
            @RequestParam(name = "content", defaultValue = "A mock response.") String content
    ){
        return new MockResponse(content);
    }

}
