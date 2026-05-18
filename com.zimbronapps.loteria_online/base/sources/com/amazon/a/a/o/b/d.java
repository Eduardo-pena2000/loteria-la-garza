package com.amazon.a.a.o.b;

import android.app.Application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d implements b {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("DataAuthenticationKeyLoaderV3");
    private static final String b = "AppstoreAuthenticationKey.pem";
    private static final String c = "-----BEGIN PUBLIC KEY-----";
    private static final String d = "-----END PUBLIC KEY-----";
    private static final String e = "RSA";

    @com.amazon.a.a.k.a
    private Application f;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c g;

    private PublicKey b() {
        if (com.amazon.a.a.o.c.a) {
            a.a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.g.a("DATA_AUTHENTICATION_KEY");
        if (com.amazon.a.a.o.c.a) {
            com.amazon.a.a.o.c cVar = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Key was cached: ");
            sb.append(publicKey != null);
            cVar.a(sb.toString());
        }
        return publicKey;
    }

    private PublicKey c() throws com.amazon.a.a.o.b.a.a {
        if (com.amazon.a.a.o.c.a) {
            a.a("Loading authentication key from apk...");
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f.getAssets().open("AppstoreAuthenticationKey.pem")));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            try {
                                break;
                            } catch (IOException e2) {
                                if (com.amazon.a.a.o.c.a) {
                                    a.b("Failed to close stream", e2);
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        a.b("Unable to load authentication Key", e);
                        throw com.amazon.a.a.o.b.a.a.d();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                if (com.amazon.a.a.o.c.a) {
                                    a.b("Failed to close stream", e4);
                                }
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                return a(sb.toString());
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public PublicKey a() throws com.amazon.a.a.o.b.a.a {
        if (com.amazon.a.a.o.c.a) {
            a.a("Loading data authentication key...");
        }
        PublicKey b2 = b();
        if (b2 != null) {
            return b2;
        }
        PublicKey c2 = c();
        a(c2);
        return c2;
    }

    private void a(PublicKey publicKey) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Placing auth key into storage");
        }
        this.g.a("DATA_AUTHENTICATION_KEY", publicKey);
    }

    public PublicKey a(String str) throws com.amazon.a.a.o.b.a.a {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(com.amazon.c.a.a.c.a(str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""))));
        } catch (Exception e2) {
            throw com.amazon.a.a.o.b.a.a.a((Throwable) e2);
        }
    }
}
