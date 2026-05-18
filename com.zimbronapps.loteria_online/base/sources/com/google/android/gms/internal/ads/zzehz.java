package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzehz extends zzeia {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzdaj zzc;
    private final TelephonyManager zzd;
    private final zzehr zze;
    private zzbgj.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbgj.zzaf.zzd.zzc);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbgj.zzaf.zzd zzdVar = zzbgj.zzaf.zzd.zzb;
        sparseArray.put(ordinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbgj.zzaf.zzd.zzd);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbgj.zzaf.zzd zzdVar2 = zzbgj.zzaf.zzd.zze;
        sparseArray.put(ordinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbgj.zzaf.zzd.zzf);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzehz(Context context, zzdaj zzdajVar, zzehr zzehrVar, zzehn zzehnVar, q0 q0Var) {
        super(zzehnVar, q0Var);
        this.zzb = context;
        this.zzc = zzdajVar;
        this.zze = zzehrVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    public static final /* synthetic */ zzbgj.zzaf.zzd zze(Bundle bundle) {
        return (zzbgj.zzaf.zzd) zzg.get(zzfjz.zza(zzfjz.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbgj.zzaf.zzd.zza);
    }

    private static final zzbgj.zzq zzg(boolean z) {
        return z ? zzbgj.zzq.zzb : zzbgj.zzq.zza;
    }

    public final void zza(boolean z) {
        zzgzo.zzr(this.zzc.zza(new Bundle()), new zzehy(this, z), zzcei.zzg);
    }

    public final /* synthetic */ zzbgj.zzab zzb(Bundle bundle) {
        zzbgj.zzab.zzb zzbVar;
        zzbgj.zzab.zza zzq = zzbgj.zzab.zzq();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzf = zzbgj.zzq.zzb;
        } else {
            this.zzf = zzbgj.zzq.zza;
            if (i == 0) {
                zzq.zzc(zzbgj.zzab.zzc.zzb);
            } else if (i != 1) {
                zzq.zzc(zzbgj.zzab.zzc.zza);
            } else {
                zzq.zzc(zzbgj.zzab.zzc.zzc);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbgj.zzab.zzb.zzb;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbgj.zzab.zzb.zzc;
                    break;
                case 13:
                    zzbVar = zzbgj.zzab.zzb.zzd;
                    break;
                default:
                    zzbVar = zzbgj.zzab.zzb.zza;
                    break;
            }
            zzq.zzg(zzbVar);
        }
        return (zzbgj.zzab) zzq.zzbm();
    }

    public final /* synthetic */ byte[] zzc(boolean z, ArrayList arrayList, zzbgj.zzab zzabVar, zzbgj.zzaf.zzd zzdVar) {
        zzbgj.zzaf.zza.zza zzz = zzbgj.zzaf.zza.zzz();
        zzz.zzv(arrayList);
        Context context = this.zzb;
        zzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzz.zzN(R5.t.j().e(context, this.zzd));
        zzehr zzehrVar = this.zze;
        zzz.zzk(zzehrVar.zzf());
        zzz.zzo(zzehrVar.zzj());
        zzz.zzR(zzehrVar.zzd());
        zzz.zzZ(zzdVar);
        zzz.zzz(zzabVar);
        zzz.zzV(this.zzf);
        zzz.zzg(zzg(z));
        zzz.zzad(zzehrVar.zzb());
        zzz.zzc(R5.t.o().a());
        zzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return ((zzbgj.zzaf.zza) zzz.zzbm()).zzaN();
    }

    public final /* synthetic */ zzehr zzd() {
        return this.zze;
    }
}
