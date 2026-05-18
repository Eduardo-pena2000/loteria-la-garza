package com.google.android.gms.internal.firebase-auth-api;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzang extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzanm zze;
    private Map zzf;

    public /* synthetic */ zzang(zzanl zzanlVar) {
        this();
    }

    public static /* bridge */ /* synthetic */ int zza(zzang zzangVar) {
        return zzangVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzang zzangVar) {
        return zzangVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzang zzangVar) {
        return zzangVar.zzf;
    }

    public static /* synthetic */ void zzd(zzang zzangVar) {
        zzangVar.zzg();
    }

    public static /* bridge */ /* synthetic */ Object[] zze(zzang zzangVar) {
        return zzangVar.zza;
    }

    private final SortedMap zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return this.zzc;
    }

    private final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    public Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzanm(this, null);
        }
        return this.zze;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzang)) {
            return super.equals(obj);
        }
        zzang zzangVar = (zzang) obj;
        int size = size();
        if (size != zzangVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i != zzangVar.zzb) {
            return entrySet().equals(zzangVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zza(i2).equals(zzangVar.zza(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.zzc.equals(zzangVar.zzc);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        return zza >= 0 ? ((zzank) this.zza[zza]).getValue() : this.zzc.get(comparable);
    }

    public int hashCode() {
        int i = this.zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.zza[i3].hashCode();
        }
        return this.zzc.size() > 0 ? i2 + this.zzc.hashCode() : i2;
    }

    public Object remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzb(zza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    public int size() {
        return this.zzb + this.zzc.size();
    }

    private zzang() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    public static /* synthetic */ Object zza(zzang zzangVar, int i) {
        return zzangVar.zzb(i);
    }

    public final int zzb() {
        return this.zzb;
    }

    public final Iterable zzc() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    public final Set zzd() {
        return new zzanh(this, null);
    }

    public final boolean zze() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(java.lang.Comparable r5) {
        /*
            r4 = this;
            int r0 = r4.zzb
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1f
            java.lang.Object[] r2 = r4.zza
            r2 = r2[r1]
            com.google.android.gms.internal.firebase-auth-api.zzank r2 = (com.google.android.gms.internal.firebase-auth-api.zzank) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1c
            int r0 = r0 + 1
        L1a:
            int r5 = -r0
            return r5
        L1c:
            if (r2 != 0) goto L1f
            return r1
        L1f:
            r0 = 0
        L20:
            if (r0 > r1) goto L41
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.zza
            r3 = r3[r2]
            com.google.android.gms.internal.firebase-auth-api.zzank r3 = (com.google.android.gms.internal.firebase-auth-api.zzank) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3b
            int r1 = r2 + (-1)
            goto L20
        L3b:
            if (r3 <= 0) goto L40
            int r0 = r2 + 1
            goto L20
        L40:
            return r2
        L41:
            int r0 = r0 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzang.zza(java.lang.Comparable):int");
    }

    private final Object zzb(int i) {
        zzg();
        Object value = ((zzank) this.zza[i]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzank(this, (Map.Entry) it.next());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzg();
        int zza = zza(comparable);
        if (zza >= 0) {
            return ((zzank) this.zza[zza]).setValue(obj);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i = -(zza + 1);
        if (i >= 16) {
            return zzf().put(comparable, obj);
        }
        int i2 = this.zzb;
        if (i2 == 16) {
            zzank zzankVar = (zzank) this.zza[15];
            this.zzb = i2 - 1;
            zzf().put((Comparable) zzankVar.getKey(), zzankVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.zza[i] = new zzank(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zza(int i) {
        if (i < this.zzb) {
            return (zzank) this.zza[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public void zza() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.zzd) {
            return;
        }
        if (this.zzc.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzc);
        }
        this.zzc = unmodifiableMap;
        if (this.zzf.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
        }
        this.zzf = unmodifiableMap2;
        this.zzd = true;
    }
}
