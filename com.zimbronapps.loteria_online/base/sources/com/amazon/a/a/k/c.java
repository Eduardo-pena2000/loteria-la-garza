package com.amazon.a.a.k;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c implements b {
    public static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("ResourceManagerImpl");
    private List b = new ArrayList();
    private boolean c = false;

    public c() {
        a(this);
    }

    private boolean c(Object obj) {
        com.amazon.a.a.o.a.a.a(obj, "resource");
        return a(obj.getClass()) != null;
    }

    private boolean d(Object obj) {
        return obj.getClass().getName().startsWith("com.amazon.");
    }

    public void a(Object obj) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Registering resource: " + obj);
        }
        com.amazon.a.a.o.a.a.a();
        if (this.c) {
            throw new IllegalStateException("Attempt made to register resource after population has begun!");
        }
        com.amazon.a.a.o.a.a.b(c(obj), "Resource already registered: " + obj);
        this.b.add(obj);
    }

    public void b(Object obj) {
        com.amazon.a.a.o.a.a.a(obj, "target");
        if (com.amazon.a.a.o.c.a) {
            a.a("Populating: " + obj);
        }
        if (!d(obj)) {
            a.a("Ignoring: " + obj + ", not a kiwi class");
            return;
        }
        for (Class cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                if (a(field)) {
                    a(obj, field);
                }
            }
        }
        if (obj instanceof d) {
            ((d) obj).e();
        }
    }

    private Object a(Class cls) {
        for (Object obj : this.b) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    private boolean a(Field field) {
        return field.getAnnotation(a.class) != null;
    }

    private void a(Object obj, Field field) {
        Class type = field.getType();
        Object a2 = a(type);
        com.amazon.a.a.o.a.a.b(a2, "no resource found for type: " + type);
        field.setAccessible(true);
        try {
            field.set(obj, a2);
        } catch (Exception e) {
            com.amazon.a.a.o.a.a.a("Failed to populate field: " + field, (Throwable) e);
        }
    }

    public void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
