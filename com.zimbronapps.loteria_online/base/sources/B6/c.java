package b6;

import S5.l2;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c {
    public static boolean a(zzfjc zzfjcVar) {
        return g(zzfjcVar.zza.zza) != 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "unspecified"
            return r1
        L9:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L62;
                case 1743582863: goto L58;
                case 1743582864: goto L4e;
                case 1743582865: goto L44;
                case 1743582866: goto L3a;
                case 1743582867: goto L30;
                case 1743582868: goto L26;
                case 1743582869: goto L1c;
                case 1743582870: goto L11;
                default: goto L10;
            }
        L10:
            goto L6c
        L11:
            java.lang.String r0 = "requester_type_8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 8
            goto L6d
        L1c:
            java.lang.String r0 = "requester_type_7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 7
            goto L6d
        L26:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 6
            goto L6d
        L30:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 5
            goto L6d
        L3a:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 4
            goto L6d
        L44:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 3
            goto L6d
        L4e:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 2
            goto L6d
        L58:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 1
            goto L6d
        L62:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 0
            goto L6d
        L6c:
            r0 = -1
        L6d:
            switch(r0) {
                case 0: goto L89;
                case 1: goto L86;
                case 2: goto L83;
                case 3: goto L80;
                case 4: goto L7d;
                case 5: goto L7a;
                case 6: goto L77;
                case 7: goto L74;
                case 8: goto L71;
                default: goto L70;
            }
        L70:
            return r1
        L71:
            java.lang.String r1 = "8"
            return r1
        L74:
            java.lang.String r1 = "7"
            return r1
        L77:
            java.lang.String r1 = "6"
            return r1
        L7a:
            java.lang.String r1 = "5"
            return r1
        L7d:
            java.lang.String r1 = "4"
            return r1
        L80:
            java.lang.String r1 = "3"
            return r1
        L83:
            java.lang.String r1 = "2"
            return r1
        L86:
            java.lang.String r1 = "1"
            return r1
        L89:
            java.lang.String r1 = "0"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.c.b(java.lang.String):java.lang.String");
    }

    public static String c(l2 l2Var) {
        Bundle bundle;
        return (l2Var == null || (bundle = l2Var.c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzfot d(android.os.Bundle r1) {
        /*
            java.lang.String r0 = "com.google.ads.mediation.admob.AdMobAdapter"
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 == 0) goto L9
            r1 = r0
        L9:
            java.lang.String r0 = "query_info_type"
            java.lang.String r1 = r1.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED
            return r1
        L18:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L71;
                case 1743582863: goto L67;
                case 1743582864: goto L5d;
                case 1743582865: goto L53;
                case 1743582866: goto L49;
                case 1743582867: goto L3f;
                case 1743582868: goto L35;
                case 1743582869: goto L2b;
                case 1743582870: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L7b
        L20:
            java.lang.String r0 = "requester_type_8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 8
            goto L7c
        L2b:
            java.lang.String r0 = "requester_type_7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 7
            goto L7c
        L35:
            java.lang.String r0 = "requester_type_6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 6
            goto L7c
        L3f:
            java.lang.String r0 = "requester_type_5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 5
            goto L7c
        L49:
            java.lang.String r0 = "requester_type_4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 4
            goto L7c
        L53:
            java.lang.String r0 = "requester_type_3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 3
            goto L7c
        L5d:
            java.lang.String r0 = "requester_type_2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 2
            goto L7c
        L67:
            java.lang.String r0 = "requester_type_1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 1
            goto L7c
        L71:
            java.lang.String r0 = "requester_type_0"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 0
            goto L7c
        L7b:
            r1 = -1
        L7c:
            switch(r1) {
                case 0: goto L9a;
                case 1: goto L97;
                case 2: goto L94;
                case 3: goto L91;
                case 4: goto L8e;
                case 5: goto L8b;
                case 6: goto L88;
                case 7: goto L85;
                case 8: goto L82;
                default: goto L7f;
            }
        L7f:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED
            goto L9c
        L82:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_GAM_S2S
            goto L9c
        L85:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_GUILDER
            goto L9c
        L88:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_PAW
            goto L9c
        L8b:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_UNITY
            goto L9c
        L8e:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_YAVIN
            goto L9c
        L91:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_GOLDENEYE
            goto L9c
        L94:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_GBID
            goto L9c
        L97:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_INBOUND_MEDIATION
            goto L9c
        L9a:
            com.google.android.gms.internal.ads.zzfot r1 = com.google.android.gms.internal.ads.zzfot.SCAR_REQUEST_TYPE_ADMOB
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.c.d(android.os.Bundle):com.google.android.gms.internal.ads.zzfot");
    }

    public static void e(zzdye zzdyeVar, zzdxt zzdxtVar, String str, Pair... pairArr) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhR)).booleanValue()) {
            zzcei.zza.execute(new v0(zzdyeVar, null, str, pairArr));
        }
    }

    public static /* synthetic */ void f(zzdye zzdyeVar, zzdxt zzdxtVar, String str, Pair[] pairArr) {
        ConcurrentHashMap zzd = zzdyeVar.zzd();
        h(zzd, "action", str);
        for (Pair pair : pairArr) {
            h(zzd, (String) pair.first, (String) pair.second);
        }
        zzdyeVar.zzb(zzd);
    }

    public static int g(zzfjk zzfjkVar) {
        if (zzfjkVar.zzs) {
            return 2;
        }
        l2 l2Var = zzfjkVar.zzd;
        S5.b0 b0Var = l2Var.s;
        if (b0Var == null && l2Var.x == null) {
            return 1;
        }
        if (b0Var == null || l2Var.x == null) {
            return b0Var != null ? 3 : 4;
        }
        return 5;
    }

    public static void h(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
