package io.helidon.example.jpa;

import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Simple JAXRS Application that registers one resource class.
 */
@ApplicationScoped
@ApplicationPath("/")
public class ExampleApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(ExampleResource.class);
    }
}
