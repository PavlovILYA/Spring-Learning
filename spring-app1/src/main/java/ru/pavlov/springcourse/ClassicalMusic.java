package ru.pavlov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "F. Schubert - Serenade";
    }
}
