package com.cardif.arquetipojunit.arquetipojunit.business.User;

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
/**
 * Clase UserBusiness
 * Método Get
 */
public class GetTests {


    @Autowired
    private UserBusiness userBusiness;

    @PersistenceContext
    private EntityManager em;

    @Test
    /**
     * Testeamos el método para obtener el listado de usuarios.
     */
    void ObtenerUsuariosCorrectamente() {
        // Arrange
        GetData.Users.forEach(u ->{
            em.merge(u);
        });

        // Act
        List<AppUserDto> users = userBusiness.get();

        // Assert
        Assert.notEmpty(users);
        Assert.isTrue (users.size() == GetData.Users.size());
        for (AppUserDto user: users) {
            Assert.isTrue(GetData.Users.stream().anyMatch(u -> u.getId() == user.Id));
        }
    }
}