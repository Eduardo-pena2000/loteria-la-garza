package k7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcu;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class l7 extends U3 {
    public static final String[] i = {"firebase_", "google_", "ga_"};
    public static final String[] j = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public a4.a f;
    public Boolean g;
    public Integer h;

    public l7(q3 q3Var) {
        super(q3Var);
        this.h = null;
        this.d = new AtomicLong(0L);
    }

    public static MessageDigest C() {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long D(byte[] bArr) {
        com.google.android.gms.common.internal.t.l(bArr);
        int length = bArr.length;
        int i2 = 0;
        com.google.android.gms.common.internal.t.o(length > 0);
        long j2 = 0;
        for (int i3 = length - 1; i3 >= 0 && i3 >= bArr.length - 8; i3--) {
            j2 += (bArr[i3] & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public static boolean E(Context context, boolean z) {
        com.google.android.gms.common.internal.t.l(context);
        return F(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean F(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean N(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean O(String str, String[] strArr) {
        com.google.android.gms.common.internal.t.l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(String str) {
        return !j[0].equals(str);
    }

    public static ArrayList h0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", iVar.a);
            bundle.putString("origin", iVar.b);
            bundle.putLong("creation_timestamp", iVar.d);
            bundle.putString("name", iVar.c.b);
            W3.a(bundle, com.google.android.gms.common.internal.t.l(iVar.c.zza()));
            bundle.putBoolean("active", iVar.e);
            String str = iVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            I i2 = iVar.g;
            if (i2 != null) {
                bundle.putString("timed_out_event_name", i2.a);
                G g = i2.b;
                if (g != null) {
                    bundle.putBundle("timed_out_event_params", g.R1());
                }
            }
            bundle.putLong("trigger_timeout", iVar.h);
            I i3 = iVar.i;
            if (i3 != null) {
                bundle.putString("triggered_event_name", i3.a);
                G g2 = i3.b;
                if (g2 != null) {
                    bundle.putBundle("triggered_event_params", g2.R1());
                }
            }
            bundle.putLong("triggered_timestamp", iVar.c.c);
            bundle.putLong("time_to_live", iVar.j);
            I i4 = iVar.k;
            if (i4 != null) {
                bundle.putString("expired_event_name", i4.a);
                G g3 = i4.b;
                if (g3 != null) {
                    bundle.putBundle("expired_event_params", g3.R1());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean j0(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.t.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void k0(m5 m5Var, Bundle bundle, boolean z) {
        if (bundle != null && m5Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = m5Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = m5Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", m5Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && m5Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean m0(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    public static boolean r0(String str) {
        com.google.android.gms.common.internal.t.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final void A(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            q3 q3Var = this.a;
            q3Var.a().t().c("Not putting event parameter. Invalid value type. name, type", q3Var.D().b(str), simpleName);
        }
    }

    public final int A0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }

    public final void B(k7 k7Var, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        m0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        k7Var.a(str, "_err", bundle);
    }

    public final boolean B0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean C0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i2) {
                this.a.a().t().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final void D0(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int z0;
        int i2;
        char c;
        String str4;
        int i3;
        int r;
        if (bundle == null) {
            return;
        }
        q3 q3Var = this.a;
        char c2 = 20064;
        int i4 = true != q3Var.w().a.C().V(231100000, true) ? 0 : 35;
        int i5 = 0;
        boolean z2 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                z0 = !z ? z0(str5) : 0;
                if (z0 == 0) {
                    z0 = A0(str5);
                }
            } else {
                z0 = 0;
            }
            if (z0 != 0) {
                x(bundle, z0, str5, z0 == 3 ? str5 : null);
                bundle.remove(str5);
                i2 = i4;
                c = c2;
            } else {
                if (B0(bundle.get(str5))) {
                    q3Var.a().t().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    r = 22;
                    str4 = str5;
                    i3 = i4;
                } else {
                    str4 = str5;
                    i3 = i4;
                    r = r(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (r != 0 && !"_ev".equals(str4)) {
                    x(bundle, r, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (r0(str4) && !O(str4, c4.d)) {
                    int i6 = i5 + 1;
                    c = 20064;
                    if (V(231100000, true)) {
                        i2 = i3;
                        if (i6 > i2) {
                            if (!q3Var.w().H(null, f2.f1) || !z2) {
                                A2 q = q3Var.a().q();
                                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
                                sb.append("Item can't contain more than ");
                                sb.append(i2);
                                sb.append(" item-scoped custom params");
                                q.c(sb.toString(), q3Var.D().a(str2), q3Var.D().e(bundle));
                            }
                            m0(bundle, 28);
                            bundle.remove(str4);
                            i5 = i6;
                            c2 = 20064;
                            i4 = i2;
                            z2 = true;
                        }
                    } else {
                        q3Var.a().q().c("Item array not supported on client's version of Google Play Services (Android Only)", q3Var.D().a(str2), q3Var.D().e(bundle));
                        m0(bundle, 23);
                        bundle.remove(str4);
                        i2 = i3;
                    }
                    i5 = i6;
                }
                i2 = i3;
                c = 20064;
            }
            c2 = c;
            i4 = i2;
        }
    }

    public final boolean G() {
        h();
        return J() == 1;
    }

    public final a4.a H() {
        if (this.f == null) {
            this.f = a4.a.a(this.a.d());
        }
        return this.f;
    }

    public final int I() {
        if (Build.VERSION.SDK_INT < 30 || h.e.a(30) <= 3) {
            return 0;
        }
        return h.e.a(1000000);
    }

    public final long J() {
        long j2;
        h();
        if (!L(this.a.L().q())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j2 = 4;
        } else if (h.e.a(30) < 4) {
            j2 = 8;
        } else {
            q3 q3Var = this.a;
            int I = I();
            q3Var.w();
            j2 = I < ((Integer) f2.m0.b(null)).intValue() ? 16L : 0L;
        }
        if (!M("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0 && !K()) {
            j2 = 64;
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    public final boolean K() {
        CancellationException e;
        Integer num;
        if (this.g == null) {
            a4.a H = H();
            boolean z = false;
            if (H == null) {
                return false;
            }
            try {
                num = (Integer) H.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z = true;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        this.a.a().r().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        this.a.a().w().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (ExecutionException e3) {
                        e = e3;
                        this.a.a().r().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        this.a.a().w().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (TimeoutException e4) {
                        e = e4;
                        this.a.a().r().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        this.a.a().w().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (InterruptedException e5) {
                        e = e5;
                        this.a.a().r().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        this.a.a().w().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    }
                }
                this.g = Boolean.valueOf(z);
            } catch (CancellationException | ExecutionException | TimeoutException | InterruptedException e6) {
                e = e6;
                num = null;
            }
            this.a.a().w().b("Measurement manager api status result", num);
        }
        return this.g.booleanValue();
    }

    public final boolean L(String str) {
        String str2 = (String) f2.s0.b(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public final boolean M(String str) {
        h();
        q3 q3Var = this.a;
        if (G6.e.a(q3Var.d()).a(str) == 0) {
            return true;
        }
        q3Var.a().v().b("Permission not granted", str);
        return false;
    }

    public final boolean P(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        q3 q3Var = this.a;
        String i2 = q3Var.w().i();
        q3Var.c();
        return i2.equals(str);
    }

    public final Bundle Q(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object s = s(str2, bundle.get(str2));
                if (s == null) {
                    q3 q3Var = this.a;
                    q3Var.a().t().b("Param value can't be null", q3Var.D().b(str2));
                } else {
                    A(bundle2, str2, s);
                }
            }
        }
        return bundle2;
    }

    public final I R(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (x0(str2) != 0) {
            q3 q3Var = this.a;
            q3Var.a().o().b("Invalid conditional property event name", q3Var.D().c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle t = t(str, str2, bundle2, E6.g.a("_o"), true);
        if (z) {
            t = Q(t, str);
        }
        com.google.android.gms.common.internal.t.l(t);
        return new I(str2, new G(t), str3, j2);
    }

    public final boolean S(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f = G6.e.a(context).f(str, 64);
            if (f == null || (signatureArr = f.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray())).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            this.a.a().o().b("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            this.a.a().o().b("Package name not found", e2);
            return true;
        }
    }

    public final byte[] T(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final boolean V(int i2, boolean z) {
        Boolean x = this.a.J().x();
        if (W() < i2 / 1000) {
            return (x == null || x.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int W() {
        if (this.h == null) {
            this.h = Integer.valueOf(v6.h.f().a(this.a.d()) / 1000);
        }
        return this.h.intValue();
    }

    public final int X(int i2) {
        return v6.h.f().h(this.a.d(), 12451000);
    }

    public final long Y(long j2, long j3) {
        return (j2 + (j3 * 60000)) / 86400000;
    }

    public final void Z(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            this.a.a().r().b("Params already contained engagement", Long.valueOf(j3));
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void a0(zzcu zzcuVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            this.a.a().r().b("Error returning string value to wrapper", e);
        }
    }

    public final void b0(zzcu zzcuVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            this.a.a().r().b("Error returning long value to wrapper", e);
        }
    }

    public final void c0(zzcu zzcuVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            this.a.a().r().b("Error returning int value to wrapper", e);
        }
    }

    public final void d0(zzcu zzcuVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            this.a.a().r().b("Error returning byte array to wrapper", e);
        }
    }

    public final void e0(zzcu zzcuVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            this.a.a().r().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void f0(zzcu zzcuVar, Bundle bundle) {
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            this.a.a().r().b("Error returning bundle value to wrapper", e);
        }
    }

    public final void g0(zzcu zzcuVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            this.a.a().r().b("Error returning bundle list to wrapper", e);
        }
    }

    public final boolean i() {
        return true;
    }

    public final URL i0(long j2, String str, String str2, long j3, String str3) {
        try {
            com.google.android.gms.common.internal.t.f(str2);
            com.google.android.gms.common.internal.t.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{133005L, Integer.valueOf(W())}), str2, str, Long.valueOf(j3)});
            if (str.equals(this.a.w().j())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e) {
            e = e;
            this.a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            this.a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final void j() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.a.a().r().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    public final String l0() {
        byte[] bArr = new byte[16];
        q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final Object n0(int i2, Object obj, boolean z, boolean z2, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return q(obj.toString(), i2, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle Q = Q((Bundle) parcelable, null);
                if (!Q.isEmpty()) {
                    arrayList.add(Q);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a.a().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.google.android.gms.common.internal.t.l(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.a.a().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2.x(str));
        return false;
    }

    public final int o0(String str) {
        if ("_ldl".equals(str)) {
            this.a.w();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.a.w();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.a.w();
            return 100;
        }
        this.a.w();
        return 36;
    }

    public final boolean p(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            com.google.android.gms.common.internal.t.l(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final long p0() {
        long andIncrement;
        long j2;
        AtomicLong atomicLong = this.d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nextLong = new Random(System.nanoTime() ^ this.a.e().a()).nextLong();
            int i2 = this.e + 1;
            this.e = i2;
            j2 = nextLong + i2;
        }
        return j2;
    }

    public final String q(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    public final SecureRandom q0() {
        h();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.l7.r(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final Object s(String str, Object obj) {
        if ("_ev".equals(str)) {
            return n0(this.a.w().y(null, false), obj, true, true, null);
        }
        return n0(N(str) ? this.a.w().y(null, false) : this.a.w().x(null, false), obj, false, true, null);
    }

    public final Bundle s0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            for (String str11 : uri.getQueryParameterNames()) {
                if (str11.startsWith("gad_")) {
                    String queryParameter10 = uri.getQueryParameter(str11);
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(str11, queryParameter10);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            this.a.a().r().b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    public final Bundle t(String str, String str2, Bundle bundle, List list, boolean z) {
        int z0;
        int i2;
        q3 q3Var;
        List list2 = list;
        boolean O = O(str2, b4.d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        q3 q3Var2 = this.a;
        int v = q3Var2.w().v();
        int i3 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                z0 = !z ? z0(str3) : 0;
                if (z0 == 0) {
                    z0 = A0(str3);
                }
            } else {
                z0 = 0;
            }
            if (z0 != 0) {
                x(bundle2, z0, str3, z0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i2 = v;
                q3Var = q3Var2;
            } else {
                i2 = v;
                q3Var = q3Var2;
                int r = r(str, str2, str3, bundle.get(str3), bundle2, list, z, O);
                if (r == 17) {
                    x(bundle2, 17, str3, Boolean.FALSE);
                } else if (r != 0 && !"_ev".equals(str3)) {
                    x(bundle2, r, r == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (r0(str3)) {
                    int i4 = i3 + 1;
                    if (i4 > i2) {
                        if (!q3Var.w().H(null, f2.f1) || !z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i2);
                            sb.append(" params");
                            q3Var.a().q().c(sb.toString(), q3Var.D().a(str2), q3Var.D().e(bundle));
                        }
                        m0(bundle2, 5);
                        bundle2.remove(str3);
                        z2 = true;
                    }
                    i3 = i4;
                }
                v = i2;
                q3Var2 = q3Var;
                list2 = list;
            }
            v = i2;
            q3Var2 = q3Var;
            list2 = list;
        }
        return bundle2;
    }

    public final boolean t0(String str, String str2) {
        if (str2 == null) {
            this.a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.a.a().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final void u(D2 d2, int i2) {
        Bundle bundle = d2.d;
        int i3 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (r0(str) && (i3 = i3 + 1) > i2) {
                q3 q3Var = this.a;
                if (!q3Var.w().H(null, f2.f1) || !z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i2);
                    sb.append(" params");
                    q3Var.a().q().c(sb.toString(), q3Var.D().a(d2.a), q3Var.D().e(bundle));
                    m0(bundle, 5);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final boolean u0(String str, String str2) {
        if (str2 == null) {
            this.a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.a.a().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final void v(Parcelable[] parcelableArr, int i2) {
        com.google.android.gms.common.internal.t.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i3 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (r0(str) && !O(str, c4.d) && (i3 = i3 + 1) > i2) {
                    q3 q3Var = this.a;
                    if (!q3Var.w().H(null, f2.f1) || !z) {
                        A2 q = q3Var.a().q();
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i2);
                        sb.append(" item-scoped custom parameters");
                        q.c(sb.toString(), q3Var.D().b(str), q3Var.D().e(bundle));
                    }
                    m0(bundle, 28);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final boolean v0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.t.l(str2);
        String[] strArr3 = i;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(strArr3[i2])) {
                this.a.a().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !O(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && O(str2, strArr2)) {
            return true;
        }
        this.a.a().q().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final void w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.a.C().A(bundle, str, bundle2.get(str));
            }
        }
    }

    public final boolean w0(String str, int i2, String str2) {
        if (str2 == null) {
            this.a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        this.a.a().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
        return false;
    }

    public final void x(Bundle bundle, int i2, String str, Object obj) {
        if (m0(bundle, i2)) {
            this.a.w();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.t.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int x0(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (!v0("event", b4.a, b4.b, str)) {
            return 13;
        }
        this.a.w();
        return !w0("event", 40, str) ? 2 : 0;
    }

    public final int y(String str, Object obj) {
        return "_ldl".equals(str) ? C0("user property referrer", str, o0(str), obj) : C0("user property", str, o0(str), obj) ? 0 : 7;
    }

    public final int y0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (!v0("user property", d4.a, null, str)) {
            return 15;
        }
        this.a.w();
        return !w0("user property", 24, str) ? 6 : 0;
    }

    public final Object z(String str, Object obj) {
        return "_ldl".equals(str) ? n0(o0(str), obj, true, false, null) : n0(o0(str), obj, false, false, null);
    }

    public final int z0(String str) {
        if (!t0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }
}
