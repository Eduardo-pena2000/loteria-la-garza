package n0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public final w a;
    public final Integer b;

    public c(w wVar, Integer num) {
        this.a = wVar;
        this.b = num;
    }

    public static /* synthetic */ c b(c cVar, w wVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = cVar.a;
        }
        if ((i & 2) != 0) {
            num = cVar.b;
        }
        return cVar.a(wVar, num);
    }

    public final c a(w wVar, Integer num) {
        return new c(wVar, num);
    }

    public final Integer c() {
        return this.b;
    }

    public final w d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.t.c(this.a, cVar.a) && kotlin.jvm.internal.t.c(this.b, cVar.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.a + ", groupOffset=" + this.b + ')';
    }
}
