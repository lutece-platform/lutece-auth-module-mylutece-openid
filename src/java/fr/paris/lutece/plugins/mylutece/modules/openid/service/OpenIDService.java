package fr.paris.lutece.plugins.mylutece.modules.openid.service;

import fr.paris.lutece.plugins.mylutece.authentication.MultiLuteceAuthentication;
import fr.paris.lutece.plugins.mylutece.modules.openid.authentication.OpenIDAuthentication;
import fr.paris.lutece.portal.service.spring.SpringContextService;
import fr.paris.lutece.portal.service.util.AppLogService;

/**
 * 
 * OpenIDService
 */
public final class OpenIDService
{
	private static final OpenIDService _singleton = new OpenIDService(  );
	private static final String AUTHENTICATION_BEAN_NAME = "mylutece-openid.authentication";

	/**
	 * 
	 * empty constructor.
	 */
	private OpenIDService(  )
	{
		// empty constructor
	}
	
	/**
	 * The instance
	 * @return the instance
	 */
	public static OpenIDService getInstance(  )
	{
		return _singleton;
	}
	
	/**
	 * 
	 * Init the plugin.
	 */
	public void init(  )
	{
		OpenIDAuthentication authentication = ( OpenIDAuthentication ) SpringContextService.getPluginBean( OpenIDPlugin.PLUGIN_NAME, 
				AUTHENTICATION_BEAN_NAME );
		if ( authentication != null )
		{
			MultiLuteceAuthentication.registerAuthentication( authentication );
		}
		else
		{
			AppLogService.error( "OpenIDAuthentication not found, please check your openid_context.xml configuration" );
		}
		
	}
}
