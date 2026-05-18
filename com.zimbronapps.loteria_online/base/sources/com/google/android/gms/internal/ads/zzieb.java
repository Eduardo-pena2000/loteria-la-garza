package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzieb extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile zziea zze;
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private zzieb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final Object zzg(int i) {
        zzh();
        Object value = ((zzidy) this.zza[i]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzo().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i2 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new zzidy(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final int zzm(Comparable comparable) {
        int i = this.zzb;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((zzidy) this.zza[i2]).zza());
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((zzidy) this.zza[i4]).zza());
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap zzo() {
        zzh();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return this.zzc;
    }

    public final void clear() {
        zzh();
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
        return zzm(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zziea(this, null);
        }
        return this.zze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzieb)) {
            return super.equals(obj);
        }
        zzieb zziebVar = (zzieb) obj;
        int size = size();
        if (size != zziebVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i != zziebVar.zzb) {
            return entrySet().equals(zziebVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zzd(i2).equals(zziebVar.zzd(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.zzc.equals(zziebVar.zzc);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzm = zzm(comparable);
        return zzm >= 0 ? ((zzidy) this.zza[zzm]).getValue() : this.zzc.get(comparable);
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
        zzh();
        Comparable comparable = (Comparable) obj;
        int zzm = zzm(comparable);
        if (zzm >= 0) {
            return zzg(zzm);
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

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Map.Entry zzd(int i) {
        if (i < this.zzb) {
            return (zzidy) this.zza[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Iterable zze() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzh();
        int zzm = zzm(comparable);
        if (zzm >= 0) {
            return ((zzidy) this.zza[zzm]).setValue(obj);
        }
        zzh();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i = -(zzm + 1);
        if (i >= 16) {
            return zzo().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzidy zzidyVar = (zzidy) this.zza[15];
            this.zzb = 15;
            zzo().put(zzidyVar.zza(), zzidyVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.zza[i] = new zzidy(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final /* synthetic */ Object[] zzi() {
        return this.zza;
    }

    public final /* synthetic */ int zzj() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzk() {
        return this.zzc;
    }

    public /* synthetic */ zzieb(byte[] bArr) {
    }
}
