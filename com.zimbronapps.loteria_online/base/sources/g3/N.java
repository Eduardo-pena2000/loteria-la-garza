package g3;

import L3.s;
import R2.f;
import R2.k;
import android.content.Context;
import g3.w;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n implements w.a {
    public final a a;
    public f.a b;
    public s.a c;
    public long d;
    public long e;
    public long f;
    public float g;
    public float h;
    public boolean i;

    public static final class a {
        public final o3.u a;
        public f.a d;
        public s.a f;
        public final Map b = new HashMap();
        public final Map c = new HashMap();
        public boolean e = true;

        public a(o3.u uVar, s.a aVar) {
            this.a = uVar;
            this.f = aVar;
        }

        public void a(f.a aVar) {
            if (aVar != this.d) {
                this.d = aVar;
                this.b.clear();
                this.c.clear();
            }
        }
    }

    public n(Context context, o3.u uVar) {
        this(new k.a(context), uVar);
    }

    public n(f.a aVar, o3.u uVar) {
        this.b = aVar;
        L3.h hVar = new L3.h();
        this.c = hVar;
        a aVar2 = new a(uVar, hVar);
        this.a = aVar2;
        aVar2.a(aVar);
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }
}
