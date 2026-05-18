package P4;

import P4.p;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r implements q {
    public final g4.e a;
    public final g4.b b;
    public final g4.k c;
    public final g4.k d;
    public final g4.k e;
    public final g4.k f;
    public final g4.k g;
    public final g4.k h;
    public final g4.k i;
    public final g4.k j;

    public class a extends g4.b {
        public a(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(m4.f fVar, p pVar) {
            String str = pVar.a;
            if (str == null) {
                fVar.q1(1);
            } else {
                fVar.D0(1, str);
            }
            fVar.Z0(2, v.j(pVar.b));
            String str2 = pVar.c;
            if (str2 == null) {
                fVar.q1(3);
            } else {
                fVar.D0(3, str2);
            }
            String str3 = pVar.d;
            if (str3 == null) {
                fVar.q1(4);
            } else {
                fVar.D0(4, str3);
            }
            byte[] k = androidx.work.b.k(pVar.e);
            if (k == null) {
                fVar.q1(5);
            } else {
                fVar.d1(5, k);
            }
            byte[] k2 = androidx.work.b.k(pVar.f);
            if (k2 == null) {
                fVar.q1(6);
            } else {
                fVar.d1(6, k2);
            }
            fVar.Z0(7, pVar.g);
            fVar.Z0(8, pVar.h);
            fVar.Z0(9, pVar.i);
            fVar.Z0(10, pVar.k);
            fVar.Z0(11, v.a(pVar.l));
            fVar.Z0(12, pVar.m);
            fVar.Z0(13, pVar.n);
            fVar.Z0(14, pVar.o);
            fVar.Z0(15, pVar.p);
            fVar.Z0(16, pVar.q ? 1L : 0L);
            fVar.Z0(17, v.i(pVar.r));
            G4.b bVar = pVar.j;
            if (bVar == null) {
                fVar.q1(18);
                fVar.q1(19);
                fVar.q1(20);
                fVar.q1(21);
                fVar.q1(22);
                fVar.q1(23);
                fVar.q1(24);
                fVar.q1(25);
                return;
            }
            fVar.Z0(18, v.h(bVar.b()));
            fVar.Z0(19, bVar.g() ? 1L : 0L);
            fVar.Z0(20, bVar.h() ? 1L : 0L);
            fVar.Z0(21, bVar.f() ? 1L : 0L);
            fVar.Z0(22, bVar.i() ? 1L : 0L);
            fVar.Z0(23, bVar.c());
            fVar.Z0(24, bVar.d());
            byte[] c = v.c(bVar.a());
            if (c == null) {
                fVar.q1(25);
            } else {
                fVar.d1(25, c);
            }
        }
    }

    public class b extends g4.k {
        public b(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class c extends g4.k {
        public c(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class d extends g4.k {
        public d(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class e extends g4.k {
        public e(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class f extends g4.k {
        public f(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class g extends g4.k {
        public g(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class h extends g4.k {
        public h(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class i extends g4.k {
        public i(g4.e eVar) {
            super(eVar);
        }

        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(g4.e eVar) {
        this.a = eVar;
        this.b = new a(eVar);
        this.c = new b(eVar);
        this.d = new c(eVar);
        this.e = new d(eVar);
        this.f = new e(eVar);
        this.g = new f(eVar);
        this.h = new g(eVar);
        this.i = new h(eVar);
        this.j = new i(eVar);
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

    public void b(p pVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(pVar);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    public List c(long j) {
        g4.h hVar;
        g4.h c2 = g4.h.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        c2.Z0(1, j);
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            int b3 = i4.b.b(b2, "required_network_type");
            int b4 = i4.b.b(b2, "requires_charging");
            int b5 = i4.b.b(b2, "requires_device_idle");
            int b6 = i4.b.b(b2, "requires_battery_not_low");
            int b7 = i4.b.b(b2, "requires_storage_not_low");
            int b8 = i4.b.b(b2, "trigger_content_update_delay");
            int b9 = i4.b.b(b2, "trigger_max_content_delay");
            int b10 = i4.b.b(b2, "content_uri_triggers");
            int b11 = i4.b.b(b2, "id");
            int b12 = i4.b.b(b2, "state");
            int b13 = i4.b.b(b2, "worker_class_name");
            int b14 = i4.b.b(b2, "input_merger_class_name");
            int b15 = i4.b.b(b2, "input");
            int b16 = i4.b.b(b2, "output");
            hVar = c2;
            try {
                int b17 = i4.b.b(b2, "initial_delay");
                int b18 = i4.b.b(b2, "interval_duration");
                int b19 = i4.b.b(b2, "flex_duration");
                int b20 = i4.b.b(b2, "run_attempt_count");
                int b21 = i4.b.b(b2, "backoff_policy");
                int b22 = i4.b.b(b2, "backoff_delay_duration");
                int b23 = i4.b.b(b2, "period_start_time");
                int b24 = i4.b.b(b2, "minimum_retention_duration");
                int b25 = i4.b.b(b2, "schedule_requested_at");
                int b26 = i4.b.b(b2, "run_in_foreground");
                int b27 = i4.b.b(b2, "out_of_quota_policy");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i3 = b11;
                    String string2 = b2.getString(b13);
                    int i4 = b13;
                    G4.b bVar = new G4.b();
                    int i5 = b3;
                    bVar.k(v.e(b2.getInt(b3)));
                    bVar.m(b2.getInt(b4) != 0);
                    bVar.n(b2.getInt(b5) != 0);
                    bVar.l(b2.getInt(b6) != 0);
                    bVar.o(b2.getInt(b7) != 0);
                    int i6 = b4;
                    int i7 = b5;
                    bVar.p(b2.getLong(b8));
                    bVar.q(b2.getLong(b9));
                    bVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.b = v.g(b2.getInt(b12));
                    pVar.d = b2.getString(b14);
                    pVar.e = androidx.work.b.g(b2.getBlob(b15));
                    int i8 = i2;
                    pVar.f = androidx.work.b.g(b2.getBlob(i8));
                    int i9 = b17;
                    i2 = i8;
                    pVar.g = b2.getLong(i9);
                    int i10 = b14;
                    int i11 = b18;
                    pVar.h = b2.getLong(i11);
                    int i12 = b6;
                    int i13 = b19;
                    pVar.i = b2.getLong(i13);
                    int i14 = b20;
                    pVar.k = b2.getInt(i14);
                    int i15 = b21;
                    pVar.l = v.d(b2.getInt(i15));
                    b19 = i13;
                    int i16 = b22;
                    pVar.m = b2.getLong(i16);
                    int i17 = b23;
                    pVar.n = b2.getLong(i17);
                    b23 = i17;
                    int i18 = b24;
                    pVar.o = b2.getLong(i18);
                    int i19 = b25;
                    pVar.p = b2.getLong(i19);
                    int i20 = b26;
                    pVar.q = b2.getInt(i20) != 0;
                    int i21 = b27;
                    pVar.r = v.f(b2.getInt(i21));
                    pVar.j = bVar;
                    arrayList.add(pVar);
                    b4 = i6;
                    b27 = i21;
                    b14 = i10;
                    b17 = i9;
                    b18 = i11;
                    b20 = i14;
                    b25 = i19;
                    b11 = i3;
                    b13 = i4;
                    b3 = i5;
                    b26 = i20;
                    b24 = i18;
                    b5 = i7;
                    b22 = i16;
                    b6 = i12;
                    b21 = i15;
                }
                b2.close();
                hVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                hVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = c2;
        }
    }

    public List d() {
        g4.h hVar;
        g4.h c2 = g4.h.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            int b3 = i4.b.b(b2, "required_network_type");
            int b4 = i4.b.b(b2, "requires_charging");
            int b5 = i4.b.b(b2, "requires_device_idle");
            int b6 = i4.b.b(b2, "requires_battery_not_low");
            int b7 = i4.b.b(b2, "requires_storage_not_low");
            int b8 = i4.b.b(b2, "trigger_content_update_delay");
            int b9 = i4.b.b(b2, "trigger_max_content_delay");
            int b10 = i4.b.b(b2, "content_uri_triggers");
            int b11 = i4.b.b(b2, "id");
            int b12 = i4.b.b(b2, "state");
            int b13 = i4.b.b(b2, "worker_class_name");
            int b14 = i4.b.b(b2, "input_merger_class_name");
            int b15 = i4.b.b(b2, "input");
            int b16 = i4.b.b(b2, "output");
            hVar = c2;
            try {
                int b17 = i4.b.b(b2, "initial_delay");
                int b18 = i4.b.b(b2, "interval_duration");
                int b19 = i4.b.b(b2, "flex_duration");
                int b20 = i4.b.b(b2, "run_attempt_count");
                int b21 = i4.b.b(b2, "backoff_policy");
                int b22 = i4.b.b(b2, "backoff_delay_duration");
                int b23 = i4.b.b(b2, "period_start_time");
                int b24 = i4.b.b(b2, "minimum_retention_duration");
                int b25 = i4.b.b(b2, "schedule_requested_at");
                int b26 = i4.b.b(b2, "run_in_foreground");
                int b27 = i4.b.b(b2, "out_of_quota_policy");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i3 = b11;
                    String string2 = b2.getString(b13);
                    int i4 = b13;
                    G4.b bVar = new G4.b();
                    int i5 = b3;
                    bVar.k(v.e(b2.getInt(b3)));
                    bVar.m(b2.getInt(b4) != 0);
                    bVar.n(b2.getInt(b5) != 0);
                    bVar.l(b2.getInt(b6) != 0);
                    bVar.o(b2.getInt(b7) != 0);
                    int i6 = b4;
                    int i7 = b5;
                    bVar.p(b2.getLong(b8));
                    bVar.q(b2.getLong(b9));
                    bVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.b = v.g(b2.getInt(b12));
                    pVar.d = b2.getString(b14);
                    pVar.e = androidx.work.b.g(b2.getBlob(b15));
                    int i8 = i2;
                    pVar.f = androidx.work.b.g(b2.getBlob(i8));
                    i2 = i8;
                    int i9 = b17;
                    pVar.g = b2.getLong(i9);
                    int i10 = b15;
                    int i11 = b18;
                    pVar.h = b2.getLong(i11);
                    int i12 = b6;
                    int i13 = b19;
                    pVar.i = b2.getLong(i13);
                    int i14 = b20;
                    pVar.k = b2.getInt(i14);
                    int i15 = b21;
                    pVar.l = v.d(b2.getInt(i15));
                    b19 = i13;
                    int i16 = b22;
                    pVar.m = b2.getLong(i16);
                    int i17 = b23;
                    pVar.n = b2.getLong(i17);
                    b23 = i17;
                    int i18 = b24;
                    pVar.o = b2.getLong(i18);
                    int i19 = b25;
                    pVar.p = b2.getLong(i19);
                    int i20 = b26;
                    pVar.q = b2.getInt(i20) != 0;
                    int i21 = b27;
                    pVar.r = v.f(b2.getInt(i21));
                    pVar.j = bVar;
                    arrayList.add(pVar);
                    b27 = i21;
                    b4 = i6;
                    b15 = i10;
                    b17 = i9;
                    b18 = i11;
                    b20 = i14;
                    b25 = i19;
                    b11 = i3;
                    b13 = i4;
                    b3 = i5;
                    b26 = i20;
                    b24 = i18;
                    b5 = i7;
                    b22 = i16;
                    b6 = i12;
                    b21 = i15;
                }
                b2.close();
                hVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                hVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = c2;
        }
    }

    public List e(String str) {
        g4.h c2 = g4.h.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c2.q1(1);
        } else {
            c2.D0(1, str);
        }
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            c2.g();
        }
    }

    public int f(G4.v vVar, String... strArr) {
        this.a.b();
        StringBuilder b2 = i4.e.b();
        b2.append("UPDATE workspec SET state=");
        b2.append("?");
        b2.append(" WHERE id IN (");
        i4.e.a(b2, strArr.length);
        b2.append(")");
        m4.f d2 = this.a.d(b2.toString());
        d2.Z0(1, v.j(vVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                d2.q1(i2);
            } else {
                d2.D0(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int q = d2.q();
            this.a.r();
            return q;
        } finally {
            this.a.g();
        }
    }

    public G4.v g(String str) {
        g4.h c2 = g4.h.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c2.q1(1);
        } else {
            c2.D0(1, str);
        }
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            return b2.moveToFirst() ? v.g(b2.getInt(0)) : null;
        } finally {
            b2.close();
            c2.g();
        }
    }

    public p h(String str) {
        g4.h hVar;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        p pVar;
        g4.h c2 = g4.h.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            c2.q1(1);
        } else {
            c2.D0(1, str);
        }
        this.a.b();
        Cursor b16 = i4.c.b(this.a, c2, false, null);
        try {
            b2 = i4.b.b(b16, "required_network_type");
            b3 = i4.b.b(b16, "requires_charging");
            b4 = i4.b.b(b16, "requires_device_idle");
            b5 = i4.b.b(b16, "requires_battery_not_low");
            b6 = i4.b.b(b16, "requires_storage_not_low");
            b7 = i4.b.b(b16, "trigger_content_update_delay");
            b8 = i4.b.b(b16, "trigger_max_content_delay");
            b9 = i4.b.b(b16, "content_uri_triggers");
            b10 = i4.b.b(b16, "id");
            b11 = i4.b.b(b16, "state");
            b12 = i4.b.b(b16, "worker_class_name");
            b13 = i4.b.b(b16, "input_merger_class_name");
            b14 = i4.b.b(b16, "input");
            b15 = i4.b.b(b16, "output");
            hVar = c2;
        } catch (Throwable th) {
            th = th;
            hVar = c2;
        }
        try {
            int b17 = i4.b.b(b16, "initial_delay");
            int b18 = i4.b.b(b16, "interval_duration");
            int b19 = i4.b.b(b16, "flex_duration");
            int b20 = i4.b.b(b16, "run_attempt_count");
            int b21 = i4.b.b(b16, "backoff_policy");
            int b22 = i4.b.b(b16, "backoff_delay_duration");
            int b23 = i4.b.b(b16, "period_start_time");
            int b24 = i4.b.b(b16, "minimum_retention_duration");
            int b25 = i4.b.b(b16, "schedule_requested_at");
            int b26 = i4.b.b(b16, "run_in_foreground");
            int b27 = i4.b.b(b16, "out_of_quota_policy");
            if (b16.moveToFirst()) {
                String string = b16.getString(b10);
                String string2 = b16.getString(b12);
                G4.b bVar = new G4.b();
                bVar.k(v.e(b16.getInt(b2)));
                bVar.m(b16.getInt(b3) != 0);
                bVar.n(b16.getInt(b4) != 0);
                bVar.l(b16.getInt(b5) != 0);
                bVar.o(b16.getInt(b6) != 0);
                bVar.p(b16.getLong(b7));
                bVar.q(b16.getLong(b8));
                bVar.j(v.b(b16.getBlob(b9)));
                p pVar2 = new p(string, string2);
                pVar2.b = v.g(b16.getInt(b11));
                pVar2.d = b16.getString(b13);
                pVar2.e = androidx.work.b.g(b16.getBlob(b14));
                pVar2.f = androidx.work.b.g(b16.getBlob(b15));
                pVar2.g = b16.getLong(b17);
                pVar2.h = b16.getLong(b18);
                pVar2.i = b16.getLong(b19);
                pVar2.k = b16.getInt(b20);
                pVar2.l = v.d(b16.getInt(b21));
                pVar2.m = b16.getLong(b22);
                pVar2.n = b16.getLong(b23);
                pVar2.o = b16.getLong(b24);
                pVar2.p = b16.getLong(b25);
                pVar2.q = b16.getInt(b26) != 0;
                pVar2.r = v.f(b16.getInt(b27));
                pVar2.j = bVar;
                pVar = pVar2;
            } else {
                pVar = null;
            }
            b16.close();
            hVar.g();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            b16.close();
            hVar.g();
            throw th;
        }
    }

    public List i(String str) {
        g4.h c2 = g4.h.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c2.q1(1);
        } else {
            c2.D0(1, str);
        }
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            c2.g();
        }
    }

    public List j(String str) {
        g4.h c2 = g4.h.c("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c2.q1(1);
        } else {
            c2.D0(1, str);
        }
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(androidx.work.b.g(b2.getBlob(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            c2.g();
        }
    }

    public List k(int i2) {
        g4.h hVar;
        g4.h c2 = g4.h.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        c2.Z0(1, i2);
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            int b3 = i4.b.b(b2, "required_network_type");
            int b4 = i4.b.b(b2, "requires_charging");
            int b5 = i4.b.b(b2, "requires_device_idle");
            int b6 = i4.b.b(b2, "requires_battery_not_low");
            int b7 = i4.b.b(b2, "requires_storage_not_low");
            int b8 = i4.b.b(b2, "trigger_content_update_delay");
            int b9 = i4.b.b(b2, "trigger_max_content_delay");
            int b10 = i4.b.b(b2, "content_uri_triggers");
            int b11 = i4.b.b(b2, "id");
            int b12 = i4.b.b(b2, "state");
            int b13 = i4.b.b(b2, "worker_class_name");
            int b14 = i4.b.b(b2, "input_merger_class_name");
            int b15 = i4.b.b(b2, "input");
            int b16 = i4.b.b(b2, "output");
            hVar = c2;
            try {
                int b17 = i4.b.b(b2, "initial_delay");
                int b18 = i4.b.b(b2, "interval_duration");
                int b19 = i4.b.b(b2, "flex_duration");
                int b20 = i4.b.b(b2, "run_attempt_count");
                int b21 = i4.b.b(b2, "backoff_policy");
                int b22 = i4.b.b(b2, "backoff_delay_duration");
                int b23 = i4.b.b(b2, "period_start_time");
                int b24 = i4.b.b(b2, "minimum_retention_duration");
                int b25 = i4.b.b(b2, "schedule_requested_at");
                int b26 = i4.b.b(b2, "run_in_foreground");
                int b27 = i4.b.b(b2, "out_of_quota_policy");
                int i3 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i4 = b11;
                    String string2 = b2.getString(b13);
                    int i5 = b13;
                    G4.b bVar = new G4.b();
                    int i6 = b3;
                    bVar.k(v.e(b2.getInt(b3)));
                    bVar.m(b2.getInt(b4) != 0);
                    bVar.n(b2.getInt(b5) != 0);
                    bVar.l(b2.getInt(b6) != 0);
                    bVar.o(b2.getInt(b7) != 0);
                    int i7 = b4;
                    int i8 = b5;
                    bVar.p(b2.getLong(b8));
                    bVar.q(b2.getLong(b9));
                    bVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.b = v.g(b2.getInt(b12));
                    pVar.d = b2.getString(b14);
                    pVar.e = androidx.work.b.g(b2.getBlob(b15));
                    int i9 = i3;
                    pVar.f = androidx.work.b.g(b2.getBlob(i9));
                    i3 = i9;
                    int i10 = b17;
                    pVar.g = b2.getLong(i10);
                    int i11 = b14;
                    int i12 = b18;
                    pVar.h = b2.getLong(i12);
                    int i13 = b6;
                    int i14 = b19;
                    pVar.i = b2.getLong(i14);
                    int i15 = b20;
                    pVar.k = b2.getInt(i15);
                    int i16 = b21;
                    pVar.l = v.d(b2.getInt(i16));
                    b19 = i14;
                    int i17 = b22;
                    pVar.m = b2.getLong(i17);
                    int i18 = b23;
                    pVar.n = b2.getLong(i18);
                    b23 = i18;
                    int i19 = b24;
                    pVar.o = b2.getLong(i19);
                    int i20 = b25;
                    pVar.p = b2.getLong(i20);
                    int i21 = b26;
                    pVar.q = b2.getInt(i21) != 0;
                    int i22 = b27;
                    pVar.r = v.f(b2.getInt(i22));
                    pVar.j = bVar;
                    arrayList.add(pVar);
                    b27 = i22;
                    b4 = i7;
                    b14 = i11;
                    b17 = i10;
                    b18 = i12;
                    b20 = i15;
                    b25 = i20;
                    b11 = i4;
                    b13 = i5;
                    b3 = i6;
                    b26 = i21;
                    b24 = i19;
                    b5 = i8;
                    b22 = i17;
                    b6 = i13;
                    b21 = i16;
                }
                b2.close();
                hVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                hVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = c2;
        }
    }

    public int l() {
        this.a.b();
        m4.f a2 = this.i.a();
        this.a.c();
        try {
            int q = a2.q();
            this.a.r();
            return q;
        } finally {
            this.a.g();
            this.i.f(a2);
        }
    }

    public int m(String str, long j) {
        this.a.b();
        m4.f a2 = this.h.a();
        a2.Z0(1, j);
        if (str == null) {
            a2.q1(2);
        } else {
            a2.D0(2, str);
        }
        this.a.c();
        try {
            int q = a2.q();
            this.a.r();
            return q;
        } finally {
            this.a.g();
            this.h.f(a2);
        }
    }

    public List n(String str) {
        g4.h c2 = g4.h.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c2.q1(1);
        } else {
            c2.D0(1, str);
        }
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            int b3 = i4.b.b(b2, "id");
            int b4 = i4.b.b(b2, "state");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                p.b bVar = new p.b();
                bVar.a = b2.getString(b3);
                bVar.b = v.g(b2.getInt(b4));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b2.close();
            c2.g();
        }
    }

    public List o(int i2) {
        g4.h hVar;
        g4.h c2 = g4.h.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c2.Z0(1, i2);
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            int b3 = i4.b.b(b2, "required_network_type");
            int b4 = i4.b.b(b2, "requires_charging");
            int b5 = i4.b.b(b2, "requires_device_idle");
            int b6 = i4.b.b(b2, "requires_battery_not_low");
            int b7 = i4.b.b(b2, "requires_storage_not_low");
            int b8 = i4.b.b(b2, "trigger_content_update_delay");
            int b9 = i4.b.b(b2, "trigger_max_content_delay");
            int b10 = i4.b.b(b2, "content_uri_triggers");
            int b11 = i4.b.b(b2, "id");
            int b12 = i4.b.b(b2, "state");
            int b13 = i4.b.b(b2, "worker_class_name");
            int b14 = i4.b.b(b2, "input_merger_class_name");
            int b15 = i4.b.b(b2, "input");
            int b16 = i4.b.b(b2, "output");
            hVar = c2;
            try {
                int b17 = i4.b.b(b2, "initial_delay");
                int b18 = i4.b.b(b2, "interval_duration");
                int b19 = i4.b.b(b2, "flex_duration");
                int b20 = i4.b.b(b2, "run_attempt_count");
                int b21 = i4.b.b(b2, "backoff_policy");
                int b22 = i4.b.b(b2, "backoff_delay_duration");
                int b23 = i4.b.b(b2, "period_start_time");
                int b24 = i4.b.b(b2, "minimum_retention_duration");
                int b25 = i4.b.b(b2, "schedule_requested_at");
                int b26 = i4.b.b(b2, "run_in_foreground");
                int b27 = i4.b.b(b2, "out_of_quota_policy");
                int i3 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i4 = b11;
                    String string2 = b2.getString(b13);
                    int i5 = b13;
                    G4.b bVar = new G4.b();
                    int i6 = b3;
                    bVar.k(v.e(b2.getInt(b3)));
                    bVar.m(b2.getInt(b4) != 0);
                    bVar.n(b2.getInt(b5) != 0);
                    bVar.l(b2.getInt(b6) != 0);
                    bVar.o(b2.getInt(b7) != 0);
                    int i7 = b4;
                    int i8 = b5;
                    bVar.p(b2.getLong(b8));
                    bVar.q(b2.getLong(b9));
                    bVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.b = v.g(b2.getInt(b12));
                    pVar.d = b2.getString(b14);
                    pVar.e = androidx.work.b.g(b2.getBlob(b15));
                    int i9 = i3;
                    pVar.f = androidx.work.b.g(b2.getBlob(i9));
                    i3 = i9;
                    int i10 = b17;
                    pVar.g = b2.getLong(i10);
                    int i11 = b14;
                    int i12 = b18;
                    pVar.h = b2.getLong(i12);
                    int i13 = b6;
                    int i14 = b19;
                    pVar.i = b2.getLong(i14);
                    int i15 = b20;
                    pVar.k = b2.getInt(i15);
                    int i16 = b21;
                    pVar.l = v.d(b2.getInt(i16));
                    b19 = i14;
                    int i17 = b22;
                    pVar.m = b2.getLong(i17);
                    int i18 = b23;
                    pVar.n = b2.getLong(i18);
                    b23 = i18;
                    int i19 = b24;
                    pVar.o = b2.getLong(i19);
                    int i20 = b25;
                    pVar.p = b2.getLong(i20);
                    int i21 = b26;
                    pVar.q = b2.getInt(i21) != 0;
                    int i22 = b27;
                    pVar.r = v.f(b2.getInt(i22));
                    pVar.j = bVar;
                    arrayList.add(pVar);
                    b27 = i22;
                    b4 = i7;
                    b14 = i11;
                    b17 = i10;
                    b18 = i12;
                    b20 = i15;
                    b25 = i20;
                    b11 = i4;
                    b13 = i5;
                    b3 = i6;
                    b26 = i21;
                    b24 = i19;
                    b5 = i8;
                    b22 = i17;
                    b6 = i13;
                    b21 = i16;
                }
                b2.close();
                hVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                hVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = c2;
        }
    }

    public void p(String str, androidx.work.b bVar) {
        this.a.b();
        m4.f a2 = this.d.a();
        byte[] k = androidx.work.b.k(bVar);
        if (k == null) {
            a2.q1(1);
        } else {
            a2.d1(1, k);
        }
        if (str == null) {
            a2.q1(2);
        } else {
            a2.D0(2, str);
        }
        this.a.c();
        try {
            a2.q();
            this.a.r();
        } finally {
            this.a.g();
            this.d.f(a2);
        }
    }

    public List q() {
        g4.h hVar;
        g4.h c2 = g4.h.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            int b3 = i4.b.b(b2, "required_network_type");
            int b4 = i4.b.b(b2, "requires_charging");
            int b5 = i4.b.b(b2, "requires_device_idle");
            int b6 = i4.b.b(b2, "requires_battery_not_low");
            int b7 = i4.b.b(b2, "requires_storage_not_low");
            int b8 = i4.b.b(b2, "trigger_content_update_delay");
            int b9 = i4.b.b(b2, "trigger_max_content_delay");
            int b10 = i4.b.b(b2, "content_uri_triggers");
            int b11 = i4.b.b(b2, "id");
            int b12 = i4.b.b(b2, "state");
            int b13 = i4.b.b(b2, "worker_class_name");
            int b14 = i4.b.b(b2, "input_merger_class_name");
            int b15 = i4.b.b(b2, "input");
            int b16 = i4.b.b(b2, "output");
            hVar = c2;
            try {
                int b17 = i4.b.b(b2, "initial_delay");
                int b18 = i4.b.b(b2, "interval_duration");
                int b19 = i4.b.b(b2, "flex_duration");
                int b20 = i4.b.b(b2, "run_attempt_count");
                int b21 = i4.b.b(b2, "backoff_policy");
                int b22 = i4.b.b(b2, "backoff_delay_duration");
                int b23 = i4.b.b(b2, "period_start_time");
                int b24 = i4.b.b(b2, "minimum_retention_duration");
                int b25 = i4.b.b(b2, "schedule_requested_at");
                int b26 = i4.b.b(b2, "run_in_foreground");
                int b27 = i4.b.b(b2, "out_of_quota_policy");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i3 = b11;
                    String string2 = b2.getString(b13);
                    int i4 = b13;
                    G4.b bVar = new G4.b();
                    int i5 = b3;
                    bVar.k(v.e(b2.getInt(b3)));
                    bVar.m(b2.getInt(b4) != 0);
                    bVar.n(b2.getInt(b5) != 0);
                    bVar.l(b2.getInt(b6) != 0);
                    bVar.o(b2.getInt(b7) != 0);
                    int i6 = b4;
                    int i7 = b5;
                    bVar.p(b2.getLong(b8));
                    bVar.q(b2.getLong(b9));
                    bVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.b = v.g(b2.getInt(b12));
                    pVar.d = b2.getString(b14);
                    pVar.e = androidx.work.b.g(b2.getBlob(b15));
                    int i8 = i2;
                    pVar.f = androidx.work.b.g(b2.getBlob(i8));
                    i2 = i8;
                    int i9 = b17;
                    pVar.g = b2.getLong(i9);
                    int i10 = b15;
                    int i11 = b18;
                    pVar.h = b2.getLong(i11);
                    int i12 = b6;
                    int i13 = b19;
                    pVar.i = b2.getLong(i13);
                    int i14 = b20;
                    pVar.k = b2.getInt(i14);
                    int i15 = b21;
                    pVar.l = v.d(b2.getInt(i15));
                    b19 = i13;
                    int i16 = b22;
                    pVar.m = b2.getLong(i16);
                    int i17 = b23;
                    pVar.n = b2.getLong(i17);
                    b23 = i17;
                    int i18 = b24;
                    pVar.o = b2.getLong(i18);
                    int i19 = b25;
                    pVar.p = b2.getLong(i19);
                    int i20 = b26;
                    pVar.q = b2.getInt(i20) != 0;
                    int i21 = b27;
                    pVar.r = v.f(b2.getInt(i21));
                    pVar.j = bVar;
                    arrayList.add(pVar);
                    b27 = i21;
                    b4 = i6;
                    b15 = i10;
                    b17 = i9;
                    b18 = i11;
                    b20 = i14;
                    b25 = i19;
                    b11 = i3;
                    b13 = i4;
                    b3 = i5;
                    b26 = i20;
                    b24 = i18;
                    b5 = i7;
                    b22 = i16;
                    b6 = i12;
                    b21 = i15;
                }
                b2.close();
                hVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                hVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = c2;
        }
    }

    public boolean r() {
        boolean z = false;
        g4.h c2 = g4.h.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.b();
        Cursor b2 = i4.c.b(this.a, c2, false, null);
        try {
            if (b2.moveToFirst()) {
                if (b2.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            b2.close();
            c2.g();
        }
    }

    public int s(String str) {
        this.a.b();
        m4.f a2 = this.g.a();
        if (str == null) {
            a2.q1(1);
        } else {
            a2.D0(1, str);
        }
        this.a.c();
        try {
            int q = a2.q();
            this.a.r();
            return q;
        } finally {
            this.a.g();
            this.g.f(a2);
        }
    }

    public int t(String str) {
        this.a.b();
        m4.f a2 = this.f.a();
        if (str == null) {
            a2.q1(1);
        } else {
            a2.D0(1, str);
        }
        this.a.c();
        try {
            int q = a2.q();
            this.a.r();
            return q;
        } finally {
            this.a.g();
            this.f.f(a2);
        }
    }

    public void u(String str, long j) {
        this.a.b();
        m4.f a2 = this.e.a();
        a2.Z0(1, j);
        if (str == null) {
            a2.q1(2);
        } else {
            a2.D0(2, str);
        }
        this.a.c();
        try {
            a2.q();
            this.a.r();
        } finally {
            this.a.g();
            this.e.f(a2);
        }
    }
}
