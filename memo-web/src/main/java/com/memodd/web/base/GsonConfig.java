package com.memodd.web.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Configuration
public class GsonConfig {
    @Bean
    public GsonHttpMessageConverter gsonHttpMessageConverter() {
        Gson gson = new GsonBuilder().serializeNulls()
                .setDateFormat("yyyy-MM-dd")
                .create();
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        converter.setGson(gson);
        return converter;
    }

//    @Configuration
//    public class WebMvcConfig extends WebMvcConfigurerAdapter {
//        @Override
//        public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//            converters.clear();
//            Gson gson = new GsonBuilder().serializeNulls()
//                    .setDateFormat("yyyy-MM-dd")
//                    .create();
//            GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//            converter.setGson(gson);
//            converters.add(converter);
//        }
//    }

}