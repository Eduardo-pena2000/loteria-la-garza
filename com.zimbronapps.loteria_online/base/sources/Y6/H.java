package Y6;

import android.content.pm.ShortcutManager;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class h implements OnSuccessListener {
    public final /* synthetic */ ShortcutManager a;

    public /* synthetic */ h(ShortcutManager shortcutManager) {
        this.a = shortcutManager;
    }

    public final void onSuccess(Object obj) {
        w wVar = (w) obj;
        List O1 = wVar.O1();
        ShortcutManager shortcutManager = this.a;
        if (O1 != null && !O1.isEmpty()) {
            d.a(shortcutManager, O1);
        }
        List zza = wVar.zza();
        if (zza != null && !zza.isEmpty()) {
            e.a(shortcutManager, zza);
        }
        List M1 = wVar.M1();
        if (M1 != null && !M1.isEmpty()) {
            f.a(shortcutManager, M1);
        }
        List N1 = wVar.N1();
        if (N1 == null || N1.isEmpty()) {
            return;
        }
        g.a(shortcutManager, N1);
    }
}
