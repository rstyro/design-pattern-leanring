package top.lrshuai.design.action.chain.interfaces;

import top.lrshuai.design.action.chain.entity.Request;
import top.lrshuai.design.action.chain.entity.Response;
import top.lrshuai.design.action.chain.interfaces.impl.FilterChain;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
