package com.unicomer.productstore.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

/**
 * Constant
 */
public class Constant {

    public static final Contact DEFAULT_CONTACT = new Contact("<por definir>", "https://grupounicomer.com/",
            "info@unicomer.com");

    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("REST PRODUCT Service",
            "REST PRODUCT Service,  Endpoint para consulta de productos ", "1.0.0", "https://grupounicomer.com/",
            DEFAULT_CONTACT, "Unicomer Endpoint Definition 1.0", "https://grupounicomer.com/", new ArrayList<>());

    public static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(
            Arrays.asList(new String[] { "application/json" }));

}