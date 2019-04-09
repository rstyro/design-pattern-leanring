package top.lrshuai.design.action.chain.interfaces.impl;

import top.lrshuai.design.action.chain.entity.Request;
import top.lrshuai.design.action.chain.entity.Response;
import top.lrshuai.design.action.chain.interfaces.Filter;

public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println(request.getParameter()+"敏感词过滤");
        chain.doFilter(request,response,chain);
    }
}
