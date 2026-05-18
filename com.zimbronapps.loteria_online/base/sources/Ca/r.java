package ca;

import da.j;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class r {
    public final boolean a;
    public byte[] b;
    public da.j c;
    public j.d d;
    public boolean e;
    public boolean f;
    public final j.c g;

    public class b implements j.c {
        public b() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            String str = iVar.a;
            Object obj = iVar.b;
            str.hashCode();
            if (!str.equals("get")) {
                if (!str.equals("put")) {
                    dVar.c();
                    return;
                } else {
                    r.b(r.this, (byte[]) obj);
                    dVar.a(null);
                    return;
                }
            }
            r.c(r.this, true);
            if (!r.d(r.this)) {
                r rVar = r.this;
                if (rVar.a) {
                    r.f(rVar, dVar);
                    return;
                }
            }
            r rVar2 = r.this;
            dVar.a(r.e(rVar2, r.a(rVar2)));
        }
    }

    public r(T9.a aVar, boolean z) {
        this(new da.j(aVar, "flutter/restoration", da.p.b), z);
    }

    public static /* synthetic */ byte[] a(r rVar) {
        return rVar.b;
    }

    public static /* synthetic */ byte[] b(r rVar, byte[] bArr) {
        rVar.b = bArr;
        return bArr;
    }

    public static /* synthetic */ boolean c(r rVar, boolean z) {
        rVar.f = z;
        return z;
    }

    public static /* synthetic */ boolean d(r rVar) {
        return rVar.e;
    }

    public static /* synthetic */ Map e(r rVar, byte[] bArr) {
        return rVar.i(bArr);
    }

    public static /* synthetic */ j.d f(r rVar, j.d dVar) {
        rVar.d = dVar;
        return dVar;
    }

    public void g() {
        this.b = null;
    }

    public byte[] h() {
        return this.b;
    }

    public final Map i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void j(byte[] bArr) {
        this.e = true;
        j.d dVar = this.d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.d = null;
            this.b = bArr;
        } else if (this.f) {
            this.c.d("push", i(bArr), new a(bArr));
        } else {
            this.b = bArr;
        }
    }

    public r(da.j jVar, boolean z) {
        this.e = false;
        this.f = false;
        b bVar = new b();
        this.g = bVar;
        this.c = jVar;
        this.a = z;
        jVar.e(bVar);
    }

    public class a implements j.d {
        public final /* synthetic */ byte[] a;

        public a(byte[] bArr) {
            this.a = bArr;
        }

        public void a(Object obj) {
            r.b(r.this, this.a);
        }

        public void b(String str, String str2, Object obj) {
            Q9.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        public void c() {
        }
    }
}
