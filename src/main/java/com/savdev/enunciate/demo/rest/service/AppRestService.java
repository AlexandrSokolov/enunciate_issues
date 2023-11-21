package com.savdev.enunciate.demo.rest.service;

import com.savdev.enunciate.demo.rest.api.RestApi;
import com.savdev.enunciate.demo.rest.api.model.Message;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class AppRestService implements RestApi {

  @Override
  public Message get() {
    return new Message("Hello!", ZonedDateTime.now());
  }
}
