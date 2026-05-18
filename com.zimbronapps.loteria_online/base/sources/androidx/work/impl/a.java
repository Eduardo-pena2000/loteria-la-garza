package androidx.work.impl;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static h4.a a = new a(1, 2);
    public static h4.a b = new b(3, 4);
    public static h4.a c = new c(4, 5);
    public static h4.a d = new d(6, 7);
    public static h4.a e = new e(7, 8);
    public static h4.a f = new f(8, 9);
    public static h4.a g = new g(11, 12);

    public class a extends h4.a {
        public a(int i, int i2) {
            super(i, i2);
        }

        public void a(m4.b bVar) {
            bVar.p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.p("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.p("DROP TABLE IF EXISTS alarmInfo");
            bVar.p("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class b extends h4.a {
        public b(int i, int i2) {
            super(i, i2);
        }

        public void a(m4.b bVar) {
            bVar.p("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    public class c extends h4.a {
        public c(int i, int i2) {
            super(i, i2);
        }

        public void a(m4.b bVar) {
            bVar.p("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.p("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    public class d extends h4.a {
        public d(int i, int i2) {
            super(i, i2);
        }

        public void a(m4.b bVar) {
            bVar.p("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class e extends h4.a {
        public e(int i, int i2) {
            super(i, i2);
        }

        public void a(m4.b bVar) {
            bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    public class f extends h4.a {
        public f(int i, int i2) {
            super(i, i2);
        }

        public void a(m4.b bVar) {
            bVar.p("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class g extends h4.a {
        public g(int i, int i2) {
            super(i, i2);
        }

        public void a(m4.b bVar) {
            bVar.p("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends h4.a {
        public final Context c;

        public h(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        public void a(m4.b bVar) {
            if (this.b >= 10) {
                bVar.K("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class i extends h4.a {
        public final Context c;

        public i(Context context) {
            super(9, 10);
            this.c = context;
        }

        public void a(m4.b bVar) {
            bVar.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Q4.h.b(this.c, bVar);
            Q4.f.a(this.c, bVar);
        }
    }
}
