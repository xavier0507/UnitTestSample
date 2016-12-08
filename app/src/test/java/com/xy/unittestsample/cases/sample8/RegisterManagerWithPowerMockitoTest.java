package com.xy.unittestsample.cases.sample8;

import com.xy.unittestsample.sample8.IEmailRegister;
import com.xy.unittestsample.sample8.IMobileRegister;
import com.xy.unittestsample.sample8.RegisterManager;
import com.xy.unittestsample.sample8.RegistrationFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


/**
 * Created by Xavier Yin on 12/8/16.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(RegistrationFormat.class)
public class RegisterManagerWithPowerMockitoTest {

    @Test
    public void testRegisterIsEmail() throws Exception {
        // Arrange
        IEmailRegister mockEmailRegister = Mockito.mock(IEmailRegister.class);
        IMobileRegister mockMobileRegister = Mockito.mock(IMobileRegister.class);
        PowerMockito.mockStatic(RegistrationFormat.class);
        Mockito.when(RegistrationFormat.checkFormat(Mockito.anyString())).thenReturn(true);
        RegisterManager registerManager = new RegisterManager(mockEmailRegister, mockMobileRegister);

        // Act
        registerManager.register(Mockito.anyString());

        // Assert
        Mockito.verify(mockEmailRegister).emailRegister();
    }

    @Test
    public void testRegisterIsMobile() throws Exception {
        // Arrange
        IEmailRegister mockEmailRegister = Mockito.mock(IEmailRegister.class);
        IMobileRegister mockMobileRegister = Mockito.mock(IMobileRegister.class);
        PowerMockito.mockStatic(RegistrationFormat.class);
        Mockito.when(RegistrationFormat.checkFormat(Mockito.anyString())).thenReturn(false);
        RegisterManager registerManager = new RegisterManager(mockEmailRegister, mockMobileRegister);

        // Act
        registerManager.register(Mockito.anyString());

        // Assert
        Mockito.verify(mockMobileRegister).mobileRegister();
    }

    @Test
    public void testRegistrationFormatCheckFormatIsCalled() throws Exception {
        // Arrange
        IEmailRegister mockEmailRegister = Mockito.mock(IEmailRegister.class);
        IMobileRegister mockMobileRegister = Mockito.mock(IMobileRegister.class);
        PowerMockito.mockStatic(RegistrationFormat.class);
        Mockito.when(RegistrationFormat.checkFormat(Mockito.anyString())).thenReturn(false);
        RegisterManager registerManager = new RegisterManager(mockEmailRegister, mockMobileRegister);

        // Act
        registerManager.register(Mockito.anyString());

        // Assert
        PowerMockito.verifyStatic(Mockito.times(1));
        RegistrationFormat.checkFormat(Mockito.anyString());
    }
}
