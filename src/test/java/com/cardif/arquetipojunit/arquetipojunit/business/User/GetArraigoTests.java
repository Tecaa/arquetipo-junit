package com.cardif.arquetipojunit.arquetipojunit.business.User;

import com.cardif.arquetipojunit.arquetipojunit.business.UserBusinessImpls;
import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.siisimpleservice.RceiService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional // For entity manager
public class GetArraigoTests {

    @InjectMocks
    private UserBusinessImpls userBusinessImpls;

    @Mock
    private RceiService rceiService;
    @BeforeTestMethod
    public void setUp() {

    }

    @Test
    void ObtenerUsuariosArraigoCorrectamente() {
        Mockito.when(rceiService.GetRutsArraigo()).thenReturn(GetArraigoData.RutsArraigo);

        List<String> arraigos = userBusinessImpls.getArraigo();

        Assert.notEmpty(arraigos);
        Assert.isTrue(arraigos.size() == GetArraigoData.RutsArraigo.size());
        for (String arraigo: arraigos) {
            Assert.isTrue(GetArraigoData.RutsArraigo.stream().anyMatch(u -> u.getRut() == arraigo));
        }
    }
}