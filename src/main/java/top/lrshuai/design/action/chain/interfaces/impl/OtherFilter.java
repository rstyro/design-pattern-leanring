package top.lrshuai.design.action.chain.interfaces.impl;

import top.lrshuai.design.action.chain.entity.Request;
import top.lrshuai.design.action.chain.entity.Response;
import top.lrshuai.design.action.chain.interfaces.Filter;

public class OtherFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println(request.getParameter()+"其他过滤");
        chain.doFilter(request,response,chain);
    }
}
