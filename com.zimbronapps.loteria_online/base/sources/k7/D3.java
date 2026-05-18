package k7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.internal.measurement.zzr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d3 extends M6 implements l {
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final w.z j;
    public final zzr k;
    public final Map l;
    public final Map m;
    public final Map n;

    public d3(b7 b7Var) {
        super(b7Var);
        this.d = new w.a();
        this.e = new w.a();
        this.f = new w.a();
        this.g = new w.a();
        this.h = new w.a();
        this.l = new w.a();
        this.m = new w.a();
        this.n = new w.a();
        this.i = new w.a();
        this.j = new W2(this, 20);
        this.k = new X2(this);
    }

    public static final Map u(zzgl zzglVar) {
        w.a aVar = new w.a();
        if (zzglVar != null) {
            for (zzgt zzgtVar : zzglVar.zze()) {
                aVar.put(zzgtVar.zza(), zzgtVar.zzb());
            }
        }
        return aVar;
    }

    public static final Z3 v(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return Z3.AD_STORAGE;
        }
        if (i2 == 2) {
            return Z3.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return Z3.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return Z3.AD_PERSONALIZATION;
    }

    public final void A(String str) {
        h();
        this.m.put(str, (Object) null);
    }

    public final void B(String str) {
        h();
        this.h.remove(str);
    }

    public final boolean C(String str, byte[] bArr, String str2, String str3) {
        j();
        h();
        com.google.android.gms.common.internal.t.f(str);
        zzgk zzgkVar = (zzgk) t(str, bArr).zzcl();
        r(str, zzgkVar);
        s(str, (zzgl) zzgkVar.zzbc());
        this.h.put(str, (zzgl) zzgkVar.zzbc());
        this.l.put(str, zzgkVar.zzh());
        this.m.put(str, str2);
        this.n.put(str, str3);
        this.d.put(str, u((zzgl) zzgkVar.zzbc()));
        this.b.F0().Y(str, new ArrayList(zzgkVar.zzd()));
        try {
            zzgkVar.zze();
            bArr = ((zzgl) zzgkVar.zzbc()).zzcc();
        } catch (RuntimeException e) {
            this.a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", C2.x(str), e);
        }
        w F0 = this.b.F0();
        com.google.android.gms.common.internal.t.f(str);
        F0.h();
        F0.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (F0.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                F0.a.a().o().b("Failed to update remote config (got 0). appId", C2.x(str));
            }
        } catch (SQLiteException e2) {
            F0.a.a().o().c("Error storing remote config. appId", C2.x(str), e2);
        }
        zzgkVar.zzf();
        this.h.put(str, (zzgl) zzgkVar.zzbc());
        return true;
    }

    public final boolean D(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if (H(str) && l7.N(str2)) {
            return true;
        }
        if (I(str) && l7.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean E(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final Set F(String str) {
        h();
        q(str);
        return (Set) this.e.get(str);
    }

    public final int G(String str, String str2) {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean H(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean I(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_public"));
    }

    public final boolean J(String str) {
        h();
        q(str);
        Map map = this.e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean K(String str) {
        h();
        q(str);
        Map map = this.e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean L(String str) {
        h();
        q(str);
        Map map = this.e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    public final boolean M(String str) {
        h();
        q(str);
        Map map = this.e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    public final boolean N(String str) {
        h();
        q(str);
        Map map = this.e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    public final boolean O(String str) {
        h();
        q(str);
        Map map = this.e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    public final boolean P(String str, Z3 z3) {
        h();
        q(str);
        zzgf R = R(str);
        if (R == null) {
            return false;
        }
        Iterator it = R.zza().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfu zzfuVar = (zzfu) it.next();
            if (z3 == v(zzfuVar.zzb())) {
                if (zzfuVar.zzc() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Z3 Q(String str, Z3 z3) {
        h();
        q(str);
        zzgf R = R(str);
        if (R == null) {
            return null;
        }
        for (zzfw zzfwVar : R.zzb()) {
            if (z3 == v(zzfwVar.zzb())) {
                return v(zzfwVar.zzc());
            }
        }
        return null;
    }

    public final zzgf R(String str) {
        h();
        q(str);
        zzgl w = w(str);
        if (w == null || !w.zzn()) {
            return null;
        }
        return w.zzo();
    }

    public final boolean S(String str) {
        h();
        q(str);
        zzgf R = R(str);
        return R == null || !R.zzd() || R.zze();
    }

    public final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        zzgf R = R(str);
        if (R != null) {
            Iterator it = R.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(((zzgc) it.next()).zza());
            }
        }
        return treeSet;
    }

    public final String f(String str, String str2) {
        h();
        q(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean l() {
        return false;
    }

    public final X3 m(String str, Z3 z3) {
        h();
        q(str);
        zzgf R = R(str);
        if (R == null) {
            return X3.UNINITIALIZED;
        }
        for (zzfu zzfuVar : R.zzf()) {
            if (v(zzfuVar.zzb()) == z3) {
                int zzc = zzfuVar.zzc() - 1;
                return zzc != 1 ? zzc != 2 ? X3.UNINITIALIZED : X3.DENIED : X3.GRANTED;
            }
        }
        return X3.UNINITIALIZED;
    }

    public final boolean n(String str) {
        h();
        q(str);
        zzgf R = R(str);
        if (R == null) {
            return false;
        }
        for (zzfu zzfuVar : R.zza()) {
            if (zzfuVar.zzb() == 3 && zzfuVar.zzd() == 3) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ zzc o(String str) {
        j();
        com.google.android.gms.common.internal.t.f(str);
        r N0 = this.b.F0().N0(str);
        if (N0 == null) {
            return null;
        }
        this.a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, N0.a));
        return (zzc) this.j.snapshot().get(str);
    }

    public final /* synthetic */ Map p() {
        return this.d;
    }

    public final void q(String str) {
        j();
        h();
        com.google.android.gms.common.internal.t.f(str);
        Map map = this.h;
        if (map.get(str) == null) {
            r N0 = this.b.F0().N0(str);
            if (N0 != null) {
                zzgk zzgkVar = (zzgk) t(str, N0.a).zzcl();
                r(str, zzgkVar);
                this.d.put(str, u((zzgl) zzgkVar.zzbc()));
                map.put(str, (zzgl) zzgkVar.zzbc());
                s(str, (zzgl) zzgkVar.zzbc());
                this.l.put(str, zzgkVar.zzh());
                this.m.put(str, N0.b);
                this.n.put(str, N0.c);
                return;
            }
            this.d.put(str, (Object) null);
            this.f.put(str, (Object) null);
            this.e.put(str, (Object) null);
            this.g.put(str, (Object) null);
            map.put(str, (Object) null);
            this.l.put(str, (Object) null);
            this.m.put(str, (Object) null);
            this.n.put(str, (Object) null);
            this.i.put(str, (Object) null);
        }
    }

    public final void r(String str, zzgk zzgkVar) {
        HashSet hashSet = new HashSet();
        w.a aVar = new w.a();
        w.a aVar2 = new w.a();
        w.a aVar3 = new w.a();
        Iterator it = zzgkVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((zzgh) it.next()).zza());
        }
        for (int i = 0; i < zzgkVar.zza(); i++) {
            zzgi zzgiVar = (zzgi) zzgkVar.zzb(i).zzcl();
            if (zzgiVar.zza().isEmpty()) {
                this.a.a().r().a("EventConfig contained null event name");
            } else {
                String zza = zzgiVar.zza();
                String b = b4.b(zzgiVar.zza());
                if (!TextUtils.isEmpty(b)) {
                    zzgiVar.zzb(b);
                    zzgkVar.zzc(i, zzgiVar);
                }
                if (zzgiVar.zzc() && zzgiVar.zzd()) {
                    aVar.put(zza, Boolean.TRUE);
                }
                if (zzgiVar.zze() && zzgiVar.zzf()) {
                    aVar2.put(zzgiVar.zza(), Boolean.TRUE);
                }
                if (zzgiVar.zzg()) {
                    if (zzgiVar.zzh() < 2 || zzgiVar.zzh() > 65535) {
                        this.a.a().r().c("Invalid sampling rate. Event name, sample rate", zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    } else {
                        aVar3.put(zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f.put(str, aVar);
        this.g.put(str, aVar2);
        this.i.put(str, aVar3);
    }

    public final void s(String str, zzgl zzglVar) {
        if (zzglVar.zzj() == 0) {
            this.j.remove(str);
            return;
        }
        q3 q3Var = this.a;
        q3Var.a().w().b("EES programs found", Integer.valueOf(zzglVar.zzj()));
        zzja zzjaVar = (zzja) zzglVar.zzi().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zza("internal.remoteConfig", new c3(this, str));
            zzcVar.zza("internal.appMetadata", new Z2(this, str));
            zzcVar.zza("internal.logger", new a3(this));
            zzcVar.zzf(zzjaVar);
            this.j.put(str, zzcVar);
            q3Var.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(zzjaVar.zzb().zzb()));
            Iterator it = zzjaVar.zzb().zza().iterator();
            while (it.hasNext()) {
                q3Var.a().w().b("EES program activity", ((zziy) it.next()).zza());
            }
        } catch (zzd unused) {
            this.a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    public final zzgl t(String str, byte[] bArr) {
        if (bArr == null) {
            return zzgl.zzs();
        }
        try {
            zzgl zzglVar = (zzgl) ((zzgk) g7.W(zzgl.zzr(), bArr)).zzbc();
            this.a.a().w().c("Parsed config. version, gmp_app_id", zzglVar.zza() ? Long.valueOf(zzglVar.zzb()) : null, zzglVar.zzc() ? zzglVar.zzd() : null);
            return zzglVar;
        } catch (RuntimeException e) {
            this.a.a().r().c("Unable to merge remote config. appId", C2.x(str), e);
            return zzgl.zzs();
        } catch (zzmr e2) {
            this.a.a().r().c("Unable to merge remote config. appId", C2.x(str), e2);
            return zzgl.zzs();
        }
    }

    public final zzgl w(String str) {
        j();
        h();
        com.google.android.gms.common.internal.t.f(str);
        q(str);
        return (zzgl) this.h.get(str);
    }

    public final String x(String str) {
        h();
        q(str);
        return (String) this.l.get(str);
    }

    public final String y(String str) {
        h();
        return (String) this.m.get(str);
    }

    public final String z(String str) {
        h();
        return (String) this.n.get(str);
    }
}
