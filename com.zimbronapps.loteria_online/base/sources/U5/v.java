package U5;

import V5.F0;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v extends V5.B {
    public final /* synthetic */ z a;

    public /* synthetic */ v(z zVar, byte[] bArr) {
        Objects.requireNonNull(zVar);
        this.a = zVar;
    }

    public final void zza() {
        BitmapDrawable bitmapDrawable;
        z zVar = this.a;
        Bitmap a = R5.t.C().a(Integer.valueOf(zVar.b.o.f));
        if (a != null) {
            R5.t.g();
            R5.l lVar = zVar.b.o;
            boolean z = lVar.d;
            float f = lVar.e;
            Activity activity = zVar.a;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, a.getWidth(), a.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
                }
            }
            F0.l.post(new u(this, bitmapDrawable));
        }
    }
}
