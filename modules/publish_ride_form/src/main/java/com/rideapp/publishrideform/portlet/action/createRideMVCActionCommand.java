package com.rideapp.publishrideform.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
//import com.rideapp.publishrideform.constants.MVCCommandNames;
import com.rideapp.publishrideform.constants.Publish_ride_formPortletKeys;
import com.rideapp.publishrideform.portlet.Publish_ride_formPortlet;
import com.rideapp.publishride.model.rides;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import aQute.bnd.annotation.component.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + Publish_ride_formPortletKeys.PUBLISH_RIDE_FORM,
		"mvc.command.name=/rideapp/createride/add" }, service = MVCActionCommand.class)
public class createRideMVCActionCommand implements MVCActionCommand{

	private static Log log = LogFactoryUtil.getLog(Publish_ride_formPortlet.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		// TODO Auto-generated method stub


		ThemeDisplay themeDisplay =
			(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

//		ServiceContext serviceContext = ServiceContextFactory.getInstance(rides.class,actionRequest);
		String leavingLocation = ParamUtil.getString(actionRequest, "leavingLocation");
		log.debug("Leaving Location : "+leavingLocation);
		System.out.println("Leaving Location : "+leavingLocation);
		
		
		String headingLocation = ParamUtil.getString(actionRequest, "headingLocation");
		log.debug("Heading Location : "+headingLocation);
		System.out.println("Heading Location : "+headingLocation);
		
		String createDate = ParamUtil.getString(actionRequest, "createDate");
		log.debug("Create Date : "+createDate);
		System.out.println("Create Date : "+createDate);
		
		return true;
	}

	
	
}
