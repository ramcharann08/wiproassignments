package com.example.transactionfilterapp;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class TransactionLoggingFilter implements Filter {

    private static final DateTimeFormatter DTF =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // no initialization needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpReq = (HttpServletRequest) request;
        String amount = httpReq.getParameter("amount");
        if (amount == null) {
            amount = "0";
        }

        String clientIp = request.getRemoteAddr();
        String timestamp = LocalDateTime.now().format(DTF);

        System.out.println("[" + timestamp + "] Transaction Request from IP: "
                + clientIp + " | Amount: Rs." + amount);

        // proceed with the request
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // no cleanup needed
    }
}
