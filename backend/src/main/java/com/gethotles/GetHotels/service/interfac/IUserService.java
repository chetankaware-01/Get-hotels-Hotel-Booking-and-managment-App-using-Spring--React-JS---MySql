package com.gethotles.GetHotels.service.interfac;

import com.gethotles.GetHotels.dto.LoginRequest;
import com.gethotles.GetHotels.dto.Response;
import com.gethotles.GetHotels.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
