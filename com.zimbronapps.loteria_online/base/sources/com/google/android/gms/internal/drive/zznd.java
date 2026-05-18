package com.google.android.gms.internal.drive;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznd {
    private static final Logger logger = Logger.getLogger(zznd.class.getName());
    private static final Class zzni;
    private static final boolean zzog;
    private static final Unsafe zzuc;
    private static final boolean zzvy;
    private static final boolean zzvz;
    private static final zzd zzwa;
    private static final boolean zzwb;
    private static final long zzwc;
    private static final long zzwd;
    private static final long zzwe;
    private static final long zzwf;
    private static final long zzwg;
    private static final long zzwh;
    private static final long zzwi;
    private static final long zzwj;
    private static final long zzwk;
    private static final long zzwl;
    private static final long zzwm;
    private static final long zzwn;
    private static final long zzwo;
    private static final long zzwp;
    private static final int zzwq;
    static final boolean zzwr;

    public static final class zzc extends zzd {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzws.putBoolean(obj, j, z);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzws.putByte(obj, j, b);
        }

        public final boolean zzl(Object obj, long j) {
            return this.zzws.getBoolean(obj, j);
        }

        public final float zzm(Object obj, long j) {
            return this.zzws.getFloat(obj, j);
        }

        public final double zzn(Object obj, long j) {
            return this.zzws.getDouble(obj, j);
        }

        public final byte zzx(Object obj, long j) {
            return this.zzws.getByte(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzws.putFloat(obj, j, f);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzws.putDouble(obj, j, d);
        }
    }

    public static abstract class zzd {
        Unsafe zzws;

        public zzd(Unsafe unsafe) {
            this.zzws = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public final void zza(Object obj, long j, int i) {
            this.zzws.putInt(obj, j, i);
        }

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public final int zzj(Object obj, long j) {
            return this.zzws.getInt(obj, j);
        }

        public final long zzk(Object obj, long j) {
            return this.zzws.getLong(obj, j);
        }

        public abstract boolean zzl(Object obj, long j);

        public abstract float zzm(Object obj, long j);

        public abstract double zzn(Object obj, long j);

        public abstract byte zzx(Object obj, long j);

        public final void zza(Object obj, long j, long j2) {
            this.zzws.putLong(obj, j, j2);
        }
    }

    static {
        Unsafe zzff = zzff();
        zzuc = zzff;
        zzni = zzix.zzbs();
        boolean zzk = zzk(Long.TYPE);
        zzvy = zzk;
        boolean zzk2 = zzk(Integer.TYPE);
        zzvz = zzk2;
        zzd zzdVar = null;
        if (zzff != null) {
            if (!zzix.zzbr()) {
                zzdVar = new zzc(zzff);
            } else if (zzk) {
                zzdVar = new zzb(zzff);
            } else if (zzk2) {
                zzdVar = new zza(zzff);
            }
        }
        zzwa = zzdVar;
        zzwb = zzfh();
        zzog = zzfg();
        long zzi = zzi(byte[].class);
        zzwc = zzi;
        zzwd = zzi(boolean[].class);
        zzwe = zzj(boolean[].class);
        zzwf = zzi(int[].class);
        zzwg = zzj(int[].class);
        zzwh = zzi(long[].class);
        zzwi = zzj(long[].class);
        zzwj = zzi(float[].class);
        zzwk = zzj(float[].class);
        zzwl = zzi(double[].class);
        zzwm = zzj(double[].class);
        zzwn = zzi(Object[].class);
        zzwo = zzj(Object[].class);
        Field zzfi = zzfi();
        zzwp = (zzfi == null || zzdVar == null) ? -1L : zzdVar.zzws.objectFieldOffset(zzfi);
        zzwq = (int) (zzi & 7);
        zzwr = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zznd() {
    }

    public static void zza(Object obj, long j, int i) {
        zzwa.zza(obj, j, i);
    }

    private static Field zzb(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static /* synthetic */ void zzd(Object obj, long j, byte b) {
        zzb(obj, j, b);
    }

    public static /* synthetic */ void zze(Object obj, long j, boolean z) {
        zzc(obj, j, z);
    }

    public static boolean zzfd() {
        return zzog;
    }

    public static boolean zzfe() {
        return zzwb;
    }

    public static Unsafe zzff() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzne());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzfg() {
        Unsafe unsafe = zzuc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", new Class[]{Object.class, cls2});
            cls.getMethod("putInt", new Class[]{Object.class, cls2, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, cls2});
            cls.getMethod("putLong", new Class[]{Object.class, cls2, cls2});
            cls.getMethod("getObject", new Class[]{Object.class, cls2});
            cls.getMethod("putObject", new Class[]{Object.class, cls2, Object.class});
            if (zzix.zzbr()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, cls2});
            cls.getMethod("putByte", new Class[]{Object.class, cls2, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, cls2});
            cls.getMethod("putBoolean", new Class[]{Object.class, cls2, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, cls2});
            cls.getMethod("putFloat", new Class[]{Object.class, cls2, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, cls2});
            cls.getMethod("putDouble", new Class[]{Object.class, cls2, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzfh() {
        Unsafe unsafe = zzuc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", new Class[]{Object.class, cls2});
            if (zzfi() == null) {
                return false;
            }
            if (zzix.zzbr()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{cls2});
            cls.getMethod("putByte", new Class[]{cls2, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{cls2});
            cls.getMethod("putInt", new Class[]{cls2, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{cls2});
            cls.getMethod("putLong", new Class[]{cls2, cls2});
            cls.getMethod("copyMemory", new Class[]{cls2, cls2, cls2});
            cls.getMethod("copyMemory", new Class[]{Object.class, cls2, Object.class, cls2, cls2});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field zzfi() {
        Field zzb2;
        if (zzix.zzbr() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzb2;
        }
        Field zzb3 = zzb(Buffer.class, "address");
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    public static Object zzh(Class cls) {
        try {
            return zzuc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzi(Class cls) {
        if (zzog) {
            return zzwa.zzws.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(Class cls) {
        if (zzog) {
            return zzwa.zzws.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long zzk(Object obj, long j) {
        return zzwa.zzk(obj, j);
    }

    public static boolean zzl(Object obj, long j) {
        return zzwa.zzl(obj, j);
    }

    public static float zzm(Object obj, long j) {
        return zzwa.zzm(obj, j);
    }

    public static double zzn(Object obj, long j) {
        return zzwa.zzn(obj, j);
    }

    public static Object zzo(Object obj, long j) {
        return zzwa.zzws.getObject(obj, j);
    }

    private static byte zzp(Object obj, long j) {
        return (byte) (zzj(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    private static byte zzq(Object obj, long j) {
        return (byte) (zzj(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    private static boolean zzr(Object obj, long j) {
        return zzp(obj, j) != 0;
    }

    private static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    public static /* synthetic */ byte zzt(Object obj, long j) {
        return zzp(obj, j);
    }

    public static /* synthetic */ byte zzu(Object obj, long j) {
        return zzq(obj, j);
    }

    public static /* synthetic */ boolean zzv(Object obj, long j) {
        return zzr(obj, j);
    }

    public static /* synthetic */ boolean zzw(Object obj, long j) {
        return zzs(obj, j);
    }

    public static void zza(Object obj, long j, long j2) {
        zzwa.zza(obj, j, j2);
    }

    private static void zzb(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzj(obj, j2) & (~(255 << i))));
    }

    public static /* synthetic */ void zzc(Object obj, long j, byte b) {
        zza(obj, j, b);
    }

    public static /* synthetic */ void zzd(Object obj, long j, boolean z) {
        zzb(obj, j, z);
    }

    private static boolean zzk(Class cls) {
        if (!zzix.zzbr()) {
            return false;
        }
        try {
            Class cls2 = zzni;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", new Class[]{cls, cls3});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls3});
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", new Class[]{cls, cls4, cls3});
            cls2.getMethod("peekInt", new Class[]{cls, cls3});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, cls4, cls4});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, cls4, cls4});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final class zza extends zzd {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zznd.zzwr) {
                zznd.zzd(obj, j, z);
            } else {
                zznd.zze(obj, j, z);
            }
        }

        public final void zze(Object obj, long j, byte b) {
            if (zznd.zzwr) {
                zznd.zzc(obj, j, b);
            } else {
                zznd.zzd(obj, j, b);
            }
        }

        public final boolean zzl(Object obj, long j) {
            return zznd.zzwr ? zznd.zzv(obj, j) : zznd.zzw(obj, j);
        }

        public final float zzm(Object obj, long j) {
            return Float.intBitsToFloat(zzj(obj, j));
        }

        public final double zzn(Object obj, long j) {
            return Double.longBitsToDouble(zzk(obj, j));
        }

        public final byte zzx(Object obj, long j) {
            return zznd.zzwr ? zznd.zzt(obj, j) : zznd.zzu(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    public static final class zzb extends zzd {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zznd.zzwr) {
                zznd.zzd(obj, j, z);
            } else {
                zznd.zze(obj, j, z);
            }
        }

        public final void zze(Object obj, long j, byte b) {
            if (zznd.zzwr) {
                zznd.zzc(obj, j, b);
            } else {
                zznd.zzd(obj, j, b);
            }
        }

        public final boolean zzl(Object obj, long j) {
            return zznd.zzwr ? zznd.zzv(obj, j) : zznd.zzw(obj, j);
        }

        public final float zzm(Object obj, long j) {
            return Float.intBitsToFloat(zzj(obj, j));
        }

        public final double zzn(Object obj, long j) {
            return Double.longBitsToDouble(zzk(obj, j));
        }

        public final byte zzx(Object obj, long j) {
            return zznd.zzwr ? zznd.zzt(obj, j) : zznd.zzu(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    public static void zza(Object obj, long j, boolean z) {
        zzwa.zza(obj, j, z);
    }

    public static int zzj(Object obj, long j) {
        return zzwa.zzj(obj, j);
    }

    public static void zza(Object obj, long j, float f) {
        zzwa.zza(obj, j, f);
    }

    private static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static void zza(Object obj, long j, double d) {
        zzwa.zza(obj, j, d);
    }

    public static void zza(Object obj, long j, Object obj2) {
        zzwa.zzws.putObject(obj, j, obj2);
    }

    public static byte zza(byte[] bArr, long j) {
        return zzwa.zzx(bArr, zzwc + j);
    }

    public static void zza(byte[] bArr, long j, byte b) {
        zzwa.zze(bArr, zzwc + j, b);
    }

    private static void zza(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zzj = zzj(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzj & (~(255 << i))));
    }
}
