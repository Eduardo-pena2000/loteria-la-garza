package P0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements m0 {
    public final ClipboardManager a;

    public f(ClipboardManager clipboardManager) {
        this.a = clipboardManager;
    }

    public Z0.e a() {
        ClipData primaryClip = this.a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return g.a(itemAt != null ? itemAt.getText() : null);
    }

    public boolean b() {
        ClipDescription primaryClipDescription = this.a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void c(Z0.e eVar) {
        this.a.setPrimaryClip(ClipData.newPlainText("plain text", g.b(eVar)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
