package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzkk extends zzit {
    private static Map zzrs = new ConcurrentHashMap();
    protected zzmy zzrq = zzmy.zzfa();
    private int zzrr = -1;

    public static class zzb extends zziv {
        private final zzkk zzrt;

        public zzb(zzkk zzkkVar) {
            this.zzrt = zzkkVar;
        }
    }

    public static abstract class zzc extends zzkk implements zzls {
        protected zzkb zzrw = zzkb.zzcn();

        public final zzkb zzdg() {
            if (this.zzrw.isImmutable()) {
                this.zzrw = (zzkb) this.zzrw.clone();
            }
            return this.zzrw;
        }
    }

    public static class zzd extends zzjv {
    }

    public enum zze {
        public static final int zzrx = 1;
        public static final int zzry = 2;
        public static final int zzrz = 3;
        public static final int zzsa = 4;
        public static final int zzsb = 5;
        public static final int zzsc = 6;
        public static final int zzsd = 7;
        private static final /* synthetic */ int[] zzse = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzsf = 1;
        public static final int zzsg = 2;
        private static final /* synthetic */ int[] zzsh = {1, 2};
        public static final int zzsi = 1;
        public static final int zzsj = 2;
        private static final /* synthetic */ int[] zzsk = {1, 2};

        public static int[] zzdh() {
            return (int[]) zzse.clone();
        }
    }

    public static void zza(Class cls, zzkk zzkkVar) {
        zzrs.put(cls, zzkkVar);
    }

    public static zzkk zzd(Class cls) {
        zzkk zzkkVar = (zzkk) zzrs.get(cls);
        if (zzkkVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzkkVar = (zzkk) zzrs.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzkkVar == null) {
            zzkkVar = (zzkk) ((zzkk) zznd.zzh(cls)).zza(zze.zzsc, (Object) null, (Object) null);
            if (zzkkVar == null) {
                throw new IllegalStateException();
            }
            zzrs.put(cls, zzkkVar);
        }
        return zzkkVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzkk) zza(zze.zzsc, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return zzmd.zzej().zzq(this).equals(this, (zzkk) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zzne;
        if (i != 0) {
            return i;
        }
        int hashCode = zzmd.zzej().zzq(this).hashCode(this);
        this.zzne = hashCode;
        return hashCode;
    }

    public final boolean isInitialized() {
        return zza(this, true);
    }

    public String toString() {
        return zzlt.zza(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    public final void zzb(zzjr zzjrVar) throws IOException {
        zzmd.zzej().zzf(getClass()).zza(this, zzjt.zza(zzjrVar));
    }

    public final int zzbm() {
        return this.zzrr;
    }

    public final void zzbp() {
        zzmd.zzej().zzq(this).zzd(this);
    }

    public final zza zzcw() {
        return (zza) zza(zze.zzsb, (Object) null, (Object) null);
    }

    public final int zzcx() {
        if (this.zzrr == -1) {
            this.zzrr = zzmd.zzej().zzq(this).zzn(this);
        }
        return this.zzrr;
    }

    public final /* synthetic */ zzlr zzcy() {
        zza zzaVar = (zza) zza(zze.zzsb, (Object) null, (Object) null);
        zzaVar.zza(this);
        return zzaVar;
    }

    public final /* synthetic */ zzlr zzcz() {
        return (zza) zza(zze.zzsb, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzlq zzda() {
        return (zzkk) zza(zze.zzsc, (Object) null, (Object) null);
    }

    public final void zzo(int i) {
        this.zzrr = i;
    }

    public static abstract class zza extends zziu {
        private final zzkk zzrt;
        protected zzkk zzru;
        private boolean zzrv = false;

        public zza(zzkk zzkkVar) {
            this.zzrt = zzkkVar;
            this.zzru = (zzkk) zzkkVar.zza(zze.zzsa, (Object) null, (Object) null);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzrt.zza(zze.zzsb, (Object) null, (Object) null);
            zzaVar.zza((zzkk) zzde());
            return zzaVar;
        }

        public final boolean isInitialized() {
            return zzkk.zza(this.zzru, false);
        }

        public final zza zza(zzkk zzkkVar) {
            zzdb();
            zza(this.zzru, zzkkVar);
            return this;
        }

        public final /* synthetic */ zziu zzbn() {
            return (zza) clone();
        }

        public final /* synthetic */ zzlq zzda() {
            return this.zzrt;
        }

        public final void zzdb() {
            if (this.zzrv) {
                zzkk zzkkVar = (zzkk) this.zzru.zza(zze.zzsa, (Object) null, (Object) null);
                zza(zzkkVar, this.zzru);
                this.zzru = zzkkVar;
                this.zzrv = false;
            }
        }

        /* renamed from: zzdc, reason: merged with bridge method [inline-methods] */
        public zzkk zzde() {
            if (this.zzrv) {
                return this.zzru;
            }
            this.zzru.zzbp();
            this.zzrv = true;
            return this.zzru;
        }

        /* renamed from: zzdd, reason: merged with bridge method [inline-methods] */
        public final zzkk zzdf() {
            zzkk zzkkVar = (zzkk) zzde();
            if (zzkkVar.isInitialized()) {
                return zzkkVar;
            }
            throw new zzmw(zzkkVar);
        }

        private static void zza(zzkk zzkkVar, zzkk zzkkVar2) {
            zzmd.zzej().zzq(zzkkVar).zzc(zzkkVar, zzkkVar2);
        }
    }

    public static Object zza(zzlq zzlqVar, String str, Object[] objArr) {
        return new zzme(zzlqVar, str, objArr);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            Error cause = e.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw cause;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        }
    }

    public static final boolean zza(zzkk zzkkVar, boolean z) {
        byte byteValue = ((Byte) zzkkVar.zza(zze.zzrx, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzp = zzmd.zzej().zzq(zzkkVar).zzp(zzkkVar);
        if (z) {
            zzkkVar.zza(zze.zzry, zzp ? zzkkVar : null, (Object) null);
        }
        return zzp;
    }

    private static zzkk zza(zzkk zzkkVar, byte[] bArr, int i, int i2, zzjx zzjxVar) throws zzkq {
        zzkk zzkkVar2 = (zzkk) zzkkVar.zza(zze.zzsa, (Object) null, (Object) null);
        try {
            zzmd.zzej().zzq(zzkkVar2).zza(zzkkVar2, bArr, 0, i2, new zziz(zzjxVar));
            zzkkVar2.zzbp();
            if (zzkkVar2.zzne == 0) {
                return zzkkVar2;
            }
            throw new RuntimeException();
        } catch (IndexOutOfBoundsException unused) {
            throw zzkq.zzdi().zzg(zzkkVar2);
        } catch (IOException e) {
            if (e.getCause() instanceof zzkq) {
                throw e.getCause();
            }
            throw new zzkq(e.getMessage()).zzg(zzkkVar2);
        }
    }

    public static zzkk zza(zzkk zzkkVar, byte[] bArr, zzjx zzjxVar) throws zzkq {
        zzkk zza2 = zza(zzkkVar, bArr, 0, bArr.length, zzjxVar);
        if (zza2 == null || zza2.isInitialized()) {
            return zza2;
        }
        throw new zzkq(new zzmw(zza2).getMessage()).zzg(zza2);
    }
}
