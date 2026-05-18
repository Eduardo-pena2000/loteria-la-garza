package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzibr extends zzhzw {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzieg zzt = zzieg.zza();

    public static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 43 + String.valueOf(str).length() + 2);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            Error cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        }
    }

    public static zzibz zzbC() {
        return zzibs.zzd();
    }

    public static zzibz zzbD(zzibz zzibzVar) {
        int size = zzibzVar.size();
        return zzibzVar.zze(size + size);
    }

    public static zzicc zzbE() {
        return zzicq.zzg();
    }

    public static zzicc zzbF(zzicc zziccVar) {
        int size = zziccVar.size();
        return zziccVar.zzf(size + size);
    }

    public static zziby zzbG() {
        return zzibi.zzd();
    }

    public static zziby zzbH(zziby zzibyVar) {
        int size = zzibyVar.size();
        return zzibyVar.zze(size + size);
    }

    public static zzibu zzbI() {
        return zziay.zzd();
    }

    public static zzibu zzbJ(zzibu zzibuVar) {
        int size = zzibuVar.size();
        return zzibuVar.zze(size + size);
    }

    public static zzibt zzbK() {
        return zziad.zzd();
    }

    public static zzibt zzbL(zzibt zzibtVar) {
        int size = zzibtVar.size();
        return zzibtVar.zze(size + size);
    }

    public static zzicd zzbM() {
        return zzidn.zzd();
    }

    public static zzicd zzbN(zzicd zzicdVar) {
        int size = zzicdVar.size();
        return zzicdVar.zzh(size + size);
    }

    public static zzibr zzbO(zzibr zzibrVar, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        zzibr zzbg = zzibrVar.zzbg();
        try {
            zzidu zzb2 = zzidm.zza().zzb(zzbg.getClass());
            zzb2.zzg(zzbg, zziar.zza(zziaqVar), zzibbVar);
            zzb2.zzk(zzbg);
            return zzbg;
        } catch (zzicg e) {
            if (e.zzb()) {
                throw new zzicg(e);
            }
            throw e;
        } catch (zziee e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzicg) {
                throw e3.getCause();
            }
            throw new zzicg(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzicg) {
                throw e4.getCause();
            }
            throw e4;
        }
    }

    public static zzibr zzbP(zzibr zzibrVar, zziaq zziaqVar) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return zzbO(zzibrVar, zziaqVar, zzibb.zza);
    }

    public static zzibr zzbQ(zzibr zzibrVar, ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
        zziaq zzG;
        int i = zziaq.zze;
        if (byteBuffer.hasArray()) {
            zzG = zziaq.zzG(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzG = zziaq.zzG(bArr, 0, remaining, true);
        }
        zzibr zzbZ = zzbZ(zzibrVar, zzG, zzibbVar);
        zzi(zzbZ);
        return zzbZ;
    }

    public static zzibr zzbR(zzibr zzibrVar, ByteBuffer byteBuffer) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return zzbQ(zzibrVar, byteBuffer, zzibb.zza);
    }

    public static zzibr zzbS(zzibr zzibrVar, zzian zzianVar) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        zzibr zzbT = zzbT(zzibrVar, zzianVar, zzibb.zza);
        zzi(zzbT);
        return zzbT;
    }

    public static zzibr zzbT(zzibr zzibrVar, zzian zzianVar, zzibb zzibbVar) throws zzicg {
        zzibr zzj = zzj(zzibrVar, zzianVar, zzibbVar);
        zzi(zzj);
        return zzj;
    }

    public static zzibr zzbU(zzibr zzibrVar, byte[] bArr) throws zzicg {
        int length = bArr.length;
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        zzibr zzh = zzh(zzibrVar, bArr, 0, length, zzibb.zza);
        zzi(zzh);
        return zzh;
    }

    public static zzibr zzbV(zzibr zzibrVar, byte[] bArr, zzibb zzibbVar) throws zzicg {
        zzibr zzh = zzh(zzibrVar, bArr, 0, bArr.length, zzibbVar);
        zzi(zzh);
        return zzh;
    }

    public static zzibr zzbW(zzibr zzibrVar, InputStream inputStream) throws zzicg {
        zziaq zzF = zziaq.zzF(inputStream, 4096);
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        zzibr zzbO = zzbO(zzibrVar, zzF, zzibb.zza);
        zzi(zzbO);
        return zzbO;
    }

    public static zzibr zzbX(zzibr zzibrVar, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        zzibr zzbO = zzbO(zzibrVar, zziaq.zzF(inputStream, 4096), zzibbVar);
        zzi(zzbO);
        return zzbO;
    }

    public static zzibr zzbY(zzibr zzibrVar, zziaq zziaqVar) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return zzbZ(zzibrVar, zziaqVar, zzibb.zza);
    }

    public static zzibr zzbZ(zzibr zzibrVar, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        zzibr zzbO = zzbO(zzibrVar, zziaqVar, zzibbVar);
        zzi(zzbO);
        return zzbO;
    }

    public static zzibr zzbt(Class cls) {
        zzibr zzibrVar = (zzibr) zzd.get(cls);
        if (zzibrVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzibrVar = (zzibr) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzibrVar == null) {
            zzibrVar = ((zzibr) zziem.zzc(cls)).zzbw();
            if (zzibrVar == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, zzibrVar);
        }
        return zzibrVar;
    }

    public static void zzbu(Class cls, zzibr zzibrVar) {
        zzibrVar.zzaY();
        zzd.put(cls, zzibrVar);
    }

    public static Object zzbv(zzidc zzidcVar, String str, Object[] objArr) {
        return new zzido(zzidcVar, str, objArr);
    }

    public static zzibp zzby(zzidc zzidcVar, Object obj, zzidc zzidcVar2, zzibw zzibwVar, int i, zzies zziesVar, Class cls) {
        return new zzibp(zzidcVar, obj, zzidcVar2, new zzibo(zzibwVar, i, zziesVar, false, false), cls);
    }

    public static zzibp zzbz(zzidc zzidcVar, zzidc zzidcVar2, zzibw zzibwVar, int i, zzies zziesVar, boolean z, Class cls) {
        return new zzibp(zzidcVar, zzidn.zzd(), zzidcVar2, new zzibo(zzibwVar, i, zziesVar, true, z), cls);
    }

    private void zzc() {
        if (this.zzt == zzieg.zza()) {
            this.zzt = zzieg.zzb();
        }
    }

    public static zzibr zzca(zzibr zzibrVar, InputStream inputStream) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        zzibr zzk = zzk(zzibrVar, inputStream, zzibb.zza);
        zzi(zzk);
        return zzk;
    }

    public static zzibr zzcb(zzibr zzibrVar, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        zzibr zzk = zzk(zzibrVar, inputStream, zzibbVar);
        zzi(zzk);
        return zzk;
    }

    public static /* synthetic */ boolean zzcd(zzibr zzibrVar, boolean z) {
        return zzg(zzibrVar, false);
    }

    private int zzd(zzidu zziduVar) {
        if (zziduVar != null) {
            return zziduVar.zze(this);
        }
        return zzidm.zza().zzb(getClass()).zze(this);
    }

    private static zzibp zze(zziaz zziazVar) {
        return (zzibp) zziazVar;
    }

    private static final boolean zzg(zzibr zzibrVar, boolean z) {
        byte byteValue = ((Byte) zzibrVar.zzdc(zzibq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzidm.zza().zzb(zzibrVar.getClass()).zzl(zzibrVar);
        if (z) {
            zzibrVar.zzdc(zzibq.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : zzibrVar, null);
        }
        return zzl;
    }

    private static zzibr zzh(zzibr zzibrVar, byte[] bArr, int i, int i2, zzibb zzibbVar) throws zzicg {
        if (i2 == 0) {
            return zzibrVar;
        }
        zzibr zzbg = zzibrVar.zzbg();
        try {
            zzidu zzb2 = zzidm.zza().zzb(zzbg.getClass());
            zzb2.zzj(zzbg, bArr, i, i + i2, new zziab(zzibbVar));
            zzb2.zzk(zzbg);
            return zzbg;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (zzicg e) {
            if (e.zzb()) {
                throw new zzicg(e);
            }
            throw e;
        } catch (zziee e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzicg) {
                throw e3.getCause();
            }
            throw new zzicg(e3);
        }
    }

    private static zzibr zzi(zzibr zzibrVar) throws zzicg {
        if (zzibrVar == null || zzibrVar.zzbi()) {
            return zzibrVar;
        }
        throw zzibrVar.zzaU().zza();
    }

    private static zzibr zzj(zzibr zzibrVar, zzian zzianVar, zzibb zzibbVar) throws zzicg {
        zziaq zzm = zzianVar.zzm();
        zzibr zzbO = zzbO(zzibrVar, zzm, zzibbVar);
        zzm.zzb(0);
        return zzbO;
    }

    private static zzibr zzk(zzibr zzibrVar, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zziaq zzF = zziaq.zzF(new zzhzu(inputStream, zziaq.zzM(read, inputStream)), 4096);
            zzibr zzbO = zzbO(zzibrVar, zzF, zzibbVar);
            zzF.zzb(0);
            return zzbO;
        } catch (zzicg e) {
            if (e.zzb()) {
                throw new zzicg(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzicg(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzidm.zza().zzb(getClass()).zzb(this, (zzibr) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzide.zza(this, super.toString());
    }

    public int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    public void zzaR(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public int zzaT(zzidu zziduVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int zzd2 = zzd(zziduVar);
            zzaR(zzd2);
            return zzd2;
        }
        int zzd3 = zzd(zziduVar);
        if (zzd3 >= 0) {
            return zzd3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzd3).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(zzd3);
        throw new IllegalStateException(sb.toString());
    }

    public boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public int zzaZ() {
        return this.zzq;
    }

    public void zzba(int i) {
        this.zzq = i;
    }

    public void zzbb() {
        this.zzq = 0;
    }

    public boolean zzbc() {
        return zzaZ() == 0;
    }

    public final zzidk zzbd() {
        return (zzidk) zzdc(zzibq.GET_PARSER, null, null);
    }

    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final zzibr zzbw() {
        return (zzibr) zzdc(zzibq.GET_DEFAULT_INSTANCE, null, null);
    }

    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final zzibl zzcY() {
        return (zzibl) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    public zzibr zzbg() {
        return (zzibr) zzdc(zzibq.NEW_MUTABLE_INSTANCE, null, null);
    }

    public int zzbh() {
        return zzidm.zza().zzb(getClass()).zzc(this);
    }

    public final boolean zzbi() {
        return zzg(this, true);
    }

    public boolean zzbj(int i, zziaq zziaqVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i, zziaqVar);
    }

    public void zzbk(int i, int i2) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk(i << 3, Long.valueOf(i2));
    }

    public void zzbl(int i, zzian zzianVar) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk((i << 3) | 2, zzianVar);
    }

    public void zzbm() {
        zzidm.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    public final zzibl zzbn() {
        return (zzibl) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    public final zzibl zzbo(zzibr zzibrVar) {
        zzibl zzbn = zzbn();
        zzbn.zzbo(zzibrVar);
        return zzbn;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final zzibl zzcc() {
        zzibl zziblVar = (zzibl) zzdc(zzibq.NEW_BUILDER, null, null);
        zziblVar.zzbo(this);
        return zziblVar;
    }

    public void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    public int zzbr() {
        return zzaT(null);
    }

    public Object zzbs() throws Exception {
        return zzdc(zzibq.BUILD_MESSAGE_INFO, null, null);
    }

    public final void zzbx(zzieg zziegVar) {
        this.zzt = zzieg.zzc(this.zzt, zziegVar);
    }

    public void zzcX(zziaw zziawVar) throws IOException {
        zzidm.zza().zzb(getClass()).zzf(this, zziax.zza(zziawVar));
    }

    public abstract Object zzdc(zzibq zzibqVar, Object obj, Object obj2);
}
