package Q4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class h {
    public final WorkDatabase a;

    public h(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void b(Context context, m4.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.i();
            try {
                bVar.K("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                bVar.K("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                bVar.I();
            } finally {
                bVar.U();
            }
        }
    }

    public boolean a() {
        Long b = this.a.x().b("reschedule_needed");
        return b != null && b.longValue() == 1;
    }

    public void c(boolean z) {
        this.a.x().a(new P4.d("reschedule_needed", z));
    }
}
