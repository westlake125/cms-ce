/*
 * Copyright 2000-2013 Enonic AS
 * http://www.enonic.com/license
 */

package com.enonic.cms.core.portal.datasource.executor;

import java.util.Locale;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.jdom.Document;

import com.enonic.cms.core.RequestParameters;
import com.enonic.cms.core.content.ContentEntity;
import com.enonic.cms.core.language.LanguageEntity;
import com.enonic.cms.core.portal.PageRequestType;
import com.enonic.cms.core.portal.PortalInstanceKey;
import com.enonic.cms.core.portal.VerticalSession;
import com.enonic.cms.core.portal.datasource.DataSourceType;
import com.enonic.cms.core.preview.PreviewContext;
import com.enonic.cms.core.resource.ResourceKey;
import com.enonic.cms.core.security.user.UserEntity;
import com.enonic.cms.core.structure.SiteEntity;
import com.enonic.cms.core.structure.SitePath;
import com.enonic.cms.core.structure.SiteProperties;
import com.enonic.cms.core.structure.menuitem.MenuItemEntity;
import com.enonic.cms.core.structure.page.Regions;
import com.enonic.cms.core.structure.page.Window;
import com.enonic.cms.core.structure.page.template.PageTemplateEntity;

public final class DataSourceExecutorContext
{
    private DataSourceType type;

    private HttpServletRequest httpRequest;

    private SitePath originalSitePath;

    private RequestParameters requestParameters;

    private PageRequestType pageRequestType;

    private PortalInstanceKey portalInstanceKey;

    private SiteEntity site;

    private SiteProperties siteProperties;

    private MenuItemEntity menuItem;

    private ContentEntity contentFromRequest;

    private PageTemplateEntity pageTemplate;

    private Window window;

    private Regions regions;

    private Boolean isPortletWindowRenderedInline = null;

    private Document portletDocument;

    private ResourceKey[] cssKeys;

    private PreviewContext previewContext;

    private DataSourceInvocationCache invocationCache;

    private String deviceClass;

    private VerticalSession verticalSession;

    private LanguageEntity language;

    private String profile;

    private UserEntity user;

    private Locale locale;

    private Properties rootProperties;

    public DataSourceType getDataSourceType()
    {
        return type;
    }

    public void setDataSourceType( final DataSourceType type )
    {
        this.type = type;
    }

    public SitePath getOriginalSitePath()
    {
        return originalSitePath;
    }

    public void setOriginalSitePath( SitePath originalSitePath )
    {
        this.originalSitePath = originalSitePath;
    }

    public RequestParameters getRequestParameters()
    {
        return requestParameters;
    }

    public void setRequestParameters( RequestParameters value )
    {
        this.requestParameters = value;
    }

    public PageRequestType getPageRequestType()
    {
        return pageRequestType;
    }

    public void setPageRequestType( PageRequestType value )
    {
        this.pageRequestType = value;
    }

    public SiteEntity getSite()
    {
        return site;
    }

    public SiteProperties getSiteProperties()
    {
        return siteProperties;
    }

    public MenuItemEntity getMenuItem()
    {
        return menuItem;
    }

    public ContentEntity getContentFromRequest()
    {
        return contentFromRequest;
    }

    public PageTemplateEntity getPageTemplate()
    {
        return pageTemplate;
    }

    public Window getWindow()
    {
        return window;
    }

    public void setWindow( Window window )
    {
        this.window = window;
    }

    public Regions getRegions()
    {
        return regions;
    }

    public void setRegions( Regions regions )
    {
        this.regions = regions;
    }

    public Document getPortletDocument()
    {
        return portletDocument;
    }

    public ResourceKey[] getCssKeys()
    {
        return cssKeys;
    }

    public PreviewContext getPreviewContext()
    {
        return previewContext;
    }

    public void setPreviewContext( PreviewContext previewContext )
    {
        this.previewContext = previewContext;
    }

    public boolean hasCssKeys()
    {
        return cssKeys != null && cssKeys.length > 0;
    }

    public void setSite( SiteEntity site )
    {
        this.site = site;
    }

    public void setSiteProperties( SiteProperties siteProperties )
    {
        this.siteProperties = siteProperties;
    }

    public void setMenuItem( MenuItemEntity menuItem )
    {
        this.menuItem = menuItem;
    }

    public void setContentFromRequest( ContentEntity contentFromRequest )
    {
        this.contentFromRequest = contentFromRequest;
    }

    public void setPageTemplate( PageTemplateEntity pageTemplate )
    {
        this.pageTemplate = pageTemplate;
    }

    public void setPortletDocument( Document value )
    {
        this.portletDocument = value;
    }

    public void setCssKeys( ResourceKey[] cssKeys )
    {
        this.cssKeys = cssKeys;
    }

    public DataSourceInvocationCache getInvocationCache()
    {
        return invocationCache;
    }

    public void setInvocationCache( DataSourceInvocationCache value )
    {
        this.invocationCache = value;
    }

    public String getDeviceClass()
    {
        return deviceClass;
    }

    public void setDeviceClass( String deviceClass )
    {
        this.deviceClass = deviceClass;
    }

    public VerticalSession getVerticalSession()
    {
        return verticalSession;
    }

    public void setVerticalSession( VerticalSession verticalSession )
    {
        this.verticalSession = verticalSession;
    }

    public LanguageEntity getLanguage()
    {
        return language;
    }

    public void setLanguage( LanguageEntity language )
    {
        this.language = language;
    }

    public HttpServletRequest getHttpRequest()
    {
        return httpRequest;
    }

    public void setHttpRequest( HttpServletRequest httpRequest )
    {
        this.httpRequest = httpRequest;
    }

    public String getProfile()
    {
        return profile;
    }

    public void setProfile( String profile )
    {
        this.profile = profile;
    }

    public UserEntity getUser()
    {
        return user;
    }

    public void setUser( UserEntity user )
    {
        this.user = user;
    }

    public PortalInstanceKey getPortalInstanceKey()
    {
        return portalInstanceKey;
    }

    public void setPortalInstanceKey( PortalInstanceKey portalInstanceKey )
    {
        this.portalInstanceKey = portalInstanceKey;
    }

    public Locale getLocale()
    {
        return locale;
    }

    public void setLocale( Locale locale )
    {
        this.locale = locale;
    }

    public Boolean isPortletWindowRenderedInline()
    {
        return isPortletWindowRenderedInline;
    }

    public void setPortletWindowRenderedInline( Boolean value )
    {
        isPortletWindowRenderedInline = value;
    }

    public Properties getRootProperties()
    {
        return rootProperties;
    }

    public void setRootProperties( final Properties rootProperties )
    {
        this.rootProperties = rootProperties;
    }
}
