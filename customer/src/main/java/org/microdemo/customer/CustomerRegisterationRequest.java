package org.microdemo.customer;


public record CustomerRegisterationRequest(
    String firstName,
    String lastName,
    String email
)
