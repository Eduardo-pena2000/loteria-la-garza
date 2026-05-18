package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class k implements f {
    public w9.c a;
    public Map b = new ConcurrentHashMap();
    public v9.a c;
    public d d;

    public class a implements Runnable {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        public void run() {
            k.this.c.a(this.a);
        }
    }

    public k(d dVar) {
        this.d = dVar;
    }

    public void a(Context context, String str, v9.d dVar, w9.b bVar) {
        this.a.a(context, str, dVar, bVar);
    }

    public void b(Context context, boolean z, w9.b bVar) {
        this.a.b(context, z, bVar);
    }

    public void c(Context context, List list, w9.b bVar) {
        this.a.c(context, list, bVar);
    }

    public void e(Activity activity, String str, String str2) {
        v9.a aVar = (v9.a) this.b.get(str2);
        if (aVar != null) {
            this.c = aVar;
            l.a(new a(activity));
            return;
        }
        this.d.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
