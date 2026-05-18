package P4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o implements n {
    public final g4.e a;
    public final g4.b b;
    public final g4.k c;
    public final g4.k d;

    public class a extends g4.b {
        public a(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(m4.f fVar, m mVar) {
            String str = mVar.a;
            if (str == null) {
                fVar.q1(1);
            } else {
                fVar.D0(1, str);
            }
            byte[] k = androidx.work.b.k(mVar.b);
            if (k == null) {
                fVar.q1(2);
            } else {
                fVar.d1(2, k);
            }
        }
    }

    public class b extends g4.k {
        public b(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends g4.k {
        public c(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(g4.e eVar) {
        this.a = eVar;
        this.b = new a(eVar);
        this.c = new b(eVar);
        this.d = new c(eVar);
    }

    public void a(String str) {
        this.a.b();
        m4.f a2 = this.c.a();
        if (str == null) {
            a2.q1(1);
        } else {
            a2.D0(1, str);
        }
        this.a.c();
        try {
            a2.q();
            this.a.r();
        } finally {
            this.a.g();
            this.c.f(a2);
        }
    }

    public void b(m mVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(mVar);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    public void c() {
        this.a.b();
        m4.f a2 = this.d.a();
        this.a.c();
        try {
            a2.q();
            this.a.r();
        } finally {
            this.a.g();
            this.d.f(a2);
        }
    }
}
