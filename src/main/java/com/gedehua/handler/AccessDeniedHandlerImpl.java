package com.gedehua.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gedehua.domain.ResponseResult;
import com.gedehua.utails.WebUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Slf4j
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        ResponseResult result = new ResponseResult(HttpStatus.FORBIDDEN.value(), "权限不足");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(result);
        log.info("json:"+json);
        WebUtils.renderString(response,json);

    }
}
