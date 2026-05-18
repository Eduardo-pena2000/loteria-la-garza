package Z0;

import Z0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j implements e.a {

    public static final class a extends j {
        public final String a;
        public final U0 b;

        public a(String str, U0 u0, k kVar) {
            super(null);
            this.a = str;
            this.b = u0;
        }

        public k a() {
            return null;
        }

        public U0 b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!kotlin.jvm.internal.t.c(this.a, aVar.a) || !kotlin.jvm.internal.t.c(b(), aVar.b())) {
                return false;
            }
            a();
            aVar.a();
            return kotlin.jvm.internal.t.c((Object) null, (Object) null);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            U0 b = b();
            int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
            a();
            return hashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.a + ')';
        }
    }

    public static final class b extends j {
        public final String a;
        public final U0 b;

        public /* synthetic */ b(String str, U0 u0, k kVar, int i, kotlin.jvm.internal.k kVar2) {
            this(str, (i & 2) != 0 ? null : u0, (i & 4) != 0 ? null : kVar);
        }

        public k a() {
            return null;
        }

        public U0 b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!kotlin.jvm.internal.t.c(this.a, bVar.a) || !kotlin.jvm.internal.t.c(b(), bVar.b())) {
                return false;
            }
            a();
            bVar.a();
            return kotlin.jvm.internal.t.c((Object) null, (Object) null);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            U0 b = b();
            int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
            a();
            return hashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.a + ')';
        }

        public b(String str, U0 u0, k kVar) {
            super(null);
            this.a = str;
            this.b = u0;
        }
    }

    public /* synthetic */ j(kotlin.jvm.internal.k kVar) {
        this();
    }

    public abstract k a();

    public abstract U0 b();

    public j() {
    }
}
