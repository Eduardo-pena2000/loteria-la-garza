package P4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l implements k {
    public final g4.e a;
    public final g4.b b;

    public class a extends g4.b {
        public a(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(m4.f fVar, j jVar) {
            String str = jVar.a;
            if (str == null) {
                fVar.q1(1);
            } else {
                fVar.D0(1, str);
            }
            String str2 = jVar.b;
            if (str2 == null) {
                fVar.q1(2);
            } else {
                fVar.D0(2, str2);
            }
        }
    }

    public l(g4.e eVar) {
        this.a = eVar;
        this.b = new a(eVar);
    }

    public List a(String str) {
        g4.h c = g4.h.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            c.q1(1);
        } else {
            c.D0(1, str);
        }
        this.a.b();
        Cursor b = i4.c.b(this.a, c, false, null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            c.g();
        }
    }

    public void b(j jVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(jVar);
            this.a.r();
        } finally {
            this.a.g();
        }
    }
}
