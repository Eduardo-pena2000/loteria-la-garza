package Y6;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity;
import com.google.android.gms.internal.games_v2.zzfk;
import com.google.android.gms.internal.games_v2.zzfw;
import com.google.android.gms.internal.games_v2.zzfz;
import com.google.android.gms.internal.games_v2.zzge;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class t extends v {
    public final Context a;

    public t(Context context) {
        super(null);
        this.a = context.getApplicationContext();
    }

    public static /* synthetic */ w c(zzfz zzfzVar, zzfz zzfzVar2, Task task) {
        return task.isSuccessful() ? (w) task.getResult() : e(zzfzVar, zzfzVar2);
    }

    public static /* synthetic */ void d(t tVar) {
        Task forResult;
        ShortcutManager a = k.a(tVar.a.getSystemService(j.a()));
        if (a == null) {
            return;
        }
        I a2 = K.a(tVar.a, PlayGamesAppShortcutsActivity.class);
        zzfz g = g(l.a(a));
        zzfz g2 = g(m.a(a));
        if (a2 == null || a2.zza() <= 0) {
            forResult = Tasks.forResult(e(g, g2));
        } else {
            H h = new H(tVar.a);
            forResult = h.doRead(com.google.android.gms.common.api.internal.w.builder().e(6744).d(T6.z.g).c(false).b(new B(h, a2, g, g2)).a()).continueWith(zzge.zza(), new c(g, g2));
        }
        forResult.addOnSuccessListener(zzge.zza(), new h(a));
    }

    public static w e(zzfz zzfzVar, zzfz zzfzVar2) {
        return new w(f(zzfzVar), zzfz.zzg(), f(zzfzVar2), zzfz.zzg());
    }

    public static zzfz f(zzfz zzfzVar) {
        zzfw zzfwVar = new zzfw();
        int size = zzfzVar.size();
        for (int i = 0; i < size; i++) {
            String zza = ((z) zzfzVar.get(i)).zza();
            if (zza != null) {
                zzfwVar.zza(zza);
            }
        }
        return zzfwVar.zzb();
    }

    public static zzfz g(List list) {
        zzfw zzfwVar = new zzfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfo a = n.a(it.next());
            if (!o.a(a) && p.a(a).startsWith("PLAY_GAMES_SERVICES_")) {
                zzfwVar.zza(new z(p.a(a), q.a(a), Boolean.valueOf(r.a(a)), Boolean.valueOf(s.a(a))));
            }
        }
        return zzfwVar.zzb();
    }

    public final void a() {
        zzfk.zza();
        new Thread(new i(this), "initialize-shortcuts").start();
    }
}
