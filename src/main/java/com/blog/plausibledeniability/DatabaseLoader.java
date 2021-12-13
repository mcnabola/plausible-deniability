package com.blog.plausibledeniability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final BlogRepository repository;

    @Autowired
    public DatabaseLoader(BlogRepository repository) {
        this.repository=repository;
    }

    @Override
    public void run(String ... strings) throws Exception {
        this.repository.save(new Blog("Hello World", "mark mc", "Hello to the internet, is this really from Mark or not, I guess you can never truly know. err I suppose the first post is from me we have to wait until the bots show up :)"));
    }
}
