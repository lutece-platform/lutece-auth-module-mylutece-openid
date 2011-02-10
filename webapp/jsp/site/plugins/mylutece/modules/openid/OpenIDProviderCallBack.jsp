<jsp:useBean id="openid" scope="application" class="fr.paris.lutece.plugins.mylutece.modules.openid.authentication.OpenIDAuthentication" />

<%
    response.sendRedirect( openid.verifyResponse( request ));
%>
