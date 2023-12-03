package com.rideapp.publishrideform.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.rideapp.publishrideform.constants.Publish_ride_formPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + Publish_ride_formPortletKeys.PUBLISH_RIDE_FORM,
			"mvc.command.name=/rideapp/createride/add"
		}, 
		service = MVCRenderCommand.class
	)
public class createRideMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/rides/createRide.jsp";
	}

	
}
