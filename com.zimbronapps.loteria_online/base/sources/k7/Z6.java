package k7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkq;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class z6 {
    public static final t7.r a = t7.r.y("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(com.google.android.gms.internal.measurement.zzkp r21, t7.s r22, t7.s r23, t7.t r24, char[] r25, int r26, int r27, int r28, int r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.z6.c(com.google.android.gms.internal.measurement.zzkp, t7.s, t7.s, t7.t, char[], int, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):boolean");
    }

    public static final Map d(t7.s sVar, t7.s sVar2, t7.t tVar, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            return t7.s.o();
        }
        zzkp zzkpVar = zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzkq zzkqVar = (zzkq) sVar2.get(zzkpVar);
        zzkp zzkpVar2 = zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        zzkq zzkqVar2 = (zzkq) sVar2.get(zzkpVar2);
        zzkp zzkpVar3 = zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        zzkq zzkqVar3 = (zzkq) sVar2.get(zzkpVar3);
        zzkp zzkpVar4 = zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        zzkq zzkqVar4 = (zzkq) sVar2.get(zzkpVar4);
        return t7.s.a().f("Version", "2").f("VendorConsent", true != z ? "0" : "1").f("VendorLegitimateInterest", true != z2 ? "0" : "1").f("gdprApplies", i3 != 1 ? "0" : "1").f("EnableAdvertiserConsentMode", i2 != 1 ? "0" : "1").f("PolicyVersion", String.valueOf(i4)).f("CmpSdkID", String.valueOf(i)).f("PurposeOneTreatment", i5 != 1 ? "0" : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(zzkqVar != null ? zzkqVar.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(t7.s.p("Purpose1", f(zzkpVar, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true), "Purpose3", f(zzkpVar2, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true), "Purpose4", f(zzkpVar3, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true), "Purpose7", f(zzkpVar4, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true))).i(t7.s.q("AuthorizePurpose1", true != c(zzkpVar, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true) ? "0" : "1", "AuthorizePurpose3", true != c(zzkpVar2, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true) ? "0" : "1", "AuthorizePurpose4", true != c(zzkpVar3, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true) ? "0" : "1", "AuthorizePurpose7", true == c(zzkpVar4, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true) ? "1" : "0", "PurposeDiagnostics", new String(cArr))).c();
    }

    public static final int e(zzkp zzkpVar, t7.s sVar, t7.s sVar2, t7.t tVar, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String f(zzkp zzkpVar, t7.s sVar, t7.s sVar2, t7.t tVar, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        String str4 = "0";
        String valueOf = (TextUtils.isEmpty(str2) || str2.length() < zzkpVar.zza()) ? "0" : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            str4 = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str4));
    }

    public static final boolean g(zzkp zzkpVar, t7.s sVar, t7.s sVar2, t7.t tVar, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int e = e(zzkpVar, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true);
        if (!z) {
            c = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char charAt = str2.charAt(zzkpVar.zza() - 1);
                boolean z4 = charAt == '1';
                if (e > 0 && cArr[e] != '2') {
                    cArr[e] = charAt != '1' ? '6' : '1';
                }
                return z4;
            }
            c = '0';
        }
        if (e > 0 && cArr[e] != '2') {
            cArr[e] = c;
        }
        return false;
    }

    public static final boolean h(zzkp zzkpVar, t7.s sVar, t7.s sVar2, t7.t tVar, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int e = e(zzkpVar, sVar, sVar2, tVar, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true);
        if (!z2) {
            c = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char charAt = str3.charAt(zzkpVar.zza() - 1);
                boolean z4 = charAt == '1';
                if (e > 0 && cArr[e] != '2') {
                    cArr[e] = charAt != '1' ? '7' : '1';
                }
                return z4;
            }
            c = '0';
        }
        if (e > 0 && cArr[e] != '2') {
            cArr[e] = c;
        }
        return false;
    }

    public static final zzkq i(zzkp zzkpVar, t7.s sVar, t7.s sVar2, t7.t tVar, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        return (zzkq) sVar2.getOrDefault(zzkpVar, zzkq.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
