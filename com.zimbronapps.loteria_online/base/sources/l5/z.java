package L5;

import S5.d1;
import S5.u2;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z {
    public final d1 a;
    public final List b = new ArrayList();
    public k c;

    public z(d1 d1Var) {
        this.a = d1Var;
        if (d1Var != null) {
            try {
                List zzg = d1Var.zzg();
                if (zzg != null) {
                    Iterator it = zzg.iterator();
                    while (it.hasNext()) {
                        k i = k.i((u2) it.next());
                        if (i != null) {
                            this.b.add(i);
                        }
                    }
                }
            } catch (RemoteException e) {
                W5.p.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        d1 d1Var2 = this.a;
        if (d1Var2 == null) {
            return;
        }
        try {
            u2 zzh = d1Var2.zzh();
            if (zzh != null) {
                this.c = k.i(zzh);
            }
        } catch (RemoteException e2) {
            W5.p.d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    public static z g(d1 d1Var) {
        if (d1Var != null) {
            return new z(d1Var);
        }
        return null;
    }

    public static z h(d1 d1Var) {
        return new z(d1Var);
    }

    public List a() {
        return this.b;
    }

    public k b() {
        return this.c;
    }

    public String c() {
        try {
            d1 d1Var = this.a;
            if (d1Var != null) {
                return d1Var.zze();
            }
            return null;
        } catch (RemoteException e) {
            W5.p.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public Bundle d() {
        try {
            d1 d1Var = this.a;
            if (d1Var != null) {
                return d1Var.zzi();
            }
        } catch (RemoteException e) {
            W5.p.d("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    public String e() {
        try {
            d1 d1Var = this.a;
            if (d1Var != null) {
                return d1Var.zzf();
            }
            return null;
        } catch (RemoteException e) {
            W5.p.d("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        String e = e();
        if (e == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", e);
        }
        String c = c();
        if (c == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", c);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((k) it.next()).j());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        k kVar = this.c;
        if (kVar != null) {
            jSONObject.put("Loaded Adapter Response", kVar.j());
        }
        Bundle d = d();
        if (d != null) {
            jSONObject.put("Response Extras", S5.B.a().v(d));
        }
        return jSONObject;
    }

    public final d1 i() {
        return this.a;
    }

    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
