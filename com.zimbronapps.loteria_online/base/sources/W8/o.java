package w8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class o {
    public static final byte[] n = new byte[0];
    public final Context a;
    public final B7.g b;
    public final C7.c c;
    public final Executor d;
    public final x8.e e;
    public final x8.e f;
    public final x8.e g;
    public final com.google.firebase.remoteconfig.internal.c h;
    public final x8.l i;
    public final com.google.firebase.remoteconfig.internal.e j;
    public final m8.h k;
    public final x8.m l;
    public final y8.e m;

    public o(Context context, B7.g gVar, m8.h hVar, C7.c cVar, Executor executor, x8.e eVar, x8.e eVar2, x8.e eVar3, com.google.firebase.remoteconfig.internal.c cVar2, x8.l lVar, com.google.firebase.remoteconfig.internal.e eVar4, x8.m mVar, y8.e eVar5) {
        this.a = context;
        this.b = gVar;
        this.k = hVar;
        this.c = cVar;
        this.d = executor;
        this.e = eVar;
        this.f = eVar2;
        this.g = eVar3;
        this.h = cVar2;
        this.i = lVar;
        this.j = eVar4;
        this.l = mVar;
        this.m = eVar5;
    }

    public static List G(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, jSONObject.getString(str));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static /* synthetic */ Void a(o oVar, u uVar) {
        return oVar.w(uVar);
    }

    public static /* synthetic */ boolean b(o oVar, Task task) {
        return oVar.z(task);
    }

    public static /* synthetic */ Void c(o oVar, e eVar) {
        return oVar.x(eVar);
    }

    public static /* synthetic */ Task d(com.google.firebase.remoteconfig.internal.b bVar) {
        return y(bVar);
    }

    public static /* synthetic */ s e(Task task, Task task2) {
        return t(task, task2);
    }

    public static /* synthetic */ Task f(c.a aVar) {
        return u(aVar);
    }

    public static /* synthetic */ Task g(o oVar, Void r1) {
        return oVar.v(r1);
    }

    public static /* synthetic */ Task h(o oVar, Task task, Task task2, Task task3) {
        return oVar.s(task, task2, task3);
    }

    public static o p(B7.g gVar) {
        return ((z) gVar.k(z.class)).g();
    }

    public static boolean r(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return bVar2 == null || !bVar.h().equals(bVar2.h());
    }

    public static /* synthetic */ s t(Task task, Task task2) {
        return (s) task.getResult();
    }

    public static /* synthetic */ Task u(c.a aVar) {
        return Tasks.forResult(null);
    }

    public static /* synthetic */ Task y(com.google.firebase.remoteconfig.internal.b bVar) {
        return Tasks.forResult(null);
    }

    public Task A(u uVar) {
        return Tasks.call(this.d, new h(this, uVar));
    }

    public void B(boolean z) {
        this.l.e(z);
    }

    public Task C(e eVar) {
        return Tasks.call(this.d, new n(this, eVar));
    }

    public Task D(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put((String) entry.getKey(), value.toString());
            }
        }
        return E(hashMap);
    }

    public final Task E(Map map) {
        try {
            return this.g.k(com.google.firebase.remoteconfig.internal.b.l().b(map).a()).onSuccessTask(M7.z.a(), new g());
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            return Tasks.forResult(null);
        }
    }

    public void F() {
        this.f.e();
        this.g.e();
        this.e.e();
    }

    public void H(JSONArray jSONArray) {
        if (this.c == null) {
            return;
        }
        try {
            this.c.m(G(jSONArray));
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
        } catch (C7.a e2) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
        }
    }

    public Task i() {
        Task e = this.e.e();
        Task e2 = this.f.e();
        return Tasks.whenAllComplete(e, e2).continueWithTask(this.d, new f(this, e, e2));
    }

    public d j(c cVar) {
        return this.l.b(cVar);
    }

    public Task k() {
        Task e = this.f.e();
        Task e2 = this.g.e();
        Task e3 = this.e.e();
        Task call = Tasks.call(this.d, new i(this));
        return Tasks.whenAllComplete(e, e2, e3, call, this.k.getId(), this.k.a(false)).continueWith(this.d, new j(call));
    }

    public Task l() {
        return this.h.i().onSuccessTask(M7.z.a(), new l());
    }

    public Task m() {
        return l().onSuccessTask(this.d, new k(this));
    }

    public Map n() {
        return this.i.d();
    }

    public s o() {
        return this.j.d();
    }

    public y8.e q() {
        return this.m;
    }

    public final /* synthetic */ Task s(Task task, Task task2, Task task3) {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) task.getResult();
        return (!task2.isSuccessful() || r(bVar, (com.google.firebase.remoteconfig.internal.b) task2.getResult())) ? this.f.k(bVar).continueWith(this.d, new m(this)) : Tasks.forResult(Boolean.FALSE);
    }

    public final /* synthetic */ Task v(Void r1) {
        return i();
    }

    public final /* synthetic */ Void w(u uVar) {
        this.j.m(uVar);
        return null;
    }

    public final /* synthetic */ Void x(e eVar) {
        this.j.n(eVar.a);
        return null;
    }

    public final boolean z(Task task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.e.d();
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) task.getResult();
        if (bVar == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        H(bVar.e());
        this.m.g(bVar);
        return true;
    }
}
