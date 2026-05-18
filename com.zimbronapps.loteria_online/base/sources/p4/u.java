package P4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u implements t {
    public final g4.e a;
    public final g4.b b;

    public class a extends g4.b {
        public a(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(m4.f fVar, s sVar) {
            String str = sVar.a;
            if (str == null) {
                fVar.q1(1);
            } else {
                fVar.D0(1, str);
            }
            String str2 = sVar.b;
            if (str2 == null) {
                fVar.q1(2);
            } else {
                fVar.D0(2, str2);
            }
        }
    }

    public u(g4.e eVar) {
        this.a = eVar;
        this.b = new a(eVar);
    }

    public void a(s sVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(sVar);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    public List b(String str) {
        g4.h c = g4.h.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
}
