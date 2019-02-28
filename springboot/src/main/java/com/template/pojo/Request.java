package com.template.pojo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        //include = JsonTypeInfo.As.PROPERTY,//default type 이잇으면 안해두댐
        //property = "type"
        defaultImpl = ActionRequest.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = DialogRequest.class, name = "dialog_submission"),
})
public interface Request {
    String getType();
    Request getInstance();
}
