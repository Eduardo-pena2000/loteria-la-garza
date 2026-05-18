package s7;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class t {

    public static class a implements s, Serializable {
        public final s a;
        public volatile transient boolean b;
        public transient Object c;

        public a(s sVar) {
            this.a = (s) m.j(sVar);
        }

        public Object get() {
            if (!this.b) {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            Object obj = this.a.get();
                            this.c = obj;
                            this.b = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return j.a(this.c);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.b) {
                str = "<supplier that returned " + this.c + ">";
            } else {
                str = this.a;
            }
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class b implements s {
        public static final s c = new u();
        public volatile s a;
        public Object b;

        public b(s sVar) {
            this.a = (s) m.j(sVar);
        }

        public static /* synthetic */ Void a() {
            return b();
        }

        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        public Object get() {
            s sVar = this.a;
            s sVar2 = c;
            if (sVar != sVar2) {
                synchronized (this) {
                    try {
                        if (this.a != sVar2) {
                            Object obj = this.a.get();
                            this.b = obj;
                            this.a = sVar2;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return j.a(this.b);
        }

        public String toString() {
            String str = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (str == c) {
                str = "<supplier that returned " + this.b + ">";
            }
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class c implements s, Serializable {
        public final Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return k.a(this.a, ((c) obj).a);
            }
            return false;
        }

        public Object get() {
            return this.a;
        }

        public int hashCode() {
            return k.b(this.a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.a + ")";
        }
    }

    public static s a(s sVar) {
        return ((sVar instanceof b) || (sVar instanceof a)) ? sVar : sVar instanceof Serializable ? new a(sVar) : new b(sVar);
    }

    public static s b(Object obj) {
        return new c(obj);
    }
}
