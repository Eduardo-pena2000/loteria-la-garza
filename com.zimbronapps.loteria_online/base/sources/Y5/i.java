package y5;

import y5.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i extends s {
    public final r a;

    public static final class b extends s.a {
        public r a;

        public s a() {
            return new i(this.a, null);
        }

        public s.a b(r rVar) {
            this.a = rVar;
            return this;
        }
    }

    public /* synthetic */ i(r rVar, a aVar) {
        this(rVar);
    }

    public r b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.a;
        r b2 = ((s) obj).b();
        return rVar == null ? b2 == null : rVar.equals(b2);
    }

    public int hashCode() {
        r rVar = this.a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }

    public i(r rVar) {
        this.a = rVar;
    }
}
