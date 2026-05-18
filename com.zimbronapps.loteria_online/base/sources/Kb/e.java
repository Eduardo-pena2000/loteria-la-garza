package kb;

import Qa.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e implements d {
    public final Object a;
    public final q b;
    public final q c;
    public final q d;

    public e(Object obj, q qVar, q qVar2) {
        this.a = obj;
        this.b = qVar;
        this.c = qVar2;
        this.d = k.c();
    }

    public q a() {
        return this.b;
    }

    public q b() {
        return this.c;
    }

    public q c() {
        return this.d;
    }

    public Object d() {
        return this.a;
    }

    public /* synthetic */ e(Object obj, q qVar, q qVar2, int i, kotlin.jvm.internal.k kVar) {
        this(obj, qVar, (i & 4) != 0 ? null : qVar2);
    }
}
