package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzalf extends zzajm {
    private static Map zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzanx zzb = zzanx.zzc();

    public static class zza extends zzajq {
        public zza(zzalf zzalfVar) {
        }
    }

    public static final class zzc implements zzakz {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final zzaog zzb() {
            throw new NoSuchMethodError();
        }

        public final zzaoj zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        public final zzaml zza(zzaml zzamlVar, zzamm zzammVar) {
            throw new NoSuchMethodError();
        }

        public final zzamr zza(zzamr zzamrVar, zzamr zzamrVar2) {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd extends zzalf implements zzamo {
        protected zzakx zzc = zzakx.zzb();

        public final zzakx zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzakx) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    public static class zzf extends zzakr {
    }

    public static /* synthetic */ boolean zza(zzalf zzalfVar, boolean z) {
        return zzb(zzalfVar, false);
    }

    private final int zzb(zzanb zzanbVar) {
        return zzanbVar == null ? zzamx.zza().zza(this).zza(this) : zzanbVar.zza(this);
    }

    public static zzalm zzp() {
        return zzana.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzamx.zza().zza(this).zzb(this, (zzalf) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzw()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzamn.zza(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    public final int zzi() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public final int zzl() {
        return zza((zzanb) null);
    }

    public final zzb zzm() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final zzb zzn() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final zzalf zzo() {
        return (zzalf) zza(zze.zzd, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzaml zzq() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzaml zzr() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final /* synthetic */ zzamm zzs() {
        return (zzalf) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzt() {
        zzamx.zza().zza(this).zzd(this);
        zzu();
    }

    public final void zzu() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean zzv() {
        return zzb(this, true);
    }

    public final boolean zzw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    private final int zza() {
        return zzamx.zza().zza(this).zzb(this);
    }

    private static zzalf zzb(zzalf zzalfVar, zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        zzakh zzc2 = zzajvVar.zzc();
        zzalf zza2 = zza(zzalfVar, zzc2, zzakuVar);
        zzc2.zzc(0);
        return zza2;
    }

    public final int zza(zzanb zzanbVar) {
        if (zzw()) {
            int zzb2 = zzb(zzanbVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzb2);
        }
        if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        }
        int zzb3 = zzb(zzanbVar);
        zzb(zzb3);
        return zzb3;
    }

    public static abstract class zzb extends zzajo {
        protected zzalf zza;
        private final zzalf zzb;

        public zzb(zzalf zzalfVar) {
            this.zzb = zzalfVar;
            if (zzalfVar.zzw()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = zzalfVar.zzo();
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, (Object) null, (Object) null);
            zzbVar.zza = (zzalf) zzf();
            return zzbVar;
        }

        public final zzb zza(zzalf zzalfVar) {
            if (this.zzb.equals(zzalfVar)) {
                return this;
            }
            if (!this.zza.zzw()) {
                zzh();
            }
            zza(this.zza, zzalfVar);
            return this;
        }

        public final /* synthetic */ zzajo zzb() {
            return (zzb) clone();
        }

        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final zzalf zze() {
            zzalf zzalfVar = (zzalf) zzf();
            if (zzalfVar.zzv()) {
                return zzalfVar;
            }
            throw new zzanv(zzalfVar);
        }

        /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public zzalf zzf() {
            if (!this.zza.zzw()) {
                return this.zza;
            }
            this.zza.zzt();
            return this.zza;
        }

        public final void zzg() {
            if (this.zza.zzw()) {
                return;
            }
            zzh();
        }

        public void zzh() {
            zzalf zzo = this.zzb.zzo();
            zza(zzo, this.zza);
            this.zza = zzo;
        }

        public final /* synthetic */ zzamm zzs() {
            return this.zzb;
        }

        public final boolean zzv() {
            return zzalf.zza(this.zza, false);
        }

        private static void zza(Object obj, Object obj2) {
            zzamx.zza().zza(obj).zza(obj, obj2);
        }
    }

    public final void zzb(int i) {
        if (i >= 0) {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    private static final boolean zzb(zzalf zzalfVar, boolean z) {
        byte byteValue = ((Byte) zzalfVar.zza(zze.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zze2 = zzamx.zza().zza(zzalfVar).zze(zzalfVar);
        if (z) {
            zzalfVar.zza(zze.zzb, zze2 ? zzalfVar : null, (Object) null);
        }
        return zze2;
    }

    private static zzalf zza(zzalf zzalfVar) throws zzall {
        if (zzalfVar == null || zzb(zzalfVar, true)) {
            return zzalfVar;
        }
        zzall zza2 = new zzanv(zzalfVar).zza();
        zza2.getClass();
        throw zza2;
    }

    public static zzalf zza(Class cls) {
        zzalf zzalfVar = (zzalf) zzc.get(cls);
        if (zzalfVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzalfVar = (zzalf) zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzalfVar == null) {
            zzalfVar = (zzalf) ((zzalf) zzanz.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzalfVar != null) {
                zzc.put(cls, zzalfVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzalfVar;
    }

    public static zzalf zza(zzalf zzalfVar, zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return zza(zzb(zzalfVar, zzajvVar, zzakuVar));
    }

    public static zzalf zza(zzalf zzalfVar, InputStream inputStream, zzaku zzakuVar) throws zzall {
        zzakh zzakjVar;
        if (inputStream == null) {
            byte[] bArr = zzalh.zzb;
            zzakjVar = zzakh.zza(bArr, 0, bArr.length, false);
        } else {
            zzakjVar = new zzakj(inputStream, 4096, null);
        }
        return zza(zza(zzalfVar, zzakjVar, zzakuVar));
    }

    public static zzalf zza(zzalf zzalfVar, byte[] bArr, zzaku zzakuVar) throws zzall {
        return zza(zza(zzalfVar, bArr, 0, bArr.length, zzakuVar));
    }

    private static zzalf zza(zzalf zzalfVar, zzakh zzakhVar, zzaku zzakuVar) throws zzall {
        zzalf zzo = zzalfVar.zzo();
        try {
            zzanb zza2 = zzamx.zza().zza(zzo);
            zza2.zza(zzo, zzakl.zza(zzakhVar), zzakuVar);
            zza2.zzd(zzo);
            return zzo;
        } catch (zzall e) {
            if (e.zzl()) {
                throw new zzall(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzall) {
                throw e2.getCause();
            }
            throw new zzall(e2);
        } catch (zzanv e3) {
            zzall zza3 = e3.zza();
            zza3.getClass();
            throw zza3;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzall) {
                throw e4.getCause();
            }
            throw e4;
        }
    }

    private static zzalf zza(zzalf zzalfVar, byte[] bArr, int i, int i2, zzaku zzakuVar) throws zzall {
        if (i2 == 0) {
            return zzalfVar;
        }
        zzalf zzo = zzalfVar.zzo();
        try {
            zzanb zza2 = zzamx.zza().zza(zzo);
            zza2.zza(zzo, bArr, 0, i2, new zzaju(zzakuVar));
            zza2.zzd(zzo);
            return zzo;
        } catch (zzall e) {
            if (e.zzl()) {
                throw new zzall(e);
            }
            throw e;
        } catch (zzanv e2) {
            zzall zza3 = e2.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzall) {
                throw e3.getCause();
            }
            throw new zzall(e3);
        } catch (IndexOutOfBoundsException unused) {
            zzall zzj = zzall.zzj();
            zzj.getClass();
            throw zzj;
        }
    }

    public static zzalm zza(zzalm zzalmVar) {
        return zzalmVar.zza(zzalmVar.size() << 1);
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

    public static Object zza(zzamm zzammVar, String str, Object[] objArr) {
        return new zzamz(zzammVar, str, objArr);
    }

    public static void zza(Class cls, zzalf zzalfVar) {
        zzalfVar.zzu();
        zzc.put(cls, zzalfVar);
    }

    public final void zza(zzakn zzaknVar) throws IOException {
        zzamx.zza().zza(this).zza((Object) this, (zzaol) zzakp.zza(zzaknVar));
    }
}
