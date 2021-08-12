package com.hxh.demo9;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class JasyptTest extends BasicTests {
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    public void testSecret() {
        // 加密
        for (int i = 0; i < 10; i++) {
            String encrypt = stringEncryptor.encrypt("root");
            System.out.println("root encrypt:" + encrypt);
            String encrypt2 = stringEncryptor.encrypt("password");
            System.out.println("password encrypt:" + encrypt2);

            String decrypt = stringEncryptor.decrypt(encrypt);
            System.out.println("password decrypt:" + decrypt);
        }

        System.out.println("host:" + stringEncryptor.encrypt("localhost"));
    }
}
