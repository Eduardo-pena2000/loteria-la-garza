package com.google.android.gms.internal.drive;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzmp implements Comparable, Map.Entry {
    private Object value;
    private final /* synthetic */ zzmi zzvk;
    private final Comparable zzvn;

    public zzmp(zzmi zzmiVar, Map.Entry entry) {
        this(zzmiVar, (Comparable) entry.getKey(), entry.getValue());
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzmp) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.zzvn, entry.getKey()) && equals(this.value, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.zzvn;
    }

    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        Comparable comparable = this.zzvn;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final Object setValue(Object obj) {
        zzmi.zza(this.zzvk);
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzvn);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public zzmp(zzmi zzmiVar, Comparable comparable, Object obj) {
        this.zzvk = zzmiVar;
        this.zzvn = comparable;
        this.value = obj;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
