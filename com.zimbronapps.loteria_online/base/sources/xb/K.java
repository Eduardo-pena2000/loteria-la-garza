package xb;

import Da.S;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class k {
    public final boolean a;
    public final boolean b;
    public final C c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public k(boolean z, boolean z2, C c, Long l, Long l2, Long l3, Long l4, Map extras) {
        kotlin.jvm.internal.t.g(extras, "extras");
        this.a = z;
        this.b = z2;
        this.c = c;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = S.z(extras);
    }

    public static /* synthetic */ k b(k kVar, boolean z, boolean z2, C c, Long l, Long l2, Long l3, Long l4, Map map, int i, Object obj) {
        return kVar.a((i & 1) != 0 ? kVar.a : z, (i & 2) != 0 ? kVar.b : z2, (i & 4) != 0 ? kVar.c : c, (i & 8) != 0 ? kVar.d : l, (i & 16) != 0 ? kVar.e : l2, (i & 32) != 0 ? kVar.f : l3, (i & 64) != 0 ? kVar.g : l4, (i & 128) != 0 ? kVar.h : map);
    }

    public final k a(boolean z, boolean z2, C c, Long l, Long l2, Long l3, Long l4, Map extras) {
        kotlin.jvm.internal.t.g(extras, "extras");
        return new k(z, z2, c, l, l2, l3, l4, extras);
    }

    public final Long c() {
        return this.f;
    }

    public final Long d() {
        return this.d;
    }

    public final C e() {
        return this.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        return this.a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        if (this.d != null) {
            arrayList.add("byteCount=" + this.d);
        }
        if (this.e != null) {
            arrayList.add("createdAt=" + this.e);
        }
        if (this.f != null) {
            arrayList.add("lastModifiedAt=" + this.f);
        }
        if (this.g != null) {
            arrayList.add("lastAccessedAt=" + this.g);
        }
        if (!this.h.isEmpty()) {
            arrayList.add("extras=" + this.h);
        }
        return Da.D.n0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ k(boolean z, boolean z2, C c, Long l, Long l2, Long l3, Long l4, Map map, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : c, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) == 0 ? l4 : null, (i & 128) != 0 ? S.h() : map);
    }
}
