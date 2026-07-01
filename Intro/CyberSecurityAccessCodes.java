package Intro;

import java.util.Random;

public class CyberSecurityAccessCodes {
    public static void main(String[] args) {
        final int PIN_MIN = 1000;
        final int PIN_MAX = 9999;

        final int TOKEN_MIN = 1;
        final int TOKEN_MAX = 100;

        final int ADMIN_MIN = 5000;
        final int ADMIN_MAX = 9999;

        final int BYTE_MIN = 0;
        final int BYTE_MAX = 255;

        final int AUDIT_MIN = 0;
        final int AUDIT_MAX = 99999;

        Random rand = new Random();

        int code1 = rand.nextInt(PIN_MAX - PIN_MIN + 1) + PIN_MIN;
        int code2 = rand.nextInt(TOKEN_MAX - TOKEN_MIN + 1) + TOKEN_MIN;
        int code3 = rand.nextInt(ADMIN_MAX - ADMIN_MIN + 1) + ADMIN_MIN;
        int code4 = rand.nextInt(BYTE_MAX - BYTE_MIN + 1) + BYTE_MIN;
        int code5 = rand.nextInt(AUDIT_MAX - AUDIT_MIN + 1) + AUDIT_MIN;

        System.out.println("Generated Access Codes:");
        System.out.println("Login PIN: " + code1);
        System.out.println("Session Token: " + code2);
        System.out.println("Admin Override: " + code3);
        System.out.println("Encryption Key Byte: " + code4);
        System.out.println("Audit Trail ID: " + code5);
    }
}