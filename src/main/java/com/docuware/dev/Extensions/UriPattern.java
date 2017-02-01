/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.util.Map;

/**
 *
 * @author Patrick
 */
public class UriPattern {

    public static String Resolve(String pattern, Map<String, Object> parameters) {
        UriTemplateResolver resolver = new UriTemplateResolver(pattern);

        for (String key : parameters.keySet()){
            resolver.SetParameter(key, parameters.get(key));
        }

        return resolver.Resolve();
    }
}
