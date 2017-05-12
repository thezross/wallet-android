package com.learningmachine.android.app.ui.cert;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.learningmachine.android.app.ui.LMSingleFragmentActivity;

public class CertificateInfoActivity extends LMSingleFragmentActivity {

    private static final String EXTRA_CERTIFICATE_UUID = "CertificateInfoActivity.CertificateUuid";

    public static Intent newIntent(Context context, String uuid) {
        Intent intent = new Intent(context, CertificateInfoActivity.class);
        intent.putExtra(EXTRA_CERTIFICATE_UUID, uuid);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        String certificateUuid = getIntent().getStringExtra(EXTRA_CERTIFICATE_UUID);
        return CertificateInfoFragment.newInstance(certificateUuid);
    }

    @Override
    protected boolean requiresBackNavigation() {
        return true;
    }
}
