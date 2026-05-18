package v6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class o extends androidx.fragment.app.n {
    public Dialog q;
    public DialogInterface.OnCancelListener r;
    public Dialog s;

    public static o c0(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        o oVar = new o();
        Dialog dialog2 = (Dialog) com.google.android.gms.common.internal.t.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        oVar.q = dialog2;
        if (onCancelListener != null) {
            oVar.r = onCancelListener;
        }
        return oVar;
    }

    public Dialog V(Bundle bundle) {
        Dialog dialog = this.q;
        if (dialog != null) {
            return dialog;
        }
        Z(false);
        if (this.s == null) {
            this.s = new AlertDialog.Builder((Context) com.google.android.gms.common.internal.t.l(getContext())).create();
        }
        return this.s;
    }

    public void b0(androidx.fragment.app.J j, String str) {
        super.b0(j, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
