package N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w {
    public static final a g = new a(null);
    public static final w h = new w(null, null, null, null, null, null, 63, null);
    public final Qa.l a;
    public final Qa.l b;
    public final Qa.l c;
    public final Qa.l d;
    public final Qa.l e;
    public final Qa.l f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final w a() {
            return w.a();
        }

        public a() {
        }
    }

    public w(Qa.l lVar, Qa.l lVar2, Qa.l lVar3, Qa.l lVar4, Qa.l lVar5, Qa.l lVar6) {
        this.a = lVar;
        this.b = lVar2;
        this.c = lVar3;
        this.d = lVar4;
        this.e = lVar5;
        this.f = lVar6;
    }

    public static final /* synthetic */ w a() {
        return h;
    }

    public final Qa.l b() {
        return this.a;
    }

    public final Qa.l c() {
        return this.b;
    }

    public final Qa.l d() {
        return this.c;
    }

    public final Qa.l e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a == wVar.a && this.b == wVar.b && this.c == wVar.c && this.d == wVar.d && this.e == wVar.e && this.f == wVar.f;
    }

    public final Qa.l f() {
        return this.e;
    }

    public final Qa.l g() {
        return this.f;
    }

    public int hashCode() {
        Qa.l lVar = this.a;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        Qa.l lVar2 = this.b;
        int hashCode2 = (hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        Qa.l lVar3 = this.c;
        int hashCode3 = (hashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        Qa.l lVar4 = this.d;
        int hashCode4 = (hashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        Qa.l lVar5 = this.e;
        int hashCode5 = (hashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        Qa.l lVar6 = this.f;
        return hashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }

    public /* synthetic */ w(Qa.l lVar, Qa.l lVar2, Qa.l lVar3, Qa.l lVar4, Qa.l lVar5, Qa.l lVar6, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? null : lVar, (i & 2) != 0 ? null : lVar2, (i & 4) != 0 ? null : lVar3, (i & 8) != 0 ? null : lVar4, (i & 16) != 0 ? null : lVar5, (i & 32) != 0 ? null : lVar6);
    }
}
