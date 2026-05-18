package P4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements h {
    public final g4.e a;
    public final g4.b b;
    public final g4.k c;

    public class a extends g4.b {
        public a(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(m4.f fVar, g gVar) {
            String str = gVar.a;
            if (str == null) {
                fVar.q1(1);
            } else {
                fVar.D0(1, str);
            }
            fVar.Z0(2, gVar.b);
        }
    }

    public class b extends g4.k {
        public b(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(g4.e eVar) {
        this.a = eVar;
        this.b = new a(eVar);
        this.c = new b(eVar);
    }

    public g a(String str) {
        g4.h c = g4.h.c("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c.q1(1);
        } else {
            c.D0(1, str);
        }
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c, false, null);
        try {
            return b2.moveToFirst() ? new g(b2.getString(i4.b.b(b2, "work_spec_id")), b2.getInt(i4.b.b(b2, "system_id"))) : null;
        } finally {
            b2.close();
            c.g();
        }
    }

    public void b(g gVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(gVar);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    public List c() {
        g4.h c = g4.h.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            c.g();
        }
    }

    public void d(String str) {
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
}
