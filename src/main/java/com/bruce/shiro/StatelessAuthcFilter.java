package com.bruce.shiro;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.web.filter.AccessControlFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class StatelessAuthcFilter extends AccessControlFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        try{
            StatelessToken token=new StatelessToken("zhang","123456");
            getSubject(servletRequest,servletResponse).login(token);
        }catch(AuthorizationException e){
            loginFailed(servletResponse);
            return false;
        }
        return true;
    }
    private void loginFailed(ServletResponse response)throws IOException {
        response.getWriter().append("login failed").close();
    }
}
