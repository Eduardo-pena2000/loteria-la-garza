package P4;

import android.database.Cursor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements e {
    public final g4.e a;
    public final g4.b b;

    public class a extends g4.b {
        public a(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(m4.f fVar, d dVar) {
            String str = dVar.a;
            if (str == null) {
                fVar.q1(1);
            } else {
                fVar.D0(1, str);
            }
            Long l = dVar.b;
            if (l == null) {
                fVar.q1(2);
            } else {
                fVar.Z0(2, l.longValue());
            }
        }
    }

    public f(g4.e eVar) {
        this.a = eVar;
        this.b = new a(eVar);
    }

    public void a(d dVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(dVar);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    public Long b(String str) {
        g4.h c = g4.h.c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c.q1(1);
        } else {
            c.D0(1, str);
        }
        this.a.b();
        Long l = null;
        Cursor b = i4.c.b(this.a, c, false, null);
        try {
            if (b.moveToFirst() && !b.isNull(0)) {
                l = Long.valueOf(b.getLong(0));
            }
            return l;
        } finally {
            b.close();
            c.g();
        }
    }
}
