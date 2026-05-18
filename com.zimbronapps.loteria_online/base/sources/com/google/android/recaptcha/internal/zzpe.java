package com.google.android.recaptcha.internal;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzpe extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile zzpc zze;
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private zzpe() {
    }

    public static /* bridge */ /* synthetic */ int zzb(zzpe zzpeVar) {
        return zzpeVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Object zze(zzpe zzpeVar, int i) {
        return zzpeVar.zzm(i);
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzpe zzpeVar) {
        return zzpeVar.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzpe zzpeVar) {
        zzpeVar.zzo();
    }

    public static /* bridge */ /* synthetic */ Object[] zzk(zzpe zzpeVar) {
        return zzpeVar.zza;
    }

    private final int zzl(Comparable comparable) {
        int i = this.zzb;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((zzpa) this.zza[i2]).zza());
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((zzpa) this.zza[i4]).zza());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    private final Object zzm(int i) {
        zzo();
        Object value = ((zzpa) this.zza[i]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i2 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new zzpa(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return this.zzc;
    }

    private final void zzo() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzpc(this, null);
        }
        return this.zze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpe)) {
            return super.equals(obj);
        }
        zzpe zzpeVar = (zzpe) obj;
        int size = size();
        if (size != zzpeVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i != zzpeVar.zzb) {
            return entrySet().equals(zzpeVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zzg(i2).equals(zzpeVar.zzg(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.zzc.equals(zzpeVar.zzc);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        return zzl >= 0 ? ((zzpa) this.zza[zzl]).getValue() : this.zzc.get(comparable);
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.zza[i3].hashCode();
        }
        return this.zzc.size() > 0 ? i2 + this.zzc.hashCode() : i2;
    }

    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    public final int size() {
        return this.zzb + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzpa) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i = -(zzl + 1);
        if (i >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzpa zzpaVar = (zzpa) this.zza[15];
            this.zzb = 15;
            zzn().put(zzpaVar.zza(), zzpaVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.zza[i] = new zzpa(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i) {
        if (i < this.zzb) {
            return (zzpa) this.zza[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    public /* synthetic */ zzpe(zzpd zzpdVar) {
    }
}
