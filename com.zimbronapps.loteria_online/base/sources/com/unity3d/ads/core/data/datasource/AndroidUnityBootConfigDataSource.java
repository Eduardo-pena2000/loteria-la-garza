package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.s;
import Na.q;
import Za.c;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {
    private final Context context;

    public AndroidUnityBootConfigDataSource(Context context) {
        t.g(context, "context");
        this.context = context;
    }

    public String getValue(String key) {
        Object b;
        t.g(key, "key");
        try {
            s.a aVar = s.b;
            String str = key + '=';
            O o = new O();
            InputStream stream = this.context.getAssets().open("bin/Data/boot.config");
            try {
                t.f(stream, "stream");
                q.c(new BufferedReader(new InputStreamReader(stream, c.b), 8192), new AndroidUnityBootConfigDataSource$getValue$1$1$1(str, o));
                I i = I.a;
                Na.c.a(stream, null);
                b = s.b((String) o.a);
            } finally {
            }
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(Ca.t.a(th));
        }
        return (String) (s.g(b) ? null : b);
    }
}
