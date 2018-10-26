package com.logsentinel.sentineldb;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

@SuppressWarnings("serial")
public class JacksonRawValueModule extends SimpleModule {

    class RawValueDeserializer extends JsonDeserializer<String> implements ContextualDeserializer {
        @Override
        public String deserialize(JsonParser jp, DeserializationContext ctx) throws IOException {
            TreeNode tree = jp.getCodec().readTree(jp);
            return tree.toString();
        }

        @Override
        public JsonDeserializer<?> createContextual(DeserializationContext ctx,
                                                    BeanProperty property) throws JsonMappingException {
            if (property != null && property.getMember().getAnnotation(JsonRawValue.class) != null) {
                return this;
            }
            return new StringDeserializer();
        }
    }

    public JacksonRawValueModule() {
        addDeserializer(String.class, new RawValueDeserializer());
    }

}