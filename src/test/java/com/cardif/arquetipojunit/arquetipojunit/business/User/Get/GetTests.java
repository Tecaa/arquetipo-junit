package com.cardif.arquetipojunit.arquetipojunit.business.User.Get;

import com.cardif.arquetipojunit.arquetipojunit.business.UserBusinessImpls;
import com.cardif.arquetipojunit.arquetipojunit.dtos.UserDto;
import com.cardif.arquetipojunit.arquetipojunit.ibusiness.UserBusiness;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
//@ContextConfiguration(locations = "classpath*:/spring/applicationContext*.xml")
public class GetTests {


    @Autowired
    private UserBusiness userBusiness;

    @Test
    void ObtenerListaCompletaUsuariosCorrectamente() {
        List<UserDto> users = userBusiness.Get();

        Assert.notEmpty(users);
    }
}