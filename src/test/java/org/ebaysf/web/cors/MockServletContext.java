/**
 * Copyright 2012-2013 eBay Software Foundation, All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.ebaysf.web.cors;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterRegistration;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import jakarta.servlet.SessionCookieConfig;
import jakarta.servlet.SessionTrackingMode;
import jakarta.servlet.descriptor.JspConfigDescriptor;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class MockServletContext implements ServletContext {

    public String getContextPath() {
        throw new RuntimeException("Not implemented");
    }

    public ServletContext getContext(String uripath) {
        throw new RuntimeException("Not implemented");
    }

    public int getMajorVersion() {
        throw new RuntimeException("Not implemented");
    }

    public int getMinorVersion() {
        throw new RuntimeException("Not implemented");
    }


    @Override
    public int getEffectiveMajorVersion() {

        return 0;
    }


    @Override
    public int getEffectiveMinorVersion() {

        return 0;
    }


    public String getMimeType(String file) {
        throw new RuntimeException("Not implemented");
    }

    public Set getResourcePaths(String path) {
        throw new RuntimeException("Not implemented");
    }

    public URL getResource(String path) throws MalformedURLException {
        throw new RuntimeException("Not implemented");
    }

    public InputStream getResourceAsStream(String path) {
        throw new RuntimeException("Not implemented");
    }

    public RequestDispatcher getRequestDispatcher(String path) {

        throw new RuntimeException("Not implemented");
    }

    public RequestDispatcher getNamedDispatcher(String name) {

        throw new RuntimeException("Not implemented");
    }

    public Servlet getServlet(String name) throws ServletException {

        throw new RuntimeException("Not implemented");
    }

    public Enumeration getServlets() {

        throw new RuntimeException("Not implemented");
    }

    public Enumeration getServletNames() {

        throw new RuntimeException("Not implemented");
    }

    public void log(String msg) {
        // NOOP
    }

    public void log(Exception exception, String msg) {
        // NOOP
    }

    public void log(String message, Throwable throwable) {
        // NOOP
    }

    public String getRealPath(String path) {

        throw new RuntimeException("Not implemented");
    }

    public String getServerInfo() {

        throw new RuntimeException("Not implemented");
    }

    public String getInitParameter(String name) {

        throw new RuntimeException("Not implemented");
    }

    public Enumeration getInitParameterNames() {

        throw new RuntimeException("Not implemented");
    }


    @Override
    public boolean setInitParameter(String s, String s1) {

        return false;
    }


    public Object getAttribute(String name) {

        throw new RuntimeException("Not implemented");
    }

    public Enumeration getAttributeNames() {

        throw new RuntimeException("Not implemented");
    }

    public void setAttribute(String name, Object object) {
        throw new RuntimeException("Not implemented");
    }

    public void removeAttribute(String name) {
        throw new RuntimeException("Not implemented");
    }

    public String getServletContextName() {

        throw new RuntimeException("Not implemented");
    }


    @Override
    public ServletRegistration.Dynamic addServlet(String s, String s1) {

        return null;
    }


    @Override
    public ServletRegistration.Dynamic addServlet(String s, Servlet servlet) {

        return null;
    }


    @Override
    public ServletRegistration.Dynamic addServlet(String s, Class<? extends Servlet> aClass) {

        return null;
    }


    @Override
    public ServletRegistration.Dynamic addJspFile(String s, String s1) {

        return null;
    }


    @Override
    public <T extends Servlet> T createServlet(Class<T> aClass) throws ServletException {

        return null;
    }


    @Override
    public ServletRegistration getServletRegistration(String s) {

        return null;
    }


    @Override
    public Map<String, ? extends ServletRegistration> getServletRegistrations() {

        return new HashMap();
    }


    @Override
    public FilterRegistration.Dynamic addFilter(String s, String s1) {

        return null;
    }


    @Override
    public FilterRegistration.Dynamic addFilter(String s, Filter filter) {

        return null;
    }


    @Override
    public FilterRegistration.Dynamic addFilter(String s, Class<? extends Filter> aClass) {

        return null;
    }


    @Override
    public <T extends Filter> T createFilter(Class<T> aClass) throws ServletException {

        return null;
    }


    @Override
    public FilterRegistration getFilterRegistration(String s) {

        return null;
    }


    @Override
    public Map<String, ? extends FilterRegistration> getFilterRegistrations() {

        return new HashMap();
    }


    @Override
    public SessionCookieConfig getSessionCookieConfig() {

        return null;
    }


    @Override
    public void setSessionTrackingModes(Set<SessionTrackingMode> set) {

    }


    @Override
    public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {

        return new HashSet<SessionTrackingMode>();
    }


    @Override
    public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {

        return new HashSet<SessionTrackingMode>();
    }


    @Override
    public void addListener(String s) {

    }


    @Override
    public <T extends EventListener> void addListener(T t) {

    }


    @Override
    public void addListener(Class<? extends EventListener> aClass) {

    }


    @Override
    public <T extends EventListener> T createListener(Class<T> aClass) throws ServletException {

        return null;
    }


    @Override
    public JspConfigDescriptor getJspConfigDescriptor() {

        return null;
    }


    @Override
    public ClassLoader getClassLoader() {

        return null;
    }


    @Override
    public void declareRoles(String... strings) {

    }


    @Override
    public String getVirtualServerName() {

        return "";
    }


    @Override
    public int getSessionTimeout() {

        return 0;
    }


    @Override
    public void setSessionTimeout(int i) {

    }


    @Override
    public String getRequestCharacterEncoding() {

        return "";
    }


    @Override
    public void setRequestCharacterEncoding(String s) {

    }


    @Override
    public String getResponseCharacterEncoding() {

        return "";
    }


    @Override
    public void setResponseCharacterEncoding(String s) {

    }

}
