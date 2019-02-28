package com.template.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.springframework.messaging.handler.annotation.SendTo;

import static java.util.Objects.requireNonNull;

@JsonTypeName("dialog_submission")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class DialogRequest implements Request {
    @JsonProperty("test2")
    private String test;
    private String nodata;
    @Override
    public String getType() {
        return "DialogRequest";
    }

    @Override
    public Request getInstance() {
        return this;
    }
    public String getTest()
    {
        return test;
    }
}
