package top.lrshuai.design.action.chain.entity;

import lombok.Data;

@Data
public class Request {
    String parameter;

    public Request(String parameter) {
        this.parameter = parameter;
    }
}
