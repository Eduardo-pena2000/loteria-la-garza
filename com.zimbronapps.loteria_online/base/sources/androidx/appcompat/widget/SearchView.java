package androidx.appcompat.widget;

import T1.Z;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import q.X;
import q.c0;
import q.g0;
import q.m0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements o.c {
    public static final o n0;
    public Rect A;
    public int[] B;
    public int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public k2.a O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public CharSequence V;
    public CharSequence W;
    public boolean a0;
    public int b0;
    public SearchableInfo c0;
    public Bundle d0;
    public final Runnable e0;
    public Runnable f0;
    public final WeakHashMap g0;
    public final View.OnClickListener h0;
    public View.OnKeyListener i0;
    public final TextView.OnEditorActionListener j0;
    public final AdapterView.OnItemClickListener k0;
    public final AdapterView.OnItemSelectedListener l0;
    public TextWatcher m0;
    public final SearchAutoComplete p;
    public final View q;
    public final View r;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public q y;
    public Rect z;

    public static class SearchAutoComplete extends q.c {
        public int e;
        public SearchView f;
        public boolean g;
        public final Runnable h;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, i.a.m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.n0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.g = false;
            }
        }

        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super/*android.view.View*/.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super/*android.view.View*/.onFocusChanged(z, i, rect);
            this.f.X();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super/*android.view.View*/.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super/*android.view.View*/.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.g = true;
                    return;
                }
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new a();
            this.e = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.W(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.d0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            k2.a aVar = SearchView.this.O;
            if (aVar instanceof X) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.z();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.t) {
                searchView.T();
                return;
            }
            if (view == searchView.v) {
                searchView.P();
                return;
            }
            if (view == searchView.u) {
                searchView.U();
            } else if (view == searchView.w) {
                searchView.Y();
            } else if (view == searchView.p) {
                searchView.F();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.c0 == null) {
                return false;
            }
            if (searchView.p.isPopupShowing() && SearchView.this.p.getListSelection() != -1) {
                return SearchView.this.V(view, i, keyEvent);
            }
            if (SearchView.this.p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.p.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.Q(i, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.R(i);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    public static class o {
        public Method a;
        public Method b;
        public Method c;

        public o() {
            this.a = null;
            this.b = null;
            this.c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", (Class[]) null);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", (Class[]) null);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends m2.a {
        public static final Parcelable.Creator CREATOR = new a();
        public boolean c;

        public class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i) {
                return new p[i];
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class q extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else if (this.b.contains(x, y)) {
                this.f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.c.contains(x, y)) {
                Rect rect = this.c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
            }
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        n0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(i.d.e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(i.d.f);
    }

    private void setQuery(CharSequence charSequence) {
        this.p.setText(charSequence);
        this.p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.c0.getSearchActivity());
        return intent;
    }

    public final Intent B(Cursor cursor, int i2, String str) {
        int i3;
        String o2;
        try {
            String o3 = X.o(cursor, "suggest_intent_action");
            if (o3 == null) {
                o3 = this.c0.getSuggestIntentAction();
            }
            if (o3 == null) {
                o3 = "android.intent.action.SEARCH";
            }
            String str2 = o3;
            String o4 = X.o(cursor, "suggest_intent_data");
            if (o4 == null) {
                o4 = this.c0.getSuggestIntentData();
            }
            if (o4 != null && (o2 = X.o(cursor, "suggest_intent_data_id")) != null) {
                o4 = o4 + "/" + Uri.encode(o2);
            }
            return A(str2, o4 == null ? null : Uri.parse(o4), X.o(cursor, "suggest_intent_extra_data"), X.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            return null;
        }
    }

    public final Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void E() {
        this.p.dismissDropDown();
    }

    public void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.p);
            return;
        }
        o oVar = n0;
        oVar.b(this.p);
        oVar.a(this.p);
    }

    public final void G(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i2 = iArr[1];
        int[] iArr2 = this.C;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    public final CharSequence H(CharSequence charSequence) {
        if (!this.M || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (this.p.getTextSize() * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean I() {
        SearchableInfo searchableInfo = this.c0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.c0.getVoiceSearchLaunchWebSearch() ? this.H : this.c0.getVoiceSearchLaunchRecognizer() ? this.I : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean J() {
        return this.N;
    }

    public final boolean L() {
        return (this.P || this.U) && !J();
    }

    public final void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    public void N(int i2, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    public final boolean O(int i2, int i3, String str) {
        Cursor d2 = this.O.d();
        if (d2 == null || !d2.moveToPosition(i2)) {
            return false;
        }
        M(B(d2, i3, str));
        return true;
    }

    public void P() {
        if (!TextUtils.isEmpty(this.p.getText())) {
            this.p.setText("");
            this.p.requestFocus();
            this.p.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            i0(true);
        }
    }

    public boolean Q(int i2, int i3, String str) {
        O(i2, 0, null);
        this.p.setImeVisibility(false);
        E();
        return true;
    }

    public boolean R(int i2) {
        a0(i2);
        return true;
    }

    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void T() {
        i0(false);
        this.p.requestFocus();
        this.p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void U() {
        Editable text = this.p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.c0 != null) {
            N(0, null, text.toString());
        }
        this.p.setImeVisibility(false);
        E();
    }

    public boolean V(View view, int i2, KeyEvent keyEvent) {
        if (this.c0 != null && this.O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return Q(this.p.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.p.setSelection(i2 == 21 ? 0 : this.p.length());
                this.p.setListSelection(0);
                this.p.clearListSelection();
                this.p.b();
                return true;
            }
            if (i2 == 19) {
                this.p.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void W(CharSequence charSequence) {
        Editable text = this.p.getText();
        this.W = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        h0(!isEmpty);
        j0(isEmpty);
        c0();
        g0();
        this.V = charSequence.toString();
    }

    public void X() {
        i0(J());
        Z();
        if (this.p.hasFocus()) {
            F();
        }
    }

    public void Y() {
        SearchableInfo searchableInfo = this.c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void Z() {
        post(this.e0);
    }

    public final void a0(int i2) {
        Editable text = this.p.getText();
        Cursor d2 = this.O.d();
        if (d2 == null) {
            return;
        }
        if (!d2.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        CharSequence b2 = this.O.b(d2);
        if (b2 != null) {
            setQuery(b2);
        } else {
            setQuery(text);
        }
    }

    public void b() {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        int imeOptions = this.p.getImeOptions();
        this.b0 = imeOptions;
        this.p.setImeOptions(imeOptions | 33554432);
        this.p.setText("");
        setIconified(false);
    }

    public void b0(CharSequence charSequence, boolean z) {
        this.p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.W = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    public final void c0() {
        boolean isEmpty = TextUtils.isEmpty(this.p.getText());
        this.v.setVisibility(!isEmpty || (this.M && !this.a0) ? 0 : 8);
        Drawable drawable = this.v.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void clearFocus() {
        this.S = true;
        super/*android.view.View*/.clearFocus();
        this.p.clearFocus();
        this.p.setImeVisibility(false);
        this.S = false;
    }

    public void d() {
        b0("", false);
        clearFocus();
        i0(true);
        this.p.setImeOptions(this.b0);
        this.a0 = false;
    }

    public void d0() {
        int[] iArr = this.p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void e0() {
        String queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    public final void f0() {
        this.p.setThreshold(this.c0.getSuggestThreshold());
        this.p.setImeOptions(this.c0.getImeOptions());
        int inputType = this.c0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.c0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.p.setInputType(inputType);
        k2.a aVar = this.O;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.c0.getSuggestAuthority() != null) {
            X x = new X(getContext(), this, this.c0, this.g0);
            this.O = x;
            this.p.setAdapter(x);
            ((X) this.O).x(this.R ? 2 : 1);
        }
    }

    public final void g0() {
        this.s.setVisibility((L() && (this.u.getVisibility() == 0 || this.w.getVisibility() == 0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.c0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public k2.a getSuggestionsAdapter() {
        return this.O;
    }

    public final void h0(boolean z) {
        this.u.setVisibility((this.P && L() && hasFocus() && (z || !this.U)) ? 0 : 8);
    }

    public final void i0(boolean z) {
        this.N = z;
        int i2 = 8;
        int i3 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i3);
        h0(!isEmpty);
        this.q.setVisibility(z ? 8 : 0);
        if (this.D.getDrawable() != null && !this.M) {
            i2 = 0;
        }
        this.D.setVisibility(i2);
        c0();
        j0(isEmpty);
        g0();
    }

    public final void j0(boolean z) {
        int i2 = 8;
        if (this.U && !J() && z) {
            this.u.setVisibility(8);
            i2 = 0;
        }
        this.w.setVisibility(i2);
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.e0);
        post(this.f0);
        super/*android.view.View*/.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            G(this.p, this.z);
            Rect rect = this.A;
            Rect rect2 = this.z;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            q qVar = this.y;
            if (qVar != null) {
                qVar.a(this.A, this.z);
                return;
            }
            q qVar2 = new q(this.A, this.z, this.p);
            this.y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        if (J()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.T;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.T) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(pVar.b());
        i0(pVar.c);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        p pVar = new p(super/*android.view.View*/.onSaveInstanceState());
        pVar.c = J();
        return pVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super/*android.view.View*/.onWindowFocusChanged(z);
        Z();
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super/*android.view.View*/.requestFocus(i2, rect);
        }
        boolean requestFocus = this.p.requestFocus(i2, rect);
        if (requestFocus) {
            i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.d0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.M == z) {
            return;
        }
        this.M = z;
        i0(z);
        e0();
    }

    public void setImeOptions(int i2) {
        this.p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.T = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.R = z;
        k2.a aVar = this.O;
        if (aVar instanceof X) {
            ((X) aVar).x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.c0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean I = I();
        this.U = I;
        if (I) {
            this.p.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.P = z;
        i0(J());
    }

    public void setSuggestionsAdapter(k2.a aVar) {
        this.O = aVar;
        this.p.setAdapter(aVar);
    }

    public void z() {
        if (this.x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = m0.b(this);
            int dimensionPixelSize = this.M ? resources.getDimensionPixelSize(i.d.c) + resources.getDimensionPixelSize(i.d.d) : 0;
            this.p.getDropDownBackground().getPadding(rect);
            this.p.setDropDownHorizontalOffset(b2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.p.setDropDownWidth((((this.x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.E);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.e0 = new b();
        this.f0 = new c();
        this.g0 = new WeakHashMap();
        f fVar = new f();
        this.h0 = fVar;
        this.i0 = new g();
        h hVar = new h();
        this.j0 = hVar;
        i iVar = new i();
        this.k0 = iVar;
        j jVar = new j();
        this.l0 = jVar;
        this.m0 = new a();
        c0 u = c0.u(context, attributeSet, i.j.f2, i2, 0);
        Z.S(this, context, i.j.f2, attributeSet, u.q(), i2, 0);
        LayoutInflater.from(context).inflate(u.m(i.j.p2, i.g.r), this, true);
        SearchAutoComplete findViewById = findViewById(i.f.D);
        this.p = findViewById;
        findViewById.setSearchView(this);
        this.q = findViewById(i.f.z);
        View findViewById2 = findViewById(i.f.C);
        this.r = findViewById2;
        View findViewById3 = findViewById(i.f.J);
        this.s = findViewById3;
        ImageView findViewById4 = findViewById(i.f.x);
        this.t = findViewById4;
        ImageView findViewById5 = findViewById(i.f.A);
        this.u = findViewById5;
        ImageView findViewById6 = findViewById(i.f.y);
        this.v = findViewById6;
        ImageView findViewById7 = findViewById(i.f.E);
        this.w = findViewById7;
        ImageView findViewById8 = findViewById(i.f.B);
        this.D = findViewById8;
        Z.X(findViewById2, u.f(i.j.q2));
        Z.X(findViewById3, u.f(i.j.u2));
        findViewById4.setImageDrawable(u.f(i.j.t2));
        findViewById5.setImageDrawable(u.f(i.j.n2));
        findViewById6.setImageDrawable(u.f(i.j.k2));
        findViewById7.setImageDrawable(u.f(i.j.w2));
        findViewById8.setImageDrawable(u.f(i.j.t2));
        this.E = u.f(i.j.s2);
        g0.a(findViewById4, getResources().getString(i.h.n));
        this.F = u.m(i.j.v2, i.g.q);
        this.G = u.m(i.j.l2, 0);
        findViewById4.setOnClickListener(fVar);
        findViewById6.setOnClickListener(fVar);
        findViewById5.setOnClickListener(fVar);
        findViewById7.setOnClickListener(fVar);
        findViewById.setOnClickListener(fVar);
        findViewById.addTextChangedListener(this.m0);
        findViewById.setOnEditorActionListener(hVar);
        findViewById.setOnItemClickListener(iVar);
        findViewById.setOnItemSelectedListener(jVar);
        findViewById.setOnKeyListener(this.i0);
        findViewById.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u.a(i.j.o2, true));
        int e2 = u.e(i.j.h2, -1);
        if (e2 != -1) {
            setMaxWidth(e2);
        }
        this.J = u.o(i.j.m2);
        this.Q = u.o(i.j.r2);
        int j2 = u.j(i.j.j2, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = u.j(i.j.i2, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(u.a(i.j.g2, true));
        u.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById9 = findViewById(findViewById.getDropDownAnchor());
        this.x = findViewById9;
        if (findViewById9 != null) {
            findViewById9.addOnLayoutChangeListener(new e());
        }
        i0(this.M);
        e0();
    }
}
