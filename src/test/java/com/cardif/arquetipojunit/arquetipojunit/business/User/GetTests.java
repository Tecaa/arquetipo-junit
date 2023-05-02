package com.cardif.arquetipojunit.arquetipojunit.business.User;

import com.cardif.arquetipojunit.arquetipojunit.business.User.GetData;
import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.arquetipojunit.ibusiness.UserBusiness;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional // For entity manager
public class GetTests {


    @Autowired
    private UserBusiness userBusiness;

    @PersistenceContext
    private EntityManager em;

    @Test
    void ObtenerListaCompletaUsuariosCorrectamente() {
        GetData.Users.forEach(u ->{
            em.merge(u);
        });

        List<AppUserDto> users = userBusiness.get();

        Assert.notEmpty(users);
    }
}