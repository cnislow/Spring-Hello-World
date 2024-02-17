package world.hello.http.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
    public String getDummyResponse() {
        return "Hello World";
    }
}
