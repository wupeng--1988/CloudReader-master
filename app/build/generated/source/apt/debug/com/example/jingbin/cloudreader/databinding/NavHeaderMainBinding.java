package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class NavHeaderMainBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_header_bg, 3);
        sViewsWithIds.put(R.id.iv_avatar, 4);
        sViewsWithIds.put(R.id.tv_username, 5);
        sViewsWithIds.put(R.id.tv_level, 6);
        sViewsWithIds.put(R.id.ll_nav_homepage, 7);
        sViewsWithIds.put(R.id.ll_nav_scan_download, 8);
        sViewsWithIds.put(R.id.ll_nav_deedback, 9);
        sViewsWithIds.put(R.id.ll_nav_about, 10);
        sViewsWithIds.put(R.id.line, 11);
        sViewsWithIds.put(R.id.ll_nav_login, 12);
        sViewsWithIds.put(R.id.ll_nav_exit, 13);
    }
    // views
    public final android.support.v7.widget.SwitchCompat dayNightSwitch;
    public final android.widget.ImageView ivAvatar;
    public final android.view.View line;
    public final android.widget.LinearLayout llHeaderBg;
    public final android.widget.LinearLayout llNavAbout;
    public final android.widget.LinearLayout llNavDeedback;
    public final android.widget.LinearLayout llNavExit;
    public final android.widget.LinearLayout llNavHomepage;
    public final android.widget.LinearLayout llNavLogin;
    public final android.widget.LinearLayout llNavScanDownload;
    private final android.support.v4.widget.NestedScrollView mboundView0;
    private final android.widget.LinearLayout mboundView1;
    public final android.widget.TextView tvLevel;
    public final android.widget.TextView tvUsername;
    // variables
    private com.example.jingbin.cloudreader.MainActivity mListener;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    // Inverse Binding Event Handlers

    public NavHeaderMainBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds);
        this.dayNightSwitch = (android.support.v7.widget.SwitchCompat) bindings[2];
        this.dayNightSwitch.setTag(null);
        this.ivAvatar = (android.widget.ImageView) bindings[4];
        this.line = (android.view.View) bindings[11];
        this.llHeaderBg = (android.widget.LinearLayout) bindings[3];
        this.llNavAbout = (android.widget.LinearLayout) bindings[10];
        this.llNavDeedback = (android.widget.LinearLayout) bindings[9];
        this.llNavExit = (android.widget.LinearLayout) bindings[13];
        this.llNavHomepage = (android.widget.LinearLayout) bindings[7];
        this.llNavLogin = (android.widget.LinearLayout) bindings[12];
        this.llNavScanDownload = (android.widget.LinearLayout) bindings[8];
        this.mboundView0 = (android.support.v4.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tvLevel = (android.widget.TextView) bindings[6];
        this.tvUsername = (android.widget.TextView) bindings[5];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.listener :
                setListener((com.example.jingbin.cloudreader.MainActivity) variable);
                return true;
        }
        return false;
    }

    public void setListener(com.example.jingbin.cloudreader.MainActivity listener) {
        this.mListener = listener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.MainActivity getListener() {
        return mListener;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.jingbin.cloudreader.MainActivity listener = mListener;
        boolean getNightModeListener = false;
        android.view.View.OnClickListener androidViewViewOnCli = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (listener != null) {
                    // read listener.getNightMode
                    getNightModeListener = listener.getNightMode();
                    // read listener::onNightModeClick
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.dayNightSwitch, getNightModeListener);
            this.mboundView1.setOnClickListener(androidViewViewOnCli);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.jingbin.cloudreader.MainActivity value;
        public OnClickListenerImpl setValue(com.example.jingbin.cloudreader.MainActivity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onNightModeClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static NavHeaderMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static NavHeaderMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<NavHeaderMainBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.nav_header_main, root, attachToRoot, bindingComponent);
    }
    public static NavHeaderMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static NavHeaderMainBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.nav_header_main, null, false), bindingComponent);
    }
    public static NavHeaderMainBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static NavHeaderMainBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/nav_header_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new NavHeaderMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): listener
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}