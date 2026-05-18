package A9;

import android.content.Context;
import v9.d;
import w9.c;
import w9.e;
import w9.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b extends e implements c {
    public y9.a a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(y9.a aVar) {
        this.a = aVar;
    }

    public void d(Context context, String str, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        e6.a.a(context, g(dVar), this.a.a(), new A9.a(str, new w9.d(aVar, fVar)));
    }

    public void e(Context context, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        d(context, f(dVar), dVar, aVar, fVar);
    }

    public L5.c g(d dVar) {
        int i = a.a[dVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? L5.c.UNKNOWN : L5.c.d : L5.c.c : L5.c.b;
    }
}
