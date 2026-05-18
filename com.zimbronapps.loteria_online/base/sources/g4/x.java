package G4;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class x {
    public UUID a;
    public P4.p b;
    public Set c;

    public static abstract class a {
        public P4.p c;
        public Class e;
        public boolean a = false;
        public Set d = new HashSet();
        public UUID b = UUID.randomUUID();

        public a(Class cls) {
            this.e = cls;
            this.c = new P4.p(this.b.toString(), cls.getName());
            a(cls.getName());
        }

        public final a a(String str) {
            this.d.add(str);
            return d();
        }

        public final x b() {
            x c = c();
            b bVar = this.c.j;
            boolean z = bVar.e() || bVar.f() || bVar.g() || bVar.h();
            if (this.c.q && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.b = UUID.randomUUID();
            P4.p pVar = new P4.p(this.c);
            this.c = pVar;
            pVar.a = this.b.toString();
            return c;
        }

        public abstract x c();

        public abstract a d();

        public final a e(b bVar) {
            this.c.j = bVar;
            return d();
        }

        public final a f(androidx.work.b bVar) {
            this.c.e = bVar;
            return d();
        }
    }

    public x(UUID uuid, P4.p pVar, Set set) {
        this.a = uuid;
        this.b = pVar;
        this.c = set;
    }

    public String a() {
        return this.a.toString();
    }

    public Set b() {
        return this.c;
    }

    public P4.p c() {
        return this.b;
    }
}
