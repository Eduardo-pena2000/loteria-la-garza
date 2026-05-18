package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import j.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends p implements DialogInterface {
    public final AlertController f;

    public static class a {
        public final AlertController.b a;
        public final int b;

        public a(Context context) {
            this(context, a.l(context, 0));
        }

        public a a() {
            a aVar = new a(this.a.a, this.b);
            this.a.a(aVar.f);
            aVar.setCancelable(this.a.r);
            if (this.a.r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.a.s);
            aVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.a.g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public a f(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a g(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public a(Context context, int i) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, a.l(context, i)));
            this.b = i;
        }
    }

    public a(Context context, int i) {
        super(context, l(context, i));
        this.f = new AlertController(getContext(), this, getWindow());
    }

    public static int l(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView k() {
        return this.f.d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f.e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f.f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f.p(charSequence);
    }
}
