package fr.paris.lutece.plugins.mylutece.modules.openid.service;

import fr.paris.lutece.portal.service.plugin.PluginDefaultImplementation;

public class OpenIDPlugin extends PluginDefaultImplementation
{
	public static final String PLUGIN_NAME = "mylutece-openid";
	@Override
	public void init()
	{
		super.init();
		OpenIDService.getInstance(  ).init(  );
	}
}
