package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgtm extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzgtm() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final Object[] zzm() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final Object[] zzn() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzr() {
        return zzd;
    }

    private final void zzv(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object zza = zzgtn.zza(i2);
        if (i4 != 0) {
            zzgtn.zzc(zza, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzl = zzl();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzb = zzgtn.zzb(obj, i6);
            while (zzb != 0) {
                int i7 = zzb - 1;
                int i8 = zzl[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzb2 = zzgtn.zzb(zza, i10);
                zzgtn.zzc(zza, i10, zzb);
                zzl[i7] = ((~i5) & i9) | (zzb2 & i5);
                zzb = i8 & i;
            }
        }
        this.zze = zza;
        zzv(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(Object obj) {
        if (zzb()) {
            return -1;
        }
        int zzb = zzgty.zzb(obj);
        int zzh = zzh();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzb2 = zzgtn.zzb(obj2, zzb & zzh);
        if (zzb2 != 0) {
            int i = ~zzh;
            int i2 = zzb & i;
            do {
                int i3 = zzb2 - 1;
                int i4 = zzl()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, zzm()[i3])) {
                    return i3;
                }
                zzb2 = i4 & zzh;
            } while (zzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final Object zzj(Object obj) {
        if (!zzb()) {
            int zzh = zzh();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zze = zzgtn.zze(obj, null, zzh, obj2, zzl(), zzm(), null);
            if (zze != -1) {
                Object obj3 = zzn()[zze];
                zze(zze, zzh);
                this.zzg--;
                zzd();
                return obj3;
            }
        }
        return zzd;
    }

    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map zzc = zzc();
        if (zzc != null) {
            this.zzf = zzgxz.zzc(size(), 3, 1073741823);
            zzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzm(), 0, this.zzg, (Object) null);
        Arrays.fill(zzn(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    public final boolean containsKey(Object obj) {
        Map zzc = zzc();
        return zzc != null ? zzc.containsKey(obj) : zzi(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (Objects.equals(obj, zzn()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzgth zzgthVar = new zzgth(this, null);
        this.zzi = zzgthVar;
        return zzgthVar;
    }

    public final Object get(Object obj) {
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.get(obj);
        }
        int zzi = zzi(obj);
        if (zzi == -1) {
            return null;
        }
        return zzn()[zzi];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgtj zzgtjVar = new zzgtj(this, null);
        this.zzh = zzgtjVar;
        return zzgtjVar;
    }

    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzb()) {
            zzgrc.zzj(zzb(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzgtn.zza(max2);
            zzv(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.put(obj, obj2);
        }
        int[] zzl = zzl();
        Object[] zzm = zzm();
        Object[] zzn = zzn();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int zzb = zzgty.zzb(obj);
        int zzh = zzh();
        int i4 = zzb & zzh;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzb2 = zzgtn.zzb(obj3, i4);
        if (zzb2 != 0) {
            int i5 = ~zzh;
            int i6 = zzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = zzb2 - 1;
                int i9 = zzl[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && Objects.equals(obj, zzm[i8])) {
                    Object obj4 = zzn[i8];
                    zzn[i8] = obj2;
                    return obj4;
                }
                int i11 = i9 & zzh;
                i7++;
                if (i11 != 0) {
                    zzb2 = i11;
                } else {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzh() + 1, 1.0f);
                        int zzf = zzf();
                        while (zzf >= 0) {
                            linkedHashMap.put(zzm()[zzf], zzn()[zzf]);
                            zzf = zzg(zzf);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzd();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i3 > zzh) {
                        zzh = zzx(zzh, zzgtn.zzd(zzh), zzb, i2);
                    } else {
                        zzl[i8] = (i3 & zzh) | i10;
                    }
                }
            }
        } else if (i3 > zzh) {
            zzh = zzx(zzh, zzgtn.zzd(zzh), zzb, i2);
        } else {
            Object obj5 = this.zze;
            Objects.requireNonNull(obj5);
            zzgtn.zzc(obj5, i4, i3);
        }
        int length = zzl().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzl(), min);
            this.zzb = Arrays.copyOf(zzm(), min);
            this.zzc = Arrays.copyOf(zzn(), min);
        }
        zzl()[i2] = (~zzh) & zzb;
        zzm()[i2] = obj;
        zzn()[i2] = obj2;
        this.zzg = i3;
        zzd();
        return null;
    }

    public final Object remove(Object obj) {
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.remove(obj);
        }
        Object zzj = zzj(obj);
        if (zzj == zzd) {
            return null;
        }
        return zzj;
    }

    public final int size() {
        Map zzc = zzc();
        return zzc != null ? zzc.size() : this.zzg;
    }

    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgtl zzgtlVar = new zzgtl(this, null);
        this.zzj = zzgtlVar;
        return zzgtlVar;
    }

    public final void zza(int i) {
        this.zzf = zzgxz.zzc(i, 1, 1073741823);
    }

    public final boolean zzb() {
        return this.zze == null;
    }

    public final Map zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzd() {
        this.zzf += 32;
    }

    public final void zze(int i, int i2) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzl = zzl();
        Object[] zzm = zzm();
        Object[] zzn = zzn();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            zzm[i] = null;
            zzn[i] = null;
            zzl[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = zzm[i3];
        zzm[i] = obj2;
        zzn[i] = zzn[i3];
        zzm[i3] = null;
        zzn[i3] = null;
        zzl[i] = zzl[i3];
        zzl[i3] = 0;
        int zzb = zzgty.zzb(obj2) & i2;
        int zzb2 = zzgtn.zzb(obj, zzb);
        if (zzb2 == size) {
            zzgtn.zzc(obj, zzb, i4);
            return;
        }
        while (true) {
            int i5 = zzb2 - 1;
            int i6 = zzl[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                zzl[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            zzb2 = i7;
        }
    }

    public final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzg(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    public final /* synthetic */ Object zzk() {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final /* synthetic */ Object zzo(int i) {
        return zzm()[i];
    }

    public final /* synthetic */ Object zzp(int i) {
        return zzn()[i];
    }

    public final /* synthetic */ void zzq(int i, Object obj) {
        zzn()[i] = obj;
    }

    public final /* synthetic */ int zzs() {
        return this.zzf;
    }

    public final /* synthetic */ int zzt() {
        return this.zzg;
    }

    public final /* synthetic */ void zzu(int i) {
        this.zzg = i;
    }

    public zzgtm(int i) {
        zza(8);
    }
}
