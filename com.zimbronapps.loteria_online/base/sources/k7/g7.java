package k7;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzlr;
import com.google.android.gms.internal.measurement.zznl;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g7 extends M6 {
    public g7(b7 b7Var) {
        super(b7Var);
    }

    public static final String A(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final Object B(zzhw zzhwVar) {
        if (zzhwVar.zzc()) {
            return zzhwVar.zzd();
        }
        if (zzhwVar.zze()) {
            return Long.valueOf(zzhwVar.zzf());
        }
        if (zzhwVar.zzi()) {
            return Double.valueOf(zzhwVar.zzj());
        }
        if (zzhwVar.zzm() > 0) {
            return Y(zzhwVar.zzk());
        }
        return null;
    }

    public static final void C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z(builder, str3, string, set);
            }
        }
    }

    public static final void D(StringBuilder sb, int i, String str, zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        y(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zziiVar.zzd() != 0) {
            y(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : zziiVar.zzc()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zziiVar.zzb() != 0) {
            y(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : zziiVar.zza()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zziiVar.zzf() != 0) {
            y(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (zzhq zzhqVar : zziiVar.zze()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzhqVar.zza() ? Integer.valueOf(zzhqVar.zzb()) : null);
                sb.append(":");
                sb.append(zzhqVar.zzc() ? Long.valueOf(zzhqVar.zzd()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zziiVar.zzh() != 0) {
            y(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (zzik zzikVar : zziiVar.zzg()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zzikVar.zza() ? Integer.valueOf(zzikVar.zzb()) : null);
                sb.append(": [");
                Iterator it = zzikVar.zzc().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        y(sb, 3);
        sb.append("}\n");
    }

    public static final void E(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void F(StringBuilder sb, int i, String str, zzfl zzflVar) {
        if (zzflVar == null) {
            return;
        }
        y(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzflVar.zza()) {
            int zzm = zzflVar.zzm();
            E(sb, i, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzflVar.zzb()) {
            E(sb, i, "match_as_float", Boolean.valueOf(zzflVar.zzc()));
        }
        if (zzflVar.zzd()) {
            E(sb, i, "comparison_value", zzflVar.zze());
        }
        if (zzflVar.zzf()) {
            E(sb, i, "min_comparison_value", zzflVar.zzg());
        }
        if (zzflVar.zzh()) {
            E(sb, i, "max_comparison_value", zzflVar.zzi());
        }
        y(sb, i);
        sb.append("}\n");
    }

    public static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean P(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static List Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static zznl W(zznl zznlVar, byte[] bArr) {
        zzlr zza = zzlr.zza();
        return zza != null ? zznlVar.zzaV(bArr, zza) : zznlVar.zzaW(bArr);
    }

    public static int X(zzic zzicVar, String str) {
        for (int i = 0; i < zzicVar.zzl(); i++) {
            if (str.equals(zzicVar.zzm(i).zzc())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (zzhw zzhwVar2 : zzhwVar.zzk()) {
                    if (zzhwVar2.zzc()) {
                        bundle.putString(zzhwVar2.zzb(), zzhwVar2.zzd());
                    } else if (zzhwVar2.zze()) {
                        bundle.putLong(zzhwVar2.zzb(), zzhwVar2.zzf());
                    } else if (zzhwVar2.zzi()) {
                        bundle.putDouble(zzhwVar2.zzb(), zzhwVar2.zzj());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(zzhr zzhrVar, String str, Object obj) {
        List zza = zzhrVar.zza();
        int i = 0;
        while (true) {
            if (i >= zza.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzhw) zza.get(i)).zzb())) {
                break;
            } else {
                i++;
            }
        }
        zzhv zzn = zzhw.zzn();
        zzn.zzb(str);
        zzn.zzf(((Long) obj).longValue());
        if (i >= 0) {
            zzhrVar.zze(i, zzn);
        } else {
            zzhrVar.zzg(zzn);
        }
    }

    public static final boolean p(I i, n7 n7Var) {
        com.google.android.gms.common.internal.t.l(i);
        com.google.android.gms.common.internal.t.l(n7Var);
        return !TextUtils.isEmpty(n7Var.b);
    }

    public static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            String zzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putDouble(zzb, zzhwVar.zzj());
            } else if (zzhwVar.zzg()) {
                bundle.putFloat(zzb, zzhwVar.zzh());
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putLong(zzb, zzhwVar.zzf());
            }
        }
        return bundle;
    }

    public static final zzhw r(zzhs zzhsVar, String str) {
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    public static final Map s(zzhs zzhsVar, String... strArr) {
        Object B;
        HashMap hashMap = new HashMap();
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (Arrays.asList(strArr).contains(zzhwVar.zzb()) && (B = B(zzhwVar)) != null) {
                hashMap.put(zzhwVar.zzb(), B);
            }
        }
        return hashMap;
    }

    public static final Map t(zzhs zzhsVar, String str) {
        Object B;
        HashMap hashMap = new HashMap();
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().startsWith("gad_") && (B = B(zzhwVar)) != null) {
                hashMap.put(zzhwVar.zzb(), B);
            }
        }
        return hashMap;
    }

    public static final Object u(zzhs zzhsVar, String str) {
        zzhw r = r(zzhsVar, str);
        if (r == null) {
            return null;
        }
        return B(r);
    }

    public static final Object v(zzhs zzhsVar, String str, Object obj) {
        Object u = u(zzhsVar, str);
        return u == null ? obj : u;
    }

    public static final void y(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final void G(zzit zzitVar, Object obj) {
        com.google.android.gms.common.internal.t.l(obj);
        zzitVar.zzd();
        zzitVar.zzf();
        zzitVar.zzh();
        if (obj instanceof String) {
            zzitVar.zzc((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzitVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzitVar.zzg(((Double) obj).doubleValue());
        } else {
            this.a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void H(zzhv zzhvVar, Object obj) {
        com.google.android.gms.common.internal.t.l(obj);
        zzhvVar.zze();
        zzhvVar.zzg();
        zzhvVar.zzi();
        zzhvVar.zzm();
        if (obj instanceof String) {
            zzhvVar.zzd((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.zzf(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzhvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (BaseBundle baseBundle : (Bundle[]) obj) {
            if (baseBundle != null) {
                zzhv zzn = zzhw.zzn();
                for (String str : baseBundle.keySet()) {
                    zzhv zzn2 = zzhw.zzn();
                    zzn2.zzb(str);
                    Object obj2 = baseBundle.get(str);
                    if (obj2 instanceof Long) {
                        zzn2.zzf(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzn2.zzd((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzn2.zzh(((Double) obj2).doubleValue());
                    }
                    zzn.zzk(zzn2);
                }
                if (zzn.zzj() > 0) {
                    arrayList.add((zzhw) zzn.zzbc());
                }
            }
        }
        zzhvVar.zzl(arrayList);
    }

    public final B6 I(String str, zzic zzicVar, zzhr zzhrVar, String str2) {
        int indexOf;
        zzqp.zza();
        q3 q3Var = this.a;
        if (!q3Var.w().H(str, f2.Q0)) {
            return null;
        }
        long a = q3Var.e().a();
        Set a2 = f7.a(q3Var.w().C(str, f2.v0).split(","));
        b7 b7Var = this.b;
        O6 C0 = b7Var.C0();
        String x = C0.b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        q3 q3Var2 = C0.a;
        builder.scheme(q3Var2.w().C(str, f2.o0));
        if (TextUtils.isEmpty(x)) {
            builder.authority(q3Var2.w().C(str, f2.p0));
        } else {
            String C = q3Var2.w().C(str, f2.p0);
            StringBuilder sb = new StringBuilder(String.valueOf(x).length() + 1 + String.valueOf(C).length());
            sb.append(x);
            sb.append(".");
            sb.append(C);
            builder.authority(sb.toString());
        }
        builder.path(q3Var2.w().C(str, f2.q0));
        z(builder, "gmp_app_id", zzicVar.zzac(), a2);
        q3Var.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), a2);
        String zzV = zzicVar.zzV();
        m w = q3Var.w();
        e2 e2Var = f2.T0;
        if (w.H(str, e2Var) && b7Var.D0().N(str)) {
            zzV = "";
        }
        z(builder, "app_instance_id", zzV, a2);
        z(builder, "rdid", zzicVar.zzP(), a2);
        z(builder, "bundle_id", zzicVar.zzK(), a2);
        String zzk = zzhrVar.zzk();
        String a3 = b4.a(zzk);
        if (true != TextUtils.isEmpty(a3)) {
            zzk = a3;
        }
        z(builder, "app_event_name", zzk, a2);
        z(builder, "app_version", String.valueOf(zzicVar.zzai()), a2);
        String zzD = zzicVar.zzD();
        if (q3Var.w().H(str, e2Var) && b7Var.D0().K(str) && !TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
            zzD = zzD.substring(0, indexOf);
        }
        z(builder, "os_version", zzD, a2);
        z(builder, "timestamp", String.valueOf(zzhrVar.zzn()), a2);
        if (zzicVar.zzS()) {
            z(builder, "lat", "1", a2);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(zzicVar.zzaG()), a2);
        z(builder, "trigger_uri_source", "1", a2);
        z(builder, "trigger_uri_timestamp", String.valueOf(a), a2);
        z(builder, "request_uuid", str2, a2);
        List<zzhw> zza = zzhrVar.zza();
        Bundle bundle = new Bundle();
        for (zzhw zzhwVar : zza) {
            String zzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzj()));
            } else if (zzhwVar.zzg()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzh()));
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzf()));
            }
        }
        C(builder, q3Var.w().C(str, f2.u0).split("\\|"), bundle, a2);
        List<zziu> zzk2 = zzicVar.zzk();
        Bundle bundle2 = new Bundle();
        for (zziu zziuVar : zzk2) {
            String zzc = zziuVar.zzc();
            if (zziuVar.zzj()) {
                bundle2.putString(zzc, String.valueOf(zziuVar.zzk()));
            } else if (zziuVar.zzh()) {
                bundle2.putString(zzc, String.valueOf(zziuVar.zzi()));
            } else if (zziuVar.zzd()) {
                bundle2.putString(zzc, zziuVar.zze());
            } else if (zziuVar.zzf()) {
                bundle2.putString(zzc, String.valueOf(zziuVar.zzg()));
            }
        }
        C(builder, q3Var.w().C(str, f2.t0).split("\\|"), bundle2, a2);
        z(builder, "dma", true != zzicVar.zzaC() ? "0" : "1", a2);
        if (!zzicVar.zzaE().isEmpty()) {
            z(builder, "dma_cps", zzicVar.zzaE(), a2);
        }
        if (zzicVar.zzaK()) {
            zzha zzaL = zzicVar.zzaL();
            if (!zzaL.zzb().isEmpty()) {
                z(builder, "dl_gclid", zzaL.zzb(), a2);
            }
            if (!zzaL.zzd().isEmpty()) {
                z(builder, "dl_gbraid", zzaL.zzd(), a2);
            }
            if (!zzaL.zzf().isEmpty()) {
                z(builder, "dl_gs", zzaL.zzf(), a2);
            }
            if (zzaL.zzh() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(zzaL.zzh()), a2);
            }
            if (!zzaL.zzj().isEmpty()) {
                z(builder, "mr_gclid", zzaL.zzj(), a2);
            }
            if (!zzaL.zzm().isEmpty()) {
                z(builder, "mr_gbraid", zzaL.zzm(), a2);
            }
            if (!zzaL.zzo().isEmpty()) {
                z(builder, "mr_gs", zzaL.zzo(), a2);
            }
            if (zzaL.zzq() > 0) {
                z(builder, "mr_click_ts", String.valueOf(zzaL.zzq()), a2);
            }
        }
        return new B6(builder.build().toString(), a, 1);
    }

    public final zzhs J(D d) {
        zzhr zzk = zzhs.zzk();
        zzk.zzq(d.e);
        G g = d.f;
        F f = new F(g);
        while (f.hasNext()) {
            String next = f.next();
            zzhv zzn = zzhw.zzn();
            zzn.zzb(next);
            Object M1 = g.M1(next);
            com.google.android.gms.common.internal.t.l(M1);
            H(zzn, M1);
            zzk.zzg(zzn);
        }
        String str = d.c;
        if (!TextUtils.isEmpty(str) && g.M1("_o") == null) {
            zzhv zzn2 = zzhw.zzn();
            zzn2.zzb("_o");
            zzn2.zzd(str);
            zzk.zzf((zzhw) zzn2.zzbc());
        }
        return (zzhs) zzk.zzbc();
    }

    public final String K(zzib zzibVar) {
        zzhe zzat;
        if (zzibVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (zzibVar.zzf()) {
            E(sb, 0, "upload_subdomain", zzibVar.zzg());
        }
        if (zzibVar.zzd()) {
            E(sb, 0, "sgtm_join_id", zzibVar.zze());
        }
        for (zzid zzidVar : zzibVar.zza()) {
            if (zzidVar != null) {
                y(sb, 1);
                sb.append("bundle {\n");
                if (zzidVar.zza()) {
                    E(sb, 1, "protocol_version", Integer.valueOf(zzidVar.zzb()));
                }
                zzrb.zza();
                q3 q3Var = this.a;
                if (q3Var.w().H(zzidVar.zzA(), f2.N0) && zzidVar.zzag()) {
                    E(sb, 1, "session_stitching_token", zzidVar.zzah());
                }
                E(sb, 1, "platform", zzidVar.zzt());
                if (zzidVar.zzC()) {
                    E(sb, 1, "gmp_version", Long.valueOf(zzidVar.zzD()));
                }
                if (zzidVar.zzE()) {
                    E(sb, 1, "uploading_gmp_version", Long.valueOf(zzidVar.zzF()));
                }
                if (zzidVar.zzac()) {
                    E(sb, 1, "dynamite_version", Long.valueOf(zzidVar.zzad()));
                }
                if (zzidVar.zzW()) {
                    E(sb, 1, "config_version", Long.valueOf(zzidVar.zzX()));
                }
                E(sb, 1, "gmp_app_id", zzidVar.zzP());
                E(sb, 1, "app_id", zzidVar.zzA());
                E(sb, 1, "app_version", zzidVar.zzB());
                if (zzidVar.zzU()) {
                    E(sb, 1, "app_version_major", Integer.valueOf(zzidVar.zzV()));
                }
                E(sb, 1, "firebase_instance_id", zzidVar.zzT());
                if (zzidVar.zzK()) {
                    E(sb, 1, "dev_cert_hash", Long.valueOf(zzidVar.zzL()));
                }
                E(sb, 1, "app_store", zzidVar.zzz());
                if (zzidVar.zzi()) {
                    E(sb, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.zzj()));
                }
                if (zzidVar.zzk()) {
                    E(sb, 1, "start_timestamp_millis", Long.valueOf(zzidVar.zzm()));
                }
                if (zzidVar.zzn()) {
                    E(sb, 1, "end_timestamp_millis", Long.valueOf(zzidVar.zzo()));
                }
                if (zzidVar.zzp()) {
                    E(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.zzq()));
                }
                if (zzidVar.zzr()) {
                    E(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.zzs()));
                }
                E(sb, 1, "app_instance_id", zzidVar.zzJ());
                E(sb, 1, "resettable_device_id", zzidVar.zzG());
                E(sb, 1, "ds_id", zzidVar.zzZ());
                if (zzidVar.zzH()) {
                    E(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.zzI()));
                }
                E(sb, 1, "os_version", zzidVar.zzu());
                E(sb, 1, "device_model", zzidVar.zzv());
                E(sb, 1, "user_default_language", zzidVar.zzw());
                if (zzidVar.zzx()) {
                    E(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.zzy()));
                }
                if (zzidVar.zzM()) {
                    E(sb, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.zzN()));
                }
                if (zzidVar.zzau()) {
                    E(sb, 1, "delivery_index", Integer.valueOf(zzidVar.zzav()));
                }
                if (zzidVar.zzQ()) {
                    E(sb, 1, "service_upload", Boolean.valueOf(zzidVar.zzR()));
                }
                E(sb, 1, "health_monitor", zzidVar.zzO());
                if (zzidVar.zzaa()) {
                    E(sb, 1, "retry_counter", Integer.valueOf(zzidVar.zzab()));
                }
                if (zzidVar.zzae()) {
                    E(sb, 1, "consent_signals", zzidVar.zzaf());
                }
                if (zzidVar.zzan()) {
                    E(sb, 1, "is_dma_region", Boolean.valueOf(zzidVar.zzao()));
                }
                if (zzidVar.zzap()) {
                    E(sb, 1, "core_platform_services", zzidVar.zzaq());
                }
                if (zzidVar.zzal()) {
                    E(sb, 1, "consent_diagnostics", zzidVar.zzam());
                }
                if (zzidVar.zzai()) {
                    E(sb, 1, "target_os_version", Long.valueOf(zzidVar.zzaj()));
                }
                zzqp.zza();
                if (q3Var.w().H(zzidVar.zzA(), f2.Q0)) {
                    E(sb, 1, "ad_services_version", Integer.valueOf(zzidVar.zzar()));
                    if (zzidVar.zzas() && (zzat = zzidVar.zzat()) != null) {
                        y(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        E(sb, 2, "eligible", Boolean.valueOf(zzat.zza()));
                        E(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzat.zzb()));
                        E(sb, 2, "pre_r", Boolean.valueOf(zzat.zzc()));
                        E(sb, 2, "r_extensions_too_old", Boolean.valueOf(zzat.zzd()));
                        E(sb, 2, "adservices_extension_too_old", Boolean.valueOf(zzat.zze()));
                        E(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(zzat.zzf()));
                        E(sb, 2, "measurement_manager_disabled", Boolean.valueOf(zzat.zzg()));
                        y(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (zzidVar.zzaw()) {
                    zzha zzax = zzidVar.zzax();
                    y(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (zzax.zza()) {
                        E(sb, 2, "deep_link_gclid", zzax.zzb());
                    }
                    if (zzax.zzc()) {
                        E(sb, 2, "deep_link_gbraid", zzax.zzd());
                    }
                    if (zzax.zze()) {
                        E(sb, 2, "deep_link_gad_source", zzax.zzf());
                    }
                    if (zzax.zzg()) {
                        E(sb, 2, "deep_link_session_millis", Long.valueOf(zzax.zzh()));
                    }
                    if (zzax.zzi()) {
                        E(sb, 2, "market_referrer_gclid", zzax.zzj());
                    }
                    if (zzax.zzk()) {
                        E(sb, 2, "market_referrer_gbraid", zzax.zzm());
                    }
                    if (zzax.zzn()) {
                        E(sb, 2, "market_referrer_gad_source", zzax.zzo());
                    }
                    if (zzax.zzp()) {
                        E(sb, 2, "market_referrer_click_millis", Long.valueOf(zzax.zzq()));
                    }
                    y(sb, 2);
                    sb.append("}\n");
                }
                if (zzidVar.zzaA()) {
                    E(sb, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.zzaB()));
                }
                if (zzidVar.zzay()) {
                    zzis zzaz = zzidVar.zzaz();
                    y(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int zzf = zzaz.zzf();
                    E(sb, 2, "upload_type", zzf != 1 ? zzf != 2 ? zzf != 3 ? zzf != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    E(sb, 2, "client_upload_eligibility", zzaz.zza().name());
                    int zzg = zzaz.zzg();
                    E(sb, 2, "service_upload_eligibility", zzg != 1 ? zzg != 2 ? zzg != 3 ? zzg != 4 ? zzg != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    y(sb, 2);
                    sb.append("}\n");
                }
                if (zzidVar.zzaC()) {
                    zzho zzaD = zzidVar.zzaD();
                    y(sb, 2);
                    sb.append("consent_info_extra {\n");
                    for (zzhl zzhlVar : zzaD.zza()) {
                        y(sb, 3);
                        sb.append("limited_data_modes {\n");
                        int zzc = zzhlVar.zzc();
                        E(sb, 3, "type", zzc != 1 ? zzc != 2 ? zzc != 3 ? zzc != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int zzd = zzhlVar.zzd();
                        E(sb, 3, "mode", zzd != 1 ? zzd != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb, 3);
                        sb.append("}\n");
                    }
                    y(sb, 2);
                    sb.append("}\n");
                }
                List<zziu> zzf2 = zzidVar.zzf();
                if (zzf2 != null) {
                    for (zziu zziuVar : zzf2) {
                        if (zziuVar != null) {
                            y(sb, 2);
                            sb.append("user_property {\n");
                            E(sb, 2, "set_timestamp_millis", zziuVar.zza() ? Long.valueOf(zziuVar.zzb()) : null);
                            E(sb, 2, "name", q3Var.D().c(zziuVar.zzc()));
                            E(sb, 2, "string_value", zziuVar.zze());
                            E(sb, 2, "int_value", zziuVar.zzf() ? Long.valueOf(zziuVar.zzg()) : null);
                            E(sb, 2, "double_value", zziuVar.zzj() ? Double.valueOf(zziuVar.zzk()) : null);
                            y(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzhg> zzS = zzidVar.zzS();
                if (zzS != null) {
                    for (zzhg zzhgVar : zzS) {
                        if (zzhgVar != null) {
                            y(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzhgVar.zza()) {
                                E(sb, 2, "audience_id", Integer.valueOf(zzhgVar.zzb()));
                            }
                            if (zzhgVar.zzf()) {
                                E(sb, 2, "new_audience", Boolean.valueOf(zzhgVar.zzg()));
                            }
                            D(sb, 2, "current_data", zzhgVar.zzc());
                            if (zzhgVar.zzd()) {
                                D(sb, 2, "previous_data", zzhgVar.zze());
                            }
                            y(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzhs> zzc2 = zzidVar.zzc();
                if (zzc2 != null) {
                    for (zzhs zzhsVar : zzc2) {
                        if (zzhsVar != null) {
                            y(sb, 2);
                            sb.append("event {\n");
                            E(sb, 2, "name", q3Var.D().a(zzhsVar.zzd()));
                            if (zzhsVar.zze()) {
                                E(sb, 2, "timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                            }
                            if (zzhsVar.zzg()) {
                                E(sb, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.zzh()));
                            }
                            if (zzhsVar.zzi()) {
                                E(sb, 2, "count", Integer.valueOf(zzhsVar.zzj()));
                            }
                            if (zzhsVar.zzb() != 0) {
                                w(sb, 2, zzhsVar.zza());
                            }
                            y(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                y(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public final String L(zzff zzffVar) {
        if (zzffVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzffVar.zza()) {
            E(sb, 0, "filter_id", Integer.valueOf(zzffVar.zzb()));
        }
        E(sb, 0, "event_name", this.a.D().a(zzffVar.zzc()));
        String A = A(zzffVar.zzi(), zzffVar.zzj(), zzffVar.zzm());
        if (!A.isEmpty()) {
            E(sb, 0, "filter_type", A);
        }
        if (zzffVar.zzg()) {
            F(sb, 1, "event_count_filter", zzffVar.zzh());
        }
        if (zzffVar.zze() > 0) {
            sb.append("  filters {\n");
            Iterator it = zzffVar.zzd().iterator();
            while (it.hasNext()) {
                x(sb, 2, (zzfh) it.next());
            }
        }
        y(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String M(zzfn zzfnVar) {
        if (zzfnVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzfnVar.zza()) {
            E(sb, 0, "filter_id", Integer.valueOf(zzfnVar.zzb()));
        }
        E(sb, 0, "property_name", this.a.D().c(zzfnVar.zzc()));
        String A = A(zzfnVar.zze(), zzfnVar.zzf(), zzfnVar.zzh());
        if (!A.isEmpty()) {
            E(sb, 0, "filter_type", A);
        }
        x(sb, 1, zzfnVar.zzd());
        sb.append("}\n");
        return sb.toString();
    }

    public final Parcelable N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (b.a unused) {
                this.a.a().o().a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public final List R(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean S(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.a.e().a() - j) > j2;
    }

    public final long T(byte[] bArr) {
        com.google.android.gms.common.internal.t.l(bArr);
        q3 q3Var = this.a;
        q3Var.C().h();
        MessageDigest C = l7.C();
        if (C != null) {
            return l7.D(C.digest(bArr));
        }
        q3Var.a().o().a("Failed to get MD5");
        return 0L;
    }

    public final long U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return T(str.getBytes(Charset.forName("UTF-8")));
    }

    public final byte[] V(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.a.a().o().b("Failed to gzip content", e);
            throw e;
        }
    }

    public final Map Z(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(Z((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(Z((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(Z((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    public final boolean l() {
        return false;
    }

    public final I m(zzaa zzaaVar) {
        Object obj;
        Bundle n = n(zzaaVar.zzf(), true);
        String obj2 = (!n.containsKey("_o") || (obj = n.get("_o")) == null) ? "app" : obj.toString();
        String b = b4.b(zzaaVar.zzb());
        if (b == null) {
            b = zzaaVar.zzb();
        }
        return new I(b, new G(n), obj2, zzaaVar.zza());
    }

    public final Bundle n(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(n((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final void w(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                y(sb, i2);
                sb.append("param {\n");
                E(sb, i2, "name", zzhwVar.zza() ? this.a.D().b(zzhwVar.zzb()) : null);
                E(sb, i2, "string_value", zzhwVar.zzc() ? zzhwVar.zzd() : null);
                E(sb, i2, "int_value", zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
                E(sb, i2, "double_value", zzhwVar.zzi() ? Double.valueOf(zzhwVar.zzj()) : null);
                if (zzhwVar.zzm() > 0) {
                    w(sb, i2, zzhwVar.zzk());
                }
                y(sb, i2);
                sb.append("}\n");
            }
        }
    }

    public final void x(StringBuilder sb, int i, zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        y(sb, i);
        sb.append("filter {\n");
        if (zzfhVar.zze()) {
            E(sb, i, "complement", Boolean.valueOf(zzfhVar.zzf()));
        }
        if (zzfhVar.zzg()) {
            E(sb, i, "param_name", this.a.D().b(zzfhVar.zzh()));
        }
        if (zzfhVar.zza()) {
            int i2 = i + 1;
            zzfr zzb = zzfhVar.zzb();
            if (zzb != null) {
                y(sb, i2);
                sb.append("string_filter {\n");
                if (zzb.zza()) {
                    switch (zzb.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    E(sb, i2, "match_type", str);
                }
                if (zzb.zzb()) {
                    E(sb, i2, "expression", zzb.zzc());
                }
                if (zzb.zzd()) {
                    E(sb, i2, "case_sensitive", Boolean.valueOf(zzb.zze()));
                }
                if (zzb.zzg() > 0) {
                    y(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : zzb.zzf()) {
                        y(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                y(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzfhVar.zzc()) {
            F(sb, i + 1, "number_filter", zzfhVar.zzd());
        }
        y(sb, i);
        sb.append("}\n");
    }
}
