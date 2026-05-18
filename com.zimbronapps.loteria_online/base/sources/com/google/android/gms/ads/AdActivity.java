package com.google.android.gms.ads;

import N6.b;
import S5.B;
import W5.p;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbxs;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AdActivity extends Activity {
    public zzbxs a;

    public final void a() {
        zzbxs zzbxsVar = this.a;
        if (zzbxsVar != null) {
            try {
                zzbxsVar.zzs();
            } catch (RemoteException e) {
                p.i("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzm(i, i2, intent);
            }
        } catch (Exception e) {
            p.i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                if (!zzbxsVar.zzg()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbxs zzbxsVar2 = this.a;
            if (zzbxsVar2 != null) {
                zzbxsVar2.zze();
            }
        } catch (RemoteException e2) {
            p.i("#007 Could not call remote method.", e2);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzn(b.s1(configuration));
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a("AdActivity onCreate");
        zzbxs g = B.b().g(this);
        this.a = g;
        if (g == null) {
            p.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            g.zzh(bundle);
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    public final void onDestroy() {
        p.a("AdActivity onDestroy");
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzq();
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    public final void onPause() {
        p.a("AdActivity onPause");
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzl();
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzH(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onRestart() {
        super.onRestart();
        p.a("AdActivity onRestart");
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzi();
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    public final void onResume() {
        p.a("AdActivity onResume");
        super.onResume();
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzk();
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzo(bundle);
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        super.onStart();
        p.a("AdActivity onStart");
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzj();
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    public final void onStop() {
        p.a("AdActivity onStop");
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzp();
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbxs zzbxsVar = this.a;
            if (zzbxsVar != null) {
                zzbxsVar.zzf();
            }
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
