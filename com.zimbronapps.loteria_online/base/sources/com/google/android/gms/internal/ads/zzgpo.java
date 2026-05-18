package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgpo {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgqg zzc = new zzgqg("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzgqf zza;
    private final String zze;

    public zzgpo(Context context) {
        if (zzgqi.zza(context)) {
            this.zza = new zzgqf(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, zzgoz.zza);
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    private static boolean zzh(String str) {
        return zzgrt.zza(str).trim().isEmpty();
    }

    private static void zzi(String str, zzgpn zzgpnVar) {
        if (zzh(str)) {
            return;
        }
        str.getClass();
        zzgpnVar.zza(str.trim());
    }

    private static boolean zzj(zzgpt zzgptVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zzh((String) it.next())) {
                return true;
            }
        }
        zzc.zzc(str, new Object[0]);
        zzgpr zzd2 = zzgps.zzd();
        zzd2.zzc(0);
        zzd2.zza(8160);
        zzgptVar.zza(zzd2.zzd());
        return false;
    }

    public final void zza(zzgpq zzgpqVar, zzgpt zzgptVar) {
        zzgqf zzgqfVar = this.zza;
        if (zzgqfVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgptVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(new String[]{null, zzgpqVar.zzb()}))) {
            zzgqfVar.zza(new zzgpl(this, zzgpqVar, zzgptVar));
        }
    }

    public final void zzb(zzgov zzgovVar, zzgpt zzgptVar) {
        zzgqf zzgqfVar = this.zza;
        if (zzgqfVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgptVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(new String[]{zzgovVar.zza(), zzgovVar.zzb()}))) {
            zzgqfVar.zza(new zzgpa(this, zzgovVar, zzgptVar));
        }
    }

    public final void zzc(zzgpv zzgpvVar, zzgpt zzgptVar, int i) {
        zzgqf zzgqfVar = this.zza;
        if (zzgqfVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgptVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(new String[]{zzgpvVar.zza(), zzgpvVar.zzb()}))) {
            zzgqfVar.zza(new zzgpc(this, zzgpvVar, i, zzgptVar));
        }
    }

    public final void zzd() {
        zzgqf zzgqfVar = this.zza;
        if (zzgqfVar == null) {
            return;
        }
        zzc.zza("unbind LMD display overlay service", new Object[0]);
        zzgqfVar.zzb();
    }

    public final /* synthetic */ void zze(zzgpq zzgpqVar, zzgpt zzgptVar) {
        try {
            zzgqf zzgqfVar = this.zza;
            if (zzgqfVar == null) {
                throw null;
            }
            zzgoj zzgojVar = (zzgoj) zzgqfVar.zzc();
            if (zzgojVar == null) {
                return;
            }
            String str = this.zze;
            Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzgpqVar.zza());
            zzi(zzgpqVar.zzj(), new zzgpd(bundle));
            bundle.putInt("layoutGravity", zzgpqVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzgpqVar.zzd());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzgpqVar.zzh());
            zzi(null, new zzgpe(bundle));
            zzi(null, new zzgpf(bundle));
            zzi(zzgpqVar.zzb(), new zzgpg(bundle));
            zzi(null, new zzgph(bundle));
            bundle.putBoolean("stableSessionToken", true);
            zzgojVar.zze(str, bundle, new zzgpm(this, zzgptVar));
        } catch (RemoteException e) {
            zzc.zzd(e, "show overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzf(zzgov zzgovVar, zzgpt zzgptVar) {
        try {
            zzgqf zzgqfVar = this.zza;
            if (zzgqfVar == null) {
                throw null;
            }
            zzgoj zzgojVar = (zzgoj) zzgqfVar.zzc();
            if (zzgojVar == null) {
                return;
            }
            String str = this.zze;
            Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzgovVar.zza(), new zzgpi(bundle));
            zzi(zzgovVar.zzb(), new zzgpj(bundle));
            zzgojVar.zzf(bundle, new zzgpm(this, zzgptVar));
        } catch (RemoteException e) {
            zzc.zzd(e, "dismiss overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzg(zzgpv zzgpvVar, int i, zzgpt zzgptVar) {
        try {
            zzgqf zzgqfVar = this.zza;
            if (zzgqfVar == null) {
                throw null;
            }
            zzgoj zzgojVar = (zzgoj) zzgqfVar.zzc();
            if (zzgojVar == null) {
                return;
            }
            String str = this.zze;
            Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i);
            zzi(zzgpvVar.zza(), new zzgpk(bundle));
            zzi(zzgpvVar.zzb(), new zzgpb(bundle));
            zzgojVar.zzg(bundle, new zzgpm(this, zzgptVar));
        } catch (RemoteException e) {
            zzc.zzd(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), this.zze);
        }
    }
}
