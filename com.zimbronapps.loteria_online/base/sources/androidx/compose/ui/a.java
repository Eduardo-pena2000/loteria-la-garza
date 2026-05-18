package androidx.compose.ui;

import Qa.l;
import Qa.p;
import androidx.compose.ui.e;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements e {
    public final e b;
    public final e c;

    public static final class a extends u implements p {
        public static final a a = new a();

        public a() {
            super(2);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, e.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public a(e eVar, e eVar2) {
        this.b = eVar;
        this.c = eVar2;
    }

    public boolean all(l lVar) {
        return this.b.all(lVar) && this.c.all(lVar);
    }

    public final e b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (t.c(this.b, aVar.b) && t.c(this.c, aVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final e f() {
        return this.b;
    }

    public Object foldIn(Object obj, p pVar) {
        return this.c.foldIn(this.b.foldIn(obj, pVar), pVar);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.c.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) foldIn("", a.a)) + ']';
    }
}
