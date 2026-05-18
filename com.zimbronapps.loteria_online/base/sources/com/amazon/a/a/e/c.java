package com.amazon.a.a.e;

import java.util.Date;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c extends a {
    private static final com.amazon.a.a.o.c b = new com.amazon.a.a.o.c("RelativeExpirable");
    private static final long c = 1000;
    private final Date d = new Date();

    public final Date a() {
        com.amazon.a.a.o.c cVar = b;
        cVar.a("RelativeExpiration duration: " + h() + ", expirable: " + this);
        Date date = new Date(this.d.getTime() + (h() * 1000));
        StringBuilder sb = new StringBuilder();
        sb.append("Expiration should occur at time: ");
        sb.append(date);
        cVar.a(sb.toString());
        return date;
    }

    public abstract long h();
}
