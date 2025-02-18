package org.microdemo.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController {

    @PostMapping
    public void registerCustomer (@RequestBody CustomerRegisterationRequest customerRequest) {
        log.info("Registering customer: {}", customerRequest);
    }
}
