package ga;

import Y9.a;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import ca.q;
import da.j;
import da.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c implements Y9.a, Z9.a, l, q.b {
    public final q a;
    public final PackageManager b;
    public Z9.c c;
    public Map d;
    public Map e = new HashMap();

    public c(q qVar) {
        this.a = qVar;
        this.b = qVar.b;
        qVar.b(this);
    }

    public void a(String str, String str2, boolean z, j.d dVar) {
        if (this.c == null) {
            dVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map map = this.d;
        if (map == null) {
            dVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            dVar.b("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = dVar.hashCode();
        this.e.put(Integer.valueOf(hashCode), dVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
        this.c.getActivity().startActivityForResult(intent, hashCode);
    }

    public Map b() {
        if (this.d == null) {
            c();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.d.keySet()) {
            hashMap.put(str, ((ResolveInfo) this.d.get(str)).loadLabel(this.b).toString());
        }
        return hashMap;
    }

    public final void c() {
        this.d = new HashMap();
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        for (ResolveInfo resolveInfo : Build.VERSION.SDK_INT >= 33 ? b.a(this.b, type, a.a(0L)) : this.b.queryIntentActivities(type, 0)) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.b).toString();
            this.d.put(str, resolveInfo);
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (!this.e.containsKey(Integer.valueOf(i))) {
            return false;
        }
        ((j.d) this.e.remove(Integer.valueOf(i))).a(i2 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    public void onAttachedToActivity(Z9.c cVar) {
        this.c = cVar;
        cVar.f(this);
    }

    public void onDetachedFromActivity() {
        this.c.e(this);
        this.c = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.c.e(this);
        this.c = null;
    }

    public void onReattachedToActivityForConfigChanges(Z9.c cVar) {
        this.c = cVar;
        cVar.f(this);
    }

    public void onAttachedToEngine(a.b bVar) {
    }

    public void onDetachedFromEngine(a.b bVar) {
    }
}
