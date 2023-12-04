package com.rideapp.publishrideform.portlet.action;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.rideapp.publishride.model.rides;
import com.rideapp.publishride.model.vehicals;
import com.rideapp.publishride.service.ridesLocalService;
import com.rideapp.publishride.service.ridesLocalServiceUtil;
import com.rideapp.publishride.service.vehicalsLocalServiceUtil;
//import com.rideapp.publishrideform.constants.MVCCommandNames;
import com.rideapp.publishrideform.constants.Publish_ride_formPortletKeys;
import com.rideapp.publishrideform.portlet.Publish_ride_formPortlet;
//import com.rideapp.publishride.model.rides;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import aQute.bnd.annotation.component.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + Publish_ride_formPortletKeys.PUBLISH_RIDE_FORM,
		"mvc.command.name=/rideapp/createride/add" }, service = MVCActionCommand.class)
public class createRideMVCActionCommand implements MVCActionCommand {

	private static Log log = LogFactoryUtil.getLog(Publish_ride_formPortlet.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		// TODO Auto-generated method stub

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

//		ServiceContext serviceContext = ServiceContextFactory.getInstance(rides.class,actionRequest);

		rides ride = ridesLocalServiceUtil.createrides(CounterLocalServiceUtil.increment());

		String leavingLocation = ParamUtil.getString(actionRequest, "leavingLocation");
		ride.setLeavingLocation(leavingLocation);
		log.debug("Leaving Location : " + leavingLocation);
//			System.out.println("Leaving Location : " + leavingLocation);

		String headingLocation = ParamUtil.getString(actionRequest, "headingLocation");
		ride.setHeadingLocation(headingLocation);
		log.debug("Heading Location : " + headingLocation);
//			System.out.println("Heading Location : " + headingLocation);
		try {
			String arrivalDate = ParamUtil.getString(actionRequest, "createDate");
			String arrivalTime = ParamUtil.getString(actionRequest, "arrivalTime");
			String pattern = "yyyy-MM-dd HH:mm";
			SimpleDateFormat dateFormate = new SimpleDateFormat(pattern);

			Date date = dateFormate.parse(arrivalDate + " " + arrivalTime);
			ride.setArivalDate(date);
			log.debug("Create Date : " + arrivalDate + " " + arrivalTime);
//			System.out.println("Create Date : " + createDate);

		} catch (Exception e) {

			e.printStackTrace();
		}
//			
//			
		String seats = ParamUtil.getString(actionRequest, "seats");
		ride.setAvailableSeats(Integer.parseInt(seats));
		log.debug("arrivalTime : " + seats);
//			System.out.println("Heading Location : " + seats);
//
//			
		String comfortLevel = ParamUtil.getString(actionRequest, "comfortLevel");
		ride.setComfortLevel(comfortLevel);
		log.debug("arrivalTime : " + comfortLevel);
////			System.out.println("Heading Location : " + comfortLevel);
//			
//			
		String price = ParamUtil.getString(actionRequest, "Price");
		ride.setPrice(Float.parseFloat(price));
		log.debug("arrivalTime : " + price);
////			System.out.println("Heading Location : " + price);
//			

		vehicals vehicals = vehicalsLocalServiceUtil.createvehicals(CounterLocalServiceUtil.increment());
//			
		String carName = ParamUtil.getString(actionRequest, "carName");
		vehicals.setCarModel(carName);
		log.debug("arrivalTime : " + carName);
////			System.out.println("Heading Location : " + carName);
//			
//			
//			
//			
		String carPlateNumber = ParamUtil.getString(actionRequest, "carPlateNumber");
		vehicals.setPlateNumber(carPlateNumber);
		log.debug("arrivalTime : " + carPlateNumber);
////			System.out.println("Heading Location : " + carPlateNumber);
//			
//			
//			
		String seatingCapacity = ParamUtil.getString(actionRequest, "seatingCapacity");
		vehicals.setCapacity(Integer.parseInt(seatingCapacity));
		log.debug("seatingCapacity : " + seatingCapacity);
////			System.out.println("Heading Location : " + seatingCapacity);
//			
//			
//			
//			
		String carComfartLevel = ParamUtil.getString(actionRequest, "carComfartLevel");
		vehicals.setComfortLevel(carComfartLevel);
		log.debug("carComfartLevel : " + carComfartLevel);
////			System.out.println("Heading Location : " + carComfartLevel);
//			
		ridesLocalServiceUtil.addrides(ride);
		vehicalsLocalServiceUtil.addvehicals(vehicals);

		return true;
	}

//	@Resource
//	protected ridesService _ridesService;

}
