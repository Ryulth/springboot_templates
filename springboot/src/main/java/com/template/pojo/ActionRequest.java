package com.template.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ActionRequest implements Request{
    private String test;
    @Override
    public String getType() {
        return "ActionRequest";
    }

    @Override
    public Request getInstance() {
        return this;
    }

}
