package com.netease.esp.cosplay.util;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
* A manager for the CSRF token for a given session. The {@link #getTokenForSession(HttpSession)} should used to
* obtain the token value for the current session (and this should be the only way to obtain the token value).
* ***/

public final class CSRFTokenManager {

    /**
     * The token parameter name
     */
    static final String CSRF_PARAM_NAME = "CSRFToken";
    
    public static String getTokenForSession(HttpSession session) {
        String token = null;
        
        // I cannot allow more than one token on a session - in the case of two
        // requests trying to
        // init the token concurrently
        synchronized (session) {
            token = (String) session
                    .getAttribute(CSRF_PARAM_NAME);
            if (null == token) {
                token = UUID.randomUUID().toString();
                session.setAttribute(CSRF_PARAM_NAME, token);
            }
        }
        return token;
    }

    /**
     * Extracts the token value from the session
     * 
     * @param request
     * @return
     */
    public static String getTokenFromRequest(HttpServletRequest request) {
        return request.getParameter(CSRF_PARAM_NAME);
    }

    private CSRFTokenManager() {
    };

}