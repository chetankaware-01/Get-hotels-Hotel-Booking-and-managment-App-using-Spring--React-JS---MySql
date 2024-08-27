package com.gethotles.GetHotels.service.interfac;

import com.gethotles.GetHotels.dto.Response;
import com.gethotles.GetHotels.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
