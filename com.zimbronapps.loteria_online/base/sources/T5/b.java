package t5;

import Ca.l;
import Ca.m;
import Ca.n;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class b {
    public static final l a = m.a(n.c, a.a);

    public static final class a extends u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final /* synthetic */ long a(Drawable drawable) {
        return c(drawable);
    }

    public static final /* synthetic */ Handler b() {
        return d();
    }

    public static final long c(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? u0.l.b.a() : u0.m.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static final Handler d() {
        return (Handler) a.getValue();
    }
}
