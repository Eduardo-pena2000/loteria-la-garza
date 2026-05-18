package com.google.android.gms.internal.firebase-auth-api;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzmy {
    private static final Object zza = new Object();
    private static final String zzb = "zzmy";
    private zzbw zzc;

    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzba zze = null;
        private boolean zzf = true;
        private zzbj zzg = null;
        private zzxb zzh = null;
        private zzbw zzi;

        public static /* bridge */ /* synthetic */ Context zza(zza zzaVar) {
            return zzaVar.zza;
        }

        public static /* bridge */ /* synthetic */ zzbw zzb(zza zzaVar) {
            return zzaVar.zzi;
        }

        public static /* bridge */ /* synthetic */ String zzc(zza zzaVar) {
            return zzaVar.zzb;
        }

        public static /* bridge */ /* synthetic */ String zzd(zza zzaVar) {
            return zzaVar.zzc;
        }

        private static zzbw zza(byte[] bArr) throws GeneralSecurityException, IOException {
            return zzbw.zza(zzbz.zza(zzaz.zza(bArr), zzbf.zza()));
        }

        private final zzba zzb() throws GeneralSecurityException {
            zzmy.zzd();
            zznd zzndVar = new zznd();
            try {
                boolean zzc = zznd.zzc(this.zzd);
                try {
                    return zzndVar.zza(this.zzd);
                } catch (ProviderException | GeneralSecurityException e) {
                    if (!zzc) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.zzd}), e);
                    }
                    Log.w(zzmy.zzc(), "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            } catch (ProviderException | GeneralSecurityException e2) {
                Log.w(zzmy.zzc(), "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
        }

        public final zza zza(zzxb zzxbVar) {
            this.zzh = zzxbVar;
            return this;
        }

        public final zza zza(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.zzf) {
                    this.zzd = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        private final zzbw zzb(byte[] bArr) throws GeneralSecurityException, IOException {
            try {
                this.zze = new zznd().zza(this.zzd);
                try {
                    return zzbw.zza(zzbm.zza(zzaz.zza(bArr), this.zze, new byte[0]));
                } catch (GeneralSecurityException | IOException e) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e;
                    }
                }
            } catch (ProviderException | GeneralSecurityException e2) {
                try {
                    zzbw zza = zza(bArr);
                    Log.w(zzmy.zzc(), "cannot use Android Keystore, it'll be disabled", e2);
                    return zza;
                } catch (IOException unused2) {
                    throw e2;
                }
            }
        }

        public final zza zza(Context context, String str, String str2) throws IOException {
            if (context != null) {
                this.zza = context;
                this.zzb = str;
                this.zzc = str2;
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public final synchronized zzmy zza() throws GeneralSecurityException, IOException {
            zzmy zzmyVar;
            try {
                if (this.zzb != null) {
                    zzxb zzxbVar = this.zzh;
                    if (zzxbVar != null && this.zzg == null) {
                        this.zzg = zzbj.zza(zzcj.zza(zzxbVar.zzk()));
                    }
                    synchronized (zzmy.zzb()) {
                        try {
                            byte[] zzb = zzb(this.zza, this.zzb, this.zzc);
                            if (zzb == null) {
                                if (this.zzd != null) {
                                    this.zze = zzb();
                                }
                                zzbj zzbjVar = this.zzg;
                                if (zzbjVar != null) {
                                    zzbm zza = zzbm.zza(zzbjVar);
                                    zzmy.zza(zza, new zznf(this.zza, this.zzb, this.zzc), this.zze);
                                    this.zzi = zzbw.zza(zza);
                                } else {
                                    throw new GeneralSecurityException("cannot read or generate keyset");
                                }
                            } else if (this.zzd != null) {
                                zzmy.zzd();
                                this.zzi = zzb(zzb);
                            } else {
                                this.zzi = zza(zzb);
                            }
                            zzmyVar = new zzmy(this, null);
                        } finally {
                        }
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            } catch (Throwable th) {
                throw th;
            }
            return zzmyVar;
        }

        private static byte[] zzb(Context context, String str, String str2) throws IOException {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, (String) null);
                    if (string == null) {
                        return null;
                    }
                    return zzzx.zza(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{str}));
                }
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public /* synthetic */ zzmy(zza zzaVar, zzna zznaVar) {
        this(zzaVar);
    }

    public static /* bridge */ /* synthetic */ Object zzb() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ String zzc() {
        return zzb;
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbm zza() throws GeneralSecurityException {
        return this.zzc.zza();
    }

    private zzmy(zza zzaVar) {
        new zznf(zza.zza(zzaVar), zza.zzc(zzaVar), zza.zzd(zzaVar));
        this.zzc = zza.zzb(zzaVar);
    }

    public static /* synthetic */ void zza(zzbm zzbmVar, zzby zzbyVar, zzba zzbaVar) {
        try {
            if (zzbaVar != null) {
                zzbmVar.zza(zzbyVar, zzbaVar, new byte[0]);
            } else {
                zzbz.zza(zzbmVar, zzbyVar, zzbf.zza());
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
