package com.amazon.a.a.o.c;

import com.amazon.a.a.o.c;
import com.amazon.a.a.o.c.a.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a {
    private static final c a = new c("Serializer");
    private static final Class[] b = {com.amazon.a.a.b.c.class, String.class, HashMap.class, LinkedHashMap.class};

    public static String a(Serializable serializable) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        if (serializable == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                try {
                    objectOutputStream.writeObject(serializable);
                    String a2 = com.amazon.c.a.a.c.a(byteArrayOutputStream.toByteArray());
                    com.amazon.a.a.o.a.a((OutputStream) objectOutputStream);
                    return a2;
                } catch (IOException e) {
                    e = e;
                    if (c.b) {
                        a.b("Could not serialize object: " + serializable, e);
                    }
                    com.amazon.a.a.o.a.a((OutputStream) objectOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                objectOutputStream2 = objectOutputStream;
                com.amazon.a.a.o.a.a((OutputStream) objectOutputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.amazon.a.a.o.a.a((OutputStream) objectOutputStream2);
            throw th;
        }
    }

    public static Object a(String str) {
        f fVar;
        f fVar2 = null;
        r0 = null;
        Object obj = null;
        if (str != null && str.length() != 0) {
            try {
                try {
                    fVar = new f(new ByteArrayInputStream(com.amazon.c.a.a.c.c(str.getBytes())));
                    try {
                        try {
                            fVar.a(b);
                            obj = fVar.readObject();
                        } catch (Exception e) {
                            e = e;
                            if (c.b) {
                                a.b("Could not read object from string: " + str, e);
                            }
                            com.amazon.a.a.o.a.a((InputStream) fVar);
                            return obj;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fVar2 = fVar;
                        com.amazon.a.a.o.a.a((InputStream) fVar2);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    com.amazon.a.a.o.a.a((InputStream) fVar2);
                    throw th;
                }
                com.amazon.a.a.o.a.a((InputStream) fVar);
                return obj;
            } catch (IOException e3) {
                if (c.b) {
                    a.b("Could not decode string", e3);
                }
            }
        }
        return null;
    }
}
