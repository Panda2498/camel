/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.sheets.stream;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleSheetsStreamComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration getOrCreateConfiguration(GoogleSheetsStreamComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleSheetsStreamComponent target = (GoogleSheetsStreamComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": getOrCreateConfiguration(target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.setClientFactory(property(camelContext, org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": getOrCreateConfiguration(target).setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration.class, value)); return true;
        case "includegriddata":
        case "includeGridData": getOrCreateConfiguration(target).setIncludeGridData(property(camelContext, boolean.class, value)); return true;
        case "majordimension":
        case "majorDimension": getOrCreateConfiguration(target).setMajorDimension(property(camelContext, java.lang.String.class, value)); return true;
        case "maxresults":
        case "maxResults": getOrCreateConfiguration(target).setMaxResults(property(camelContext, int.class, value)); return true;
        case "range": getOrCreateConfiguration(target).setRange(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": getOrCreateConfiguration(target).setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": getOrCreateConfiguration(target).setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "splitresults":
        case "splitResults": getOrCreateConfiguration(target).setSplitResults(property(camelContext, boolean.class, value)); return true;
        case "spreadsheetid":
        case "spreadsheetId": getOrCreateConfiguration(target).setSpreadsheetId(property(camelContext, java.lang.String.class, value)); return true;
        case "valuerenderoption":
        case "valueRenderOption": getOrCreateConfiguration(target).setValueRenderOption(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

