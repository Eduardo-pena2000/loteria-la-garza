package dev.fluttercommunity.plus.share;

import android.content.Context;
import android.content.Intent;
import da.j;
import da.l;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a implements l {
    public static final a d = new a(null);
    public final Context a;
    public j.d b;
    public AtomicBoolean c;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public a(Context context) {
        t.g(context, "context");
        this.a = context;
        this.c = new AtomicBoolean(true);
    }

    public final void a() {
        this.c.set(true);
        this.b = null;
    }

    public final void b(String str) {
        j.d dVar;
        if (!this.c.compareAndSet(false, true) || (dVar = this.b) == null) {
            return;
        }
        t.d(dVar);
        dVar.a(str);
        this.b = null;
    }

    public final void c(j.d callback) {
        t.g(callback, "callback");
        if (this.c.compareAndSet(true, false)) {
            SharePlusPendingIntent.a.b("");
            this.c.set(false);
            this.b = callback;
        } else {
            j.d dVar = this.b;
            if (dVar != null) {
                dVar.a("dev.fluttercommunity.plus/share/unavailable");
            }
            SharePlusPendingIntent.a.b("");
            this.c.set(false);
            this.b = callback;
        }
    }

    public final void d() {
        b("dev.fluttercommunity.plus/share/unavailable");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 22643) {
            return false;
        }
        b(SharePlusPendingIntent.a.a());
        return true;
    }
}
