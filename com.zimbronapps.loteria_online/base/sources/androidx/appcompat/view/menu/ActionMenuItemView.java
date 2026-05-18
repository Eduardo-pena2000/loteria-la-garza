package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import q.B;
import q.P;
import q.g0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ActionMenuItemView extends B implements j.a, View.OnClickListener, ActionMenuView.a {
    public g h;
    public CharSequence i;
    public Drawable j;
    public e.b k;
    public P l;
    public b m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;

    public class a extends P {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p.f b() {
            b bVar = ActionMenuItemView.this.m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        public boolean c() {
            p.f b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.k;
            return bVar != null && bVar.c(actionMenuItemView.h) && (b = b()) != null && b.a();
        }
    }

    public static abstract class b {
        public abstract p.f a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        return r();
    }

    public boolean b() {
        return r() && this.h.getIcon() == null;
    }

    public void c(g gVar, int i) {
        this.h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.l == null) {
            this.l = new a();
        }
    }

    public boolean d() {
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public g getItemData() {
        return this.h;
    }

    public void onClick(View view) {
        e.b bVar = this.k;
        if (bVar != null) {
            bVar.c(this.h);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        this.n = s();
        t();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean r = r();
        if (r && (i3 = this.q) >= 0) {
            super/*android.view.View*/.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.p) : this.p;
        if (mode != 1073741824 && this.p > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (r || this.j == null) {
            return;
        }
        super/*android.view.View*/.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super/*android.view.View*/.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        P p;
        if (this.h.hasSubMenu() && (p = this.l) != null && p.onTouch(this, motionEvent)) {
            return true;
        }
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.o != z) {
            this.o = z;
            g gVar = this.h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.r;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(e.b bVar) {
        this.k = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.q = i;
        super/*android.view.View*/.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        t();
    }

    public final void t() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.i);
        if (this.j != null && (!this.h.B() || (!this.n && !this.o))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.i : null);
        CharSequence contentDescription = this.h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            g0.a(this, z3 ? null : this.h.getTitle());
        } else {
            g0.a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.n = s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.v, i, 0);
        this.p = obtainStyledAttributes.getDimensionPixelSize(i.j.w, 0);
        obtainStyledAttributes.recycle();
        this.r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.q = -1;
        setSaveEnabled(false);
    }
}
