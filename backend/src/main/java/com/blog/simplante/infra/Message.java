package com.blog.simplante.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;
import org.springframework.context.MessageSource;

import javax.annotation.PostConstruct;
import java.util.Locale;

@Component
public class Message {

    @Autowired
    private MessageSource messageSource;

    private MessageSourceAccessor accessor;

    @PostConstruct
    private void init() {
        accessor = new MessageSourceAccessor(messageSource, Locale.getDefault());
    }

    public String get(String code) {
        return accessor.getMessage(code);
    }
}
