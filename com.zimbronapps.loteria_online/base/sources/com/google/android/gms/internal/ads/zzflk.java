package com.google.android.gms.internal.ads;

import S5.l2;
import S5.w2;
import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzflk implements zzflj {
    private final Object[] zza;

    public zzflk(l2 l2Var, String str, int i, String str2, w2 w2Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(l2Var.b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(l2Var.c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(l2Var.c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(l2Var.d));
        }
        if (hashSet.contains("keywords")) {
            List list = l2Var.e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(l2Var.f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(l2Var.g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(l2Var.h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(l2Var.i);
        }
        if (hashSet.contains("location")) {
            Location location = l2Var.k;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(l2Var.l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(l2Var.m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(l2Var.n));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = l2Var.o;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(l2Var.p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(l2Var.q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(l2Var.r));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(l2Var.t));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(l2Var.u);
        }
        if (hashSet.contains("orientation")) {
            if (w2Var != null) {
                arrayList.add(Integer.valueOf(w2Var.a));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? zza((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzflk) {
            return Arrays.equals(this.zza, ((zzflk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object[] objArr = this.zza;
        int hashCode = Arrays.hashCode(objArr);
        String arrays = Arrays.toString(objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(hashCode).length() + 10 + String.valueOf(arrays).length() + 1);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
