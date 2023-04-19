package com.cardif.arquetipojunit.arquetipojunit.business.User.Get;

import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.arquetipojunit.ibusiness.UserBusiness;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class GetTests {


    @Autowired
    private UserBusiness userBusiness;

    @Test
    void ObtenerListaCompletaUsuariosCorrectamente() {
        List<AppUserDto> users = userBusiness.Get();

        Assert.notEmpty(users);
    }
}