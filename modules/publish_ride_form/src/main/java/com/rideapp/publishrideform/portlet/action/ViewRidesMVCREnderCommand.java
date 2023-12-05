package com.rideapp.publishrideform.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.rideapp.publishride.model.rides;
import com.rideapp.publishride.service.ridesLocalServiceUtil;
import com.rideapp.publishrideform.constants.Publish_ride_formPortletKeys;
import com.rideapp.publishrideform.portlet.Publish_ride_formPortlet;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + Publish_ride_formPortletKeys.PUBLISH_RIDE_FORM,
		"mvc.command.name=/", "mvc.command.name=/rideapp/createride/add"

}, service = MVCRenderCommand.class)
public class ViewRidesMVCREnderCommand implements MVCRenderCommand {
//
//	private static Log log = LogFactoryUtil.getLog(Publish_ride_formPortlet.class);
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		try {
			List<rides> ride = ridesLocalServiceUtil.getrideses(0, -1);
//		for (rides r : ride) {
//			System.out.println("Leaving : "+r.getLeavingLocation());
//			System.out.println("Heading : "+r.getHeadingLocation());
//			System.out.println("Date : "+r.getArivalDate());
//			System.out.println("Seats : "+r.getAvailableSeats());
//			System.out.println("Comfort : "+r.getComfortLevel());
//			System.out.println("Price : "+r.getPrice());
//		}
		if (ride != null) {
			renderRequest.setAttribute("r", ride);
		} else {
		    _log.warn("No rides found");
		}
	 } catch (Exception e) {
         _log.error("Error fetching rides data", e);
     }
		return "/view.jsp";
	}
	  private static final Log _log = LogFactoryUtil.getLog(ViewRidesMVCREnderCommand.class);


}
