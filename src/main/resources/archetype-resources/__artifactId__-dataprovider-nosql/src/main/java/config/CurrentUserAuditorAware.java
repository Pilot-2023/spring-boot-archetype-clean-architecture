package ${package}.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class CurrentUserAuditorAware implements AuditorAware<String> {

    // Implement this method to return the current user's name or ID
    @Override
    public Optional<String> getCurrentAuditor() {
        // You can retrieve the current user from your security context or any other source.
        // For example:
        // return Optional.of("current_username");
        return Optional.empty(); // If you don't have a user context, return empty.
    }

}