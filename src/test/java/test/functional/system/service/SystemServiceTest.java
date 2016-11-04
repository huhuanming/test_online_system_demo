package test.functional.system.service;

import com.netflix.discovery.converters.Auto;
import com.thoughtworks.gaia.GaiaApplication;
import com.thoughtworks.gaia.common.constant.EnvProfile;
import com.thoughtworks.gaia.system.SystemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertTrue;

/**
 * Created by hwwei on 16/11/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(GaiaApplication.class)
@Rollback
@Transactional
@ActiveProfiles({EnvProfile.TEST})
public class SystemServiceTest {

    @Autowired
    private SystemService systemService;


    @Test
    public void test_update_status() throws Exception {

        systemService.updateOpenStatus(true);

        boolean status = systemService.getOpenStatus();
        assertTrue(status);

        systemService.updateOpenStatus(false);

        status = systemService.getOpenStatus();
        assertTrue(!status);
    }
}
