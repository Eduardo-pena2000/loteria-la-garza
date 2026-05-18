package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.k;
import v0.b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final a b = new a(null);
    public final ColorFilter a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public static /* synthetic */ d b(a aVar, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = c.b.z();
            }
            return aVar.a(j, i);
        }

        public final d a(long j, int i) {
            return new b0(j, i, (k) null);
        }

        public a() {
        }
    }

    public d(ColorFilter colorFilter) {
        this.a = colorFilter;
    }

    public final ColorFilter a() {
        return this.a;
    }
}
