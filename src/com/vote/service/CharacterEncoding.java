package com.vote.service;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncoding implements Filter
{

  public void destroy()
  {
  }

  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
      ServletException
  {
    req.setCharacterEncoding("utf-8");//大写时错误
    res.setCharacterEncoding("utf-8");

    chain.doFilter(req, res);
  }

  public void init(FilterConfig arg0) throws ServletException
  {

  }

}
