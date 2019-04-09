package top.lrshuai.design.action.chain;

import top.lrshuai.design.action.chain.entity.Request;
import top.lrshuai.design.action.chain.entity.Response;
import top.lrshuai.design.action.chain.interfaces.impl.CharsetFilter;
import top.lrshuai.design.action.chain.interfaces.impl.FilterChain;
import top.lrshuai.design.action.chain.interfaces.impl.OtherFilter;
import top.lrshuai.design.action.chain.interfaces.impl.SensitiveFilter;

/**
 * 责任链模式
 * 通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 */
public class Main {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.addFilter(new CharsetFilter()).addFilter(new SensitiveFilter()).addFilter(new OtherFilter());
        chain.doFilter(new Request("test"),new Response(),chain);
    }
}
