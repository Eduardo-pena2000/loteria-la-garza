package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c implements i, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public e c;
    public ExpandedMenuView d;
    public int e;
    public int f;
    public int g;
    public i.a h;
    public a i;

    public class a extends BaseAdapter {
        public int a = -1;

        public a() {
            a();
        }

        public void a() {
            g v = c.this.c.v();
            if (v != null) {
                ArrayList z = c.this.c.z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    if (((g) z.get(i)) == v) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i) {
            ArrayList z = c.this.c.z();
            int i2 = i + c.this.e;
            int i3 = this.a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (g) z.get(i2);
        }

        public int getCount() {
            int size = c.this.c.z().size() - c.this.e;
            return this.a < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.b.inflate(cVar.g, viewGroup, false);
            }
            ((j.a) view).c(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i) {
        this(i, 0);
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    public void b(e eVar, boolean z) {
        i.a aVar = this.h;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    public boolean c(e eVar, g gVar) {
        return false;
    }

    public void d(i.a aVar) {
        this.h = aVar;
    }

    public boolean e(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new f(lVar).d(null);
        i.a aVar = this.h;
        if (aVar == null) {
            return true;
        }
        aVar.c(lVar);
        return true;
    }

    public void f(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean g() {
        return false;
    }

    public boolean h(e eVar, g gVar) {
        return false;
    }

    public void i(Context context, e eVar) {
        if (this.f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f);
            this.a = contextThemeWrapper;
            this.b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = eVar;
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public j j(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = this.b.inflate(i.g.g, viewGroup, false);
            if (this.i == null) {
                this.i = new a();
            }
            this.d.setAdapter(this.i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.M(this.i.getItem(i), this, 0);
    }

    public c(int i, int i2) {
        this.g = i;
        this.f = i2;
    }
}
