package androidx.appcompat.app;

import T1.Z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import i.f;
import i.j;
import j.p;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler R;
    public final Context a;
    public final p b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public ListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;
    public boolean n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {
        public final int a;
        public final int b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c2);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(j.d2, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(j.e2, -1);
        }

        public void a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.a, getPaddingRight(), z2 ? getPaddingBottom() : this.b);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.o || (message3 = alertController.q) == null) ? (view != alertController.s || (message2 = alertController.u) == null) ? (view != alertController.w || (message = alertController.y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public final Context a;
        public final LayoutInflater b;
        public Drawable d;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public Drawable j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;
        public int c = 0;
        public int e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;
        public boolean r = true;

        public class a extends ArrayAdapter {
            public final /* synthetic */ RecycleListView a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.a = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i]) {
                    this.a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        public class b extends CursorAdapter {
            public final int a;
            public final int b;
            public final /* synthetic */ RecycleListView c;
            public final /* synthetic */ AlertController d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.c = recycleListView;
                this.d = alertController;
                Cursor cursor2 = getCursor();
                this.a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                view.findViewById(16908308).setText(cursor.getString(this.a));
                this.c.setItemChecked(cursor.getPosition(), cursor.getInt(this.b) == 1);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.b.inflate(this.d.M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AlertController a;

            public c(AlertController alertController) {
                this.a = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                b.this.x.onClick(this.a.b, i);
                if (b.this.H) {
                    return;
                }
                this.a.b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {
            public final /* synthetic */ RecycleListView a;
            public final /* synthetic */ AlertController b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.a = recycleListView;
                this.b = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i] = this.a.isItemChecked(i);
                }
                b.this.J.onClick(this.b.b, i, this.a.isItemChecked(i));
            }
        }

        public b(Context context) {
            this.a = context;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            View view = this.g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i = this.c;
                if (i != 0) {
                    alertController.l(i);
                }
                int i2 = this.e;
                if (i2 != 0) {
                    alertController.l(alertController.c(i2));
                }
            }
            CharSequence charSequence2 = this.h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.i;
            if (charSequence3 != null || this.j != null) {
                alertController.j(-1, charSequence3, this.k, null, this.j);
            }
            CharSequence charSequence4 = this.l;
            if (charSequence4 != null || this.m != null) {
                alertController.j(-2, charSequence4, this.n, null, this.m);
            }
            CharSequence charSequence5 = this.o;
            if (charSequence5 != null || this.p != null) {
                alertController.j(-3, charSequence5, this.q, null, this.p);
            }
            if (this.v != null || this.K != null || this.w != null) {
                b(alertController);
            }
            View view2 = this.z;
            if (view2 != null) {
                if (this.E) {
                    alertController.s(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i3 = this.y;
            if (i3 != 0) {
                alertController.q(i3);
            }
        }

        public final void b(AlertController alertController) {
            ListAdapter listAdapter;
            RecycleListView inflate = this.b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                listAdapter = this.K == null ? new a(this.a, alertController.M, 16908308, this.v, inflate) : new b(this.a, this.K, false, inflate, alertController);
            } else {
                int i = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.a, i, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    listAdapter = this.w;
                    if (listAdapter == null) {
                        listAdapter = new d(this.a, i, 16908308, this.v);
                    }
                }
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.x != null) {
                inflate.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                inflate.setOnItemClickListener(new d(inflate, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                inflate.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                inflate.setChoiceMode(1);
            } else if (this.G) {
                inflate.setChoiceMode(2);
            }
            alertController.g = inflate;
        }
    }

    public static final class c extends Handler {
        public WeakReference a;

        public c(DialogInterface dialogInterface) {
            this.a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter {
        public d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, p pVar, Window window) {
        this.a = context;
        this.b = pVar;
        this.c = window;
        this.R = new c(pVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.F, i.a.k, 0);
        this.J = obtainStyledAttributes.getResourceId(j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(j.M, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        obtainStyledAttributes.recycle();
        pVar.i(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.j, typedValue, true);
        return typedValue.data != 0;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public int c(int i) {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.g;
    }

    public void e() {
        this.b.setContentView(i());
        x();
    }

    public boolean f(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public final ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewGroup parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                parent.removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int i() {
        int i = this.K;
        return i == 0 ? this.J : this.Q == 1 ? i : this.J;
    }

    public void j(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.p = charSequence;
            this.q = message;
            this.r = drawable;
        }
    }

    public void k(View view) {
        this.G = view;
    }

    public void l(int i) {
        this.C = null;
        this.B = i;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void o(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.c.findViewById(f.v);
        View findViewById2 = this.c.findViewById(f.u);
        Z.i0(view, i, i2);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    public void p(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i) {
        this.h = null;
        this.i = i;
        this.n = false;
    }

    public void r(View view) {
        this.h = view;
        this.i = 0;
        this.n = false;
    }

    public void s(View view, int i, int i2, int i3, int i4) {
        this.h = view;
        this.i = 0;
        this.n = true;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    public final void t(ViewGroup viewGroup) {
        int i;
        Button findViewById = viewGroup.findViewById(16908313);
        this.o = findViewById;
        findViewById.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.p) && this.r == null) {
            this.o.setVisibility(8);
            i = 0;
        } else {
            this.o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int i2 = this.d;
                drawable.setBounds(0, 0, i2, i2);
                this.o.setCompoundDrawables(this.r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.o.setVisibility(0);
            i = 1;
        }
        Button findViewById2 = viewGroup.findViewById(16908314);
        this.s = findViewById2;
        findViewById2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.t) && this.v == null) {
            this.s.setVisibility(8);
        } else {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i3 = this.d;
                drawable2.setBounds(0, 0, i3, i3);
                this.s.setCompoundDrawables(this.v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.s.setVisibility(0);
            i |= 2;
        }
        Button findViewById3 = viewGroup.findViewById(16908315);
        this.w = findViewById3;
        findViewById3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.x) && this.z == null) {
            this.w.setVisibility(8);
        } else {
            this.w.setText(this.x);
            Drawable drawable3 = this.z;
            if (drawable3 != null) {
                int i4 = this.d;
                drawable3.setBounds(0, 0, i4, i4);
                this.w.setCompoundDrawables(this.z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.w.setVisibility(0);
            i |= 4;
        }
        if (y(this.a)) {
            if (i == 1) {
                b(this.o);
            } else if (i == 2) {
                b(this.s);
            } else if (i == 4) {
                b(this.w);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void u(ViewGroup viewGroup) {
        NestedScrollView findViewById = this.c.findViewById(f.w);
        this.A = findViewById;
        findViewById.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView findViewById2 = viewGroup.findViewById(16908299);
        this.F = findViewById2;
        if (findViewById2 == null) {
            return;
        }
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            findViewById2.setText(charSequence);
            return;
        }
        findViewById2.setVisibility(8);
        this.A.removeView(this.F);
        if (this.g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup parent = this.A.getParent();
        int indexOfChild = parent.indexOfChild(this.A);
        parent.removeViewAt(indexOfChild);
        parent.addView(this.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void v(ViewGroup viewGroup) {
        View view = this.h;
        if (view == null) {
            view = this.i != 0 ? LayoutInflater.from(this.a).inflate(this.i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !a(view)) {
            this.c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout findViewById = this.c.findViewById(f.n);
        findViewById.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.n) {
            findViewById.setPadding(this.j, this.k, this.l, this.m);
        }
        if (this.g != null) {
            ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
        }
    }

    public final void w(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.c.findViewById(f.O).setVisibility(8);
            return;
        }
        this.D = this.c.findViewById(16908294);
        if (TextUtils.isEmpty(this.e) || !this.P) {
            this.c.findViewById(f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView findViewById = this.c.findViewById(f.j);
        this.E = findViewById;
        findViewById.setText(this.e);
        int i = this.B;
        if (i != 0) {
            this.D.setImageResource(i);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.c.findViewById(f.t);
        View findViewById4 = findViewById3.findViewById(f.P);
        View findViewById5 = findViewById3.findViewById(f.m);
        View findViewById6 = findViewById3.findViewById(f.k);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(f.o);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(f.P);
        View findViewById8 = viewGroup.findViewById(f.m);
        View findViewById9 = viewGroup.findViewById(f.k);
        ViewGroup h = h(findViewById7, findViewById4);
        ViewGroup h2 = h(findViewById8, findViewById5);
        ViewGroup h3 = h(findViewById9, findViewById6);
        u(h2);
        t(h3);
        w(h);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (h == null || h.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (h3 == null || h3.getVisibility() == 8) ? false : true;
        if (!z3 && h2 != null && (findViewById2 = h2.findViewById(f.K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f == null && this.g == null) ? null : h.findViewById(f.N);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (h2 != null && (findViewById = h2.findViewById(f.L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z2, z3);
        }
        if (!z) {
            NestedScrollView nestedScrollView2 = this.g;
            if (nestedScrollView2 == null) {
                nestedScrollView2 = this.A;
            }
            if (nestedScrollView2 != null) {
                o(h2, nestedScrollView2, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.I;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }
}
