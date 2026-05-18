package n9;

import android.os.Handler;
import android.os.Looper;
import da.j;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j implements j.d {
    public final j.d a;
    public final Handler b;

    public j(j.d dVar) {
        t.g(dVar, "methodResult");
        this.a = dVar;
        this.b = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void d(j jVar, String str, String str2, Object obj) {
        g(jVar, str, str2, obj);
    }

    public static /* synthetic */ void e(j jVar) {
        h(jVar);
    }

    public static /* synthetic */ void f(j jVar, Object obj) {
        i(jVar, obj);
    }

    public static final void g(j jVar, String str, String str2, Object obj) {
        jVar.a.b(str, str2, obj);
    }

    public static final void h(j jVar) {
        jVar.a.c();
    }

    public static final void i(j jVar, Object obj) {
        jVar.a.a(obj);
    }

    public void a(Object obj) {
        this.b.post(new h(this, obj));
    }

    public void b(String str, String str2, Object obj) {
        t.g(str, "errorCode");
        this.b.post(new g(this, str, str2, obj));
    }

    public void c() {
        this.b.post(new i(this));
    }
}
