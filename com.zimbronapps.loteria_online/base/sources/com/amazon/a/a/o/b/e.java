package com.amazon.a.a.o.b;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e {
    public static final String a = "SHA384withRSA";
    private static final com.amazon.a.a.o.c b = new com.amazon.a.a.o.c("SignatureVerifier");

    public static boolean a(String str, String str2, PublicKey publicKey) {
        if (com.amazon.a.a.o.c.a) {
            b.a("Verifying signature of data: '" + str + "', signature: '" + str2 + "', with key: '" + publicKey.toString());
        }
        try {
            byte[] c = com.amazon.c.a.a.c.c(str2.getBytes());
            Signature signature = Signature.getInstance("SHA384withRSA");
            signature.initVerify(publicKey);
            signature.update(str.getBytes());
            return signature.verify(c);
        } catch (GeneralSecurityException | IOException unused) {
            return false;
        }
    }
}
