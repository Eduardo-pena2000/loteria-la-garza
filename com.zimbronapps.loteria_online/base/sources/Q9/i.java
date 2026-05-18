package q9;

import android.content.Context;
import da.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i implements j.c {
    public final Context a;
    public final da.b b;
    public final Map c = new HashMap();

    public i(Context context, da.b bVar) {
        this.a = context;
        this.b = bVar;
    }

    public void a() {
        Iterator it = new ArrayList(this.c.values()).iterator();
        while (it.hasNext()) {
            ((e) it.next()).D0();
        }
        this.c.clear();
    }

    public void onMethodCall(da.i iVar, j.d dVar) {
        String str = iVar.a;
        str.hashCode();
        switch (str) {
            case "init":
                String str2 = (String) iVar.a("id");
                if (!this.c.containsKey(str2)) {
                    this.c.put(str2, new e(this.a, this.b, str2, (Map) iVar.a("audioLoadConfiguration"), (List) iVar.a("androidAudioEffects"), (Map) iVar.a("androidAudioOffloadPreferences"), (Boolean) iVar.a("androidOffloadSchedulingEnabled"), ((Boolean) iVar.a("useLazyPreparation")).booleanValue()));
                    dVar.a(null);
                    break;
                } else {
                    dVar.b("Platform player " + str2 + " already exists", null, null);
                    break;
                }
            case "disposePlayer":
                String str3 = (String) iVar.a("id");
                e eVar = (e) this.c.get(str3);
                if (eVar != null) {
                    eVar.D0();
                    this.c.remove(str3);
                }
                dVar.a(new HashMap());
                break;
            case "disposeAllPlayers":
                a();
                dVar.a(new HashMap());
                break;
            default:
                dVar.c();
                break;
        }
    }
}
