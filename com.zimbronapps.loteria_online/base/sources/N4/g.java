package N4;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g {
    public static g e;
    public a a;
    public b b;
    public e c;
    public f d;

    public g(Context context, S4.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new a(applicationContext, aVar);
        this.b = new b(applicationContext, aVar);
        this.c = new e(applicationContext, aVar);
        this.d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, S4.a aVar) {
        g gVar;
        synchronized (g.class) {
            try {
                if (e == null) {
                    e = new g(context, aVar);
                }
                gVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public a a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }

    public e d() {
        return this.c;
    }

    public f e() {
        return this.d;
    }
}
